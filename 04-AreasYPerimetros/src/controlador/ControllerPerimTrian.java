package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewPerimTrian;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerPerimTrian implements ActionListener{
	private ViewPerimTrian viewPerimTrian = new ViewPerimTrian();
	private ModellCalculos modellCalculos = new ModellCalculos();
	/**
	 * 
	 * @param viewPerimTrian establece el objeto de la clase ViewPerimTiran
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerPerimTrian(ViewPerimTrian viewPerimTrian, ModellCalculos modellCalculos) {
		this.viewPerimTrian=viewPerimTrian;
		this.modellCalculos = modellCalculos;
		
		viewPerimTrian.onClickCalcuar(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			String cadena1 = viewPerimTrian.getTxtLado1();
			String cadena2 = viewPerimTrian.getTxtLado2();
			String cadena3 = viewPerimTrian.getTxtLado3();
			
			double lado1 = Double.parseDouble(cadena1);
			double lado2 = Double.parseDouble(cadena2);
			double lado3 = Double.parseDouble(cadena3);
			
			String typeAction = null;
			
			if (cadena1.indexOf(".") >= 0 || cadena2.indexOf(".") >= 0 || cadena3.indexOf(".") >= 0) {
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if (e.getSource() == viewPerimTrian.getBtnCalcular()) {
				modellCalculos.perimTrian(lado1, lado2, lado3);
				switch (typeAction) {
				case "1":
					viewPerimTrian.setLbRespueta(String.format("%f m", modellCalculos.getRespuestaD()));
				break;
	
				case "2":
					viewPerimTrian.setLbRespueta(String.format("%d m", (int)modellCalculos.getRespuestaD()));
				break;
				}
			}
		} catch (NumberFormatException e2) {
			viewPerimTrian.mensajeError("Solo numeros");
			viewPerimTrian.limpiar();
		} catch (ArithmeticException e2) {
			viewPerimTrian.mensajeError("Dividido entre cero");
			viewPerimTrian.limpiar();
		}
			
			

		
	}
}
