import java.util.Scanner;
/**
 * 
 * @author Jesus 
 *
 */
public class Saludo {
	/**
	 * Constructor por defecto
	 */
	public Saludo(){
		
	}
	
	/**
	 * 
	 * @param args resive el metodo main en foemato String
	 */
	public static void main(String[] args) {
	String nombre;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Cual es tu nombre?");
    nombre = teclado.nextLine();
    
    	System.out.printf("Hola %s.",nombre); 
  
	}

}
