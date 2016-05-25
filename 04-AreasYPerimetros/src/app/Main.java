package app;


import controlador.ControllerMain;
import vista.ViewMain;
/**
 * 
 * @author Jesus
 *
 */
public class Main {
	/**
	 * 
	 * @param args establece parametro en formato String
	 */
	public static void main(String[] args) {
		ViewMain viewMain = new ViewMain();
		ControllerMain controllMain = new ControllerMain(viewMain);
		viewMain.setVisible(true);
	}

}
