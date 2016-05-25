package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewAreaCuad;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerAreaCuad implements ActionListener{
	private ViewAreaCuad viewAreaCuad = new ViewAreaCuad();
	private ModellCalculos modellCalculos= new ModellCalculos();
	/**
	 * 
	 * @param viewAreaCuad establece objeto de la clase ViewAreaCuad
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerAreaCuad(ViewAreaCuad viewAreaCuad, ModellCalculos modellCalculos) {
		this.viewAreaCuad=viewAreaCuad;
		this.modellCalculos=modellCalculos;
		viewAreaCuad.onClickCalcuar(this);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		try {
			String  cadena = viewAreaCuad.getTxtLado();
			double lado = Double.parseDouble(cadena);
			String typeAction = null;
			
			if(cadena.indexOf(".") >= 0){
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if (a.getSource() == viewAreaCuad.getBtnCalcuar()) {
				modellCalculos.areaCuadr(lado);
				switch (typeAction) {
					case "1":
						viewAreaCuad.setLbRespueta(String.format(" %f m²", modellCalculos.getRespuestaD()));
					break;
						
					case "2":
						viewAreaCuad.setLbRespueta(String.format(" %d m²", (int) modellCalculos.getRespuestaD()));
					break;
				}
			}
		} catch (NumberFormatException e) {
			viewAreaCuad.mensajeError("Solo numeros");
			viewAreaCuad.limpiar();
		} catch (ArithmeticException e) {
			viewAreaCuad.mensajeError("Dividido entre cero");
			viewAreaCuad.limpiar();
		}
		
		
	}

}
