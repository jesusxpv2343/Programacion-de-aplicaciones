package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewAreaTrian;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerAreaTrian implements ActionListener {
	private ViewAreaTrian viewAreaTrian = new ViewAreaTrian();
	private ModellCalculos modelCalculos = new ModellCalculos();
	
	/**
	 * 
	 * @param viewAreaTrian establece objeto de la clase ViewAreaTrias
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerAreaTrian(ViewAreaTrian viewAreaTrian, ModellCalculos modellCalculos) {
		this.viewAreaTrian = viewAreaTrian;
		this.modelCalculos = modellCalculos;
		
		viewAreaTrian.onClickCalcuar(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String cadena1 = viewAreaTrian.getTxtBase();
			String cadena2 = viewAreaTrian.getTxtAltura();
			String typeAction = null;
			
			double base = Double.parseDouble(cadena1);
			double altura = Double.parseDouble(cadena2);
			
			if(cadena1.indexOf(".") >= 0 || cadena2.indexOf(".") >= 0){
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if(e.getSource() == viewAreaTrian.getBtnCalcuar()){
				modelCalculos.areaTrian(base, altura);
				switch (typeAction) {
					case "1":
						viewAreaTrian.setLbRespueta(String.format("%f m²", modelCalculos.getRespuestaD()));
					break;
		
					case "2":
						viewAreaTrian.setLbRespueta(String.format("%d m²", (int) modelCalculos.getRespuestaD()));
					break;
				}
			}
		} catch (NumberFormatException a) {
			viewAreaTrian.mensajeError("Solo numeros");
			viewAreaTrian.limpiar();
		} catch (ArithmeticException a) {
			viewAreaTrian.mensajeError("Dividido entre cero");
			viewAreaTrian.limpiar();
		}		
	}

}
