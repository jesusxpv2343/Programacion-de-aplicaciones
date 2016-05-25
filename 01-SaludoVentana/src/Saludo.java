import javax.swing.JOptionPane;

/**
 * 
 * @author Jesus
 *
 */
public class Saludo {
	/**
	 * 
	 * @param args revice el metodo main en formato String
	 */
	public static void main(String[] args) {
		String nombre;
		nombre = JOptionPane.showInputDialog("Cual es tu nombre?");
		JOptionPane.showMessageDialog(null, String.format("Hola %s.", nombre));
	}
	
}
