package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.Ventana;
import model.Operaciones;
/**
 * 
 * @author Jesus
 *
 */
public class Eventos implements ActionListener {
	private Ventana vista = new Ventana();
	private Operaciones modelo = new Operaciones();
	/**
	 * 
	 * @param vista estalece el objeto de la clase Ventana
	 * @param modelo establece el objeto de clase Operaciones
	 */
	public Eventos(Ventana vista, Operaciones modelo) {
		super();
		this.vista = vista;
		this.modelo = modelo;
		vista.onClickSuma(this);
		vista.onClickResta(this);
		vista.onClickMultiplicacion(this);
		vista.onClickDividir(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String cadena1 = vista.getSN1();
			String cadena2 = vista.getSN2();
			double cadena1D = Double.parseDouble(cadena1);
			double cadena2D = Double.parseDouble(cadena2);
			String typeAction = null;
			
			if(cadena1.indexOf(".") >= 0 || cadena2.indexOf(".") >= 0){
				typeAction = "1";
			}else if(cadena1.indexOf(".") < 0 && cadena2.indexOf(".") < 0){
				typeAction = "2";
			}
			
			
			if(e.getSource()==vista.getBtnSuma()){
				modelo.sumarD(cadena1D,cadena2D);
				switch (typeAction) {
					case "1":
						vista.setLbResultado(String.format("%f + %f = %f", cadena1D, cadena2D ,modelo.getResutadoD())); 
					break;
	
					case "2":
						vista.setLbResultado(String.format("%s + %s = %d", cadena1, cadena2 , (int) modelo.getResutadoD()));
					break;	
				}
			}else if(e.getSource()==vista.getBtnResta()){
				modelo.restarD(cadena1D,cadena2D);
				switch (typeAction) {
					case "1":
						vista.setLbResultado(String.format("%f - %f = %f", cadena1D, cadena2D ,modelo.getResutadoD())); 
					break;
	
					case "2":
						vista.setLbResultado(String.format("%s - %s = %d", cadena1, cadena2 , (int) modelo.getResutadoD()));
					break;	
				}
			}else if(e.getSource()==vista.getBtnMultiplicacion()){
				modelo.multiplicarD(cadena1D,cadena2D);
				switch (typeAction) {
					case "1":
						vista.setLbResultado(String.format("%f X %f = %f", cadena1D, cadena2D ,modelo.getResutadoD())); 
					break;
	
					case "2":
						vista.setLbResultado(String.format("%s X %s = %d", cadena1, cadena2 , (int) modelo.getResutadoD()));
					break;	
				}
			}else if(e.getSource()==vista.getBtnDivicion()){
				switch (typeAction) {
					case "1":
						modelo.dividirD(cadena1D,cadena2D);
						vista.setLbResultado(String.format("%f ÷ %f = %f", cadena1D, cadena2D ,modelo.getResutadoD())); 
					break;
	
					case "2":
						modelo.dividirI((int)cadena1D,(int)cadena2D);
						vista.setLbResultado(String.format("%s ÷ %s = %d", cadena1, cadena2 ,   modelo.getResutadoI()));
					break;	
				}
			}
		} catch (NumberFormatException e2) {
			vista.mensajeError("Solo numeros");
			vista.limpiarCajas();
		} catch (ArithmeticException e2){
            vista.mensajeError("División entre cero");
            vista.limpiarCajas();
		}
	}
}

