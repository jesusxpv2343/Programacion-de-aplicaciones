package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewPerimRect;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerPerimRect implements ActionListener{
	private ViewPerimRect viewPerimRect = new ViewPerimRect();
	private ModellCalculos modellCalculos = new ModellCalculos();
	/**
	 * 
	 * @param viewPerimRect establece el objeto de la clase ViewPerimRect
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerPerimRect(ViewPerimRect viewPerimRect, ModellCalculos modellCalculos) {
		this.viewPerimRect=viewPerimRect;
		this.modellCalculos = modellCalculos;
		
		viewPerimRect.onClickCalcuar(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			String cadena1 = viewPerimRect.getTxtBase();
			String cadena2 = viewPerimRect.getTxtAltura();
			double base = Double.parseDouble(cadena1);
			double altura = Double.parseDouble(cadena2);
			String typeAction = null;
			
			if (cadena1.indexOf(".") >= 0 || cadena2.indexOf(".") >= 0) {
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if (e.getSource() == viewPerimRect.getBtnCalcular()) {
				modellCalculos.perimRect(base, altura);
				switch (typeAction) {
				case "1":
					viewPerimRect.setLbRespueta(String.format("%f m", modellCalculos.getRespuestaD()));
				break;
	
				case "2":
					viewPerimRect.setLbRespueta(String.format("%d m", (int)modellCalculos.getRespuestaD()));
				break;
				}
			}
		} catch (NumberFormatException e2) {
			viewPerimRect.mensajeError("Solo numeros");
			viewPerimRect.limpiar();
		} catch (ArithmeticException e2) {
			viewPerimRect.mensajeError("Dividido entre cero");
			viewPerimRect.limpiar();
		}
	}

}
