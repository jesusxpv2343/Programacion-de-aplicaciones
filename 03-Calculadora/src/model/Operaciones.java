package model;
/**
 * 
 * @author Jesus
 *
 */
public class Operaciones {
	
	private int n1 = 0;
	private int n2 = 0;

	private double resultadoD = 0.0;
	private int resultadoI = 0;
	/**
	 * Constructor por defecto
	 */
	public Operaciones(){}
	/**
	 * 
	 * @param n1 parametro en formato Integer 
	 * @param n2 parametro en formato Integer
	 */
	public Operaciones(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	/**
	 * 
	 * @return el valor de N1 en formato Integer
	 */
	public int getN1() {
		return n1;
	}
	/**
	 * 
	 * @param n1 establece el valor en formato Integer
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}
	/**
	 * 
	 * @return el valor de N2 en formato Integer
	 */
	public int getN2() {
		return n2;
	}
	/**
	 * 
	 * @param n2 establece el valor en formato Integer
	 */
	public void setN2(int n2) {
		this.n2 = n2;
	}
	/**
	 * 
	 * @return devueleve el resultado en formato Double
	 */
	public double getResutadoD() {
		return resultadoD;
	}
	/**
	 * 
	 * @return devuelve el resultado en formato Integer
	 */
	public int getResutadoI() {
		return resultadoI;
	}
	/**
	 * 
	 * @param n1 establece el valor de n1 en formato Double
	 * @param n2 establece el valor de n2 en formato Double
	 * 	
	 * @return devuelve el resultado de la operacion suma en formato Double
	 */
	public double sumarD(double n1, double n2){
		return resultadoD = n1 + n2;
	}
	/**
	 * 
	 * @param n1 establece el valor de n1 en formato Double
	 * @param n2 establece el valor de n2 en formato Double
	 * @return devuelve el resultado de la operacion resta en formato Double
	 */
	public double restarD(double n1, double n2){
		return resultadoD = n1 - n2;
	}
	/**
	 * 
	 * @param n1 establece el valor de n1 en formato Double
	 * @param n2 establece el valor de n2 en formato Double
	 * @return devuelve el resultado de la operacion multiplicacion en formato Double
	 */
	public double multiplicarD(double n1, double n2){
		return resultadoD = n1 * n2;
	}
	/**
	 * 
	 * @param n1 establece el valor de n1 en formato Double
	 * @param n2 establece el valor de n2 en formato Double
	 * @return devuelve el resultado de la operacion divicion en formato Double
	 */
	public double dividirD(double n1, double n2){
		return resultadoD = n1 / n2;
	}
	/**
	 * 
	 * @param n1 establece el valor de n1 en formato Double
	 * @param n2 establece el valor de n2 en formato Double
	 * @return devuelve el resultado de la operacion suma en formato Integer
	 */
	public int dividirI(int n1, int n2){
		return resultadoI = (n1 / n2);
	}
	

}
