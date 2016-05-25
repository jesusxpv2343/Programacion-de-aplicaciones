package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewPerimCirc;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerPerimCirc implements ActionListener {
	private ViewPerimCirc viewPerimCirc = new ViewPerimCirc();
	private ModellCalculos modellCalculos = new ModellCalculos();
	/**
	 * 
	 * @param viewPerimCirc estalece parametro de la clase ViewPerimCirc
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerPerimCirc(ViewPerimCirc viewPerimCirc, ModellCalculos modellCalculos) {
		this.viewPerimCirc=viewPerimCirc;
		this.modellCalculos = modellCalculos;
		
		viewPerimCirc.onClickCalcuar(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String cadena = viewPerimCirc.getTxtRadio();
			double radio = Double.parseDouble(cadena);
			String typeAction = null;
			
			if (cadena.indexOf(".") >= 0) {
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if (e.getSource() == viewPerimCirc.getBtnCalcular()) {
				modellCalculos.perimCirc(radio);
				switch (typeAction) {
				case "1":
					viewPerimCirc.setLbRespueta(String.format("%f m", modellCalculos.getRespuestaD()));
				break;

				case "2":
					viewPerimCirc.setLbRespueta(String.format("%d m", (int)modellCalculos.getRespuestaD()));
				break;
				}
			}
		} catch (NumberFormatException e2) {
			viewPerimCirc.mensajeError("Solo numeros");
			viewPerimCirc.limpiar();
		} catch (ArithmeticException e2) {
			viewPerimCirc.mensajeError("Dividido entre cero");
			viewPerimCirc.limpiar();
		}
	}
	

}
