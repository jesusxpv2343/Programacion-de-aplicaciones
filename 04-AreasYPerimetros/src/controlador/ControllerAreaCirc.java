package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewAreaCirc;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerAreaCirc implements ActionListener{
	private ViewAreaCirc viewAreaCirc = new ViewAreaCirc();
	private ModellCalculos modelCalculos = new ModellCalculos();
	/**
	 * 
	 * @param viewAreaCirc establece objeto de la clase viewAreaCirc
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerAreaCirc(ViewAreaCirc viewAreaCirc, ModellCalculos modellCalculos) {
		this.viewAreaCirc=viewAreaCirc;
		this.modelCalculos=modellCalculos;
		
		viewAreaCirc.onClickCalcuar(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			String cadena = viewAreaCirc.getTxtRadio();
			Double cadenaD = Double.parseDouble(cadena);
			String typeAction = null;
			
			if (cadena.indexOf(".") >= 0) {
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			if (e.getSource() == viewAreaCirc.getBtnCalcuar()) {
				modelCalculos.areaCirc(cadenaD);
				switch (typeAction) {
					case "1":
						viewAreaCirc.setLbRespueta(String.format("%f m²", modelCalculos.getRespuestaD()));
					break;
		
					case "2":
						viewAreaCirc.setLbRespueta(String.format("%d m²", (int) modelCalculos.getRespuestaD()));
					break;
				}
			}
		} catch (NumberFormatException e2) {
			viewAreaCirc.mensajeError("Solo numeros");
			viewAreaCirc.limpiar();
		} catch (ArithmeticException e2) {
			viewAreaCirc.mensajeError("Dividido entre cero");
			viewAreaCirc.limpiar();
		}
		
	}

}
