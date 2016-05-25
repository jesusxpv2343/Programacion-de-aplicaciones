/**
 * 
 * @author Jesus
 * 
 */
import javax.swing.JOptionPane;


public class AppDatosPersonales {
	/**
	 * 
	 * @param args revive parametro en formato String
	 */
	public static void main(String[] args) {
		String nombre;
		String apellidoP;
		String apellidoM;
		String telefono;
		String edad;
		String estado;
		String municipio;
		String codigoP;
	    String escuela;
		String matricula;
		
		nombre = JOptionPane.showInputDialog("Cual es tu nombre?");
		apellidoP = JOptionPane.showInputDialog("Cual es tu apellido paterno?");
		apellidoM = JOptionPane.showInputDialog("Cual es tu apellido materno?");
		telefono = JOptionPane.showInputDialog("Cual es tu telefono?");
		edad = JOptionPane.showInputDialog("Cual es tu edad?");
		estado = JOptionPane.showInputDialog("Cual es tu estado?");
		municipio = JOptionPane.showInputDialog("Cual es tu municipio?");
		codigoP = JOptionPane.showInputDialog("Cual es tu codigo postal?");
		escuela = JOptionPane.showInputDialog("Cual es tu escuela?");
		matricula = JOptionPane.showInputDialog("Cual es tu matricula");
		
		Persona persona = new Persona(nombre, apellidoP, apellidoM, telefono, Integer.parseInt(edad), estado, municipio, Integer.parseInt (codigoP), escuela, matricula);
		
		JOptionPane.showMessageDialog(null, String.format("Hola %s tu apellido paterno es %s tu apellido materno %s tu telefono es %s tu edad es %d tu estado es %s tu municipio es %s tu codigo postal es %d tu escuela es %s tu matricula es %s.", nombre, apellidoP, apellidoM, telefono, Integer.parseInt(edad), estado, municipio, Integer.parseInt (codigoP), escuela, matricula));
	}

}
