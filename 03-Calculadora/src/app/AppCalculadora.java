package app;

import Vista.Ventana;
import controlador.Eventos;
import model.Operaciones;
/**
 * 
 * @author Jesus
 *
 */
public class AppCalculadora {
	/**
	 * 
	 * @param args revive parametro en formato String
	 */
	public static void main(String[] args) {
		Ventana vista = new Ventana();
		Operaciones modelo = new Operaciones();
		
		Eventos controlador = new Eventos(vista, modelo);
		
		vista.setVisible(true);
	}

}
