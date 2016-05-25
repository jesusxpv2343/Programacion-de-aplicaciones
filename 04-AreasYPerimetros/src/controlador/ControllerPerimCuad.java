package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewPerimCuad;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerPerimCuad implements ActionListener{
	private ViewPerimCuad viewPeriCuadra = new ViewPerimCuad();
	private ModellCalculos modellCalculos = new ModellCalculos();
	/**
	 * 
	 * @param viewPeriCuadra estalece parametro de la clase ViewPerimCuadra
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerPerimCuad(ViewPerimCuad viewPeriCuadra, ModellCalculos modellCalculos) {
		this.viewPeriCuadra = viewPeriCuadra;
		this.modellCalculos = modellCalculos;
		
		viewPeriCuadra.onClickCalcuar(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			String cadena = viewPeriCuadra.getTxtLado();
			double lado = Double.parseDouble(cadena);
			String typeAction = null;
			
			if (cadena.indexOf(".") >= 0) {
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if (e.getSource() == viewPeriCuadra.getBtnCalcular()) {
				modellCalculos.perimCuadr(lado);
				switch (typeAction) {
				case "1":
					viewPeriCuadra.setLbRespueta(String.format("%f m", modellCalculos.getRespuestaD()));
				break;
	
				case "2":
					viewPeriCuadra.setLbRespueta(String.format("%d m", (int)modellCalculos.getRespuestaD()));
				break;
				}
			}
		} catch (NumberFormatException e2) {
			viewPeriCuadra.mensajeError("Solo numeros");
			viewPeriCuadra.limpiar();
		} catch (ArithmeticException e2) {
			viewPeriCuadra.mensajeError("Dividido entre cero");
			viewPeriCuadra.limpiar();
		}
	}

}
