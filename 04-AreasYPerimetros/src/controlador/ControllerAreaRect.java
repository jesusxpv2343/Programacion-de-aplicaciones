package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewAreaRect;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerAreaRect implements ActionListener{
	private ViewAreaRect viewAreaRect = new ViewAreaRect();
	private ModellCalculos ModellCalculos = new ModellCalculos();
	/**
	 * 
	 * @param viewAreaRect establece objeto de la clase ViewAreaRect
	 * @param modellCalculos establece objeto de la clase ModellCalculos
	 */
	public ControllerAreaRect(ViewAreaRect viewAreaRect, ModellCalculos modellCalculos) {
		this.viewAreaRect=viewAreaRect;
		this.ModellCalculos=modellCalculos;
		
		viewAreaRect.onClickCalcuar(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		try {
			String cadena1 = viewAreaRect.getTxtBase();
			String cadena2 = viewAreaRect.getTxtAltura();
			
			double base = Double.parseDouble(cadena1);
			double altura = Double.parseDouble(cadena2);
			
			String typeAction = null;
			
			if(cadena1.indexOf(".") >= 0 || cadena2.indexOf(".") >= 0){
				typeAction = "1";
			}else{
				typeAction = "2";
			}
			
			if (a.getSource() == viewAreaRect.getBtnCalcuar()) {
				ModellCalculos.areaRect(base, altura);
				switch (typeAction) {
					case "1":
						viewAreaRect.setLbRespueta(String.format("%f m²", ModellCalculos.getRespuestaD()));
					break;
						
					case "2":
						viewAreaRect.setLbRespueta(String.format("%d m²", (int) ModellCalculos.getRespuestaD()));
					break;
				}
			}

		} catch (NumberFormatException e) {
			viewAreaRect.mensajeError("Solo numeros");
			viewAreaRect.limpiar();
		} catch (ArithmeticException e) {
			viewAreaRect.mensajeError("Dividido entre cero");
			viewAreaRect.limpiar();
		}
				
	}

}
