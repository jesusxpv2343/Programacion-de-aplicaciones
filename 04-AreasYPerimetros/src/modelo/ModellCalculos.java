package modelo;
/**
 * 
 * @author Jesus
 *
 */
public class ModellCalculos {
	
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double ladoD;
	private double radio;
	private double base;
	private double altura;
	private double respuestaD;
	
	/**
	 * 
	 * @param ladoA establece el ladoA de una figura en formato Double
	 * @param ladoB establece el ladoB de una figura en formato Double
	 * @param ladoC establece el ladoC de una figura en formato Double
	 * @param ladoD establece el ladoD de una figura en formato Double
	 * @param radio establece el radio de una figura en formato Double
	 * @param base establece el base de una figura en formato Double
	 * @param altura establece la altura de una figura en formato Double
	 * @param respuestaD establece el resultado de un operacion de una figura en formato Double
	 */
	public ModellCalculos(double ladoA, double ladoB, double ladoC,
			double ladoD, double radio, double base, double altura,
			double respuestaD) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		this.radio = radio;
		this.base = base;
		this.altura = altura;
		this.respuestaD = respuestaD;
	}
	/**
	 * Constructor por defecto
	 */
	public ModellCalculos() {}
	
	/**
	 * 
	 * @return devuelve el ladoA de una figura en formato Double
	 */
	public double getLadoA() {
		return ladoA;
	}
	/**
	 * 
	 * @param ladoA estalece el ladoA de una figura en formato Double
	 */
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	/**
	 * 
	 * @return devuelve el ladoB de una figura en formato Double
	 */
	public double getLadoB() {
		return ladoB;
	}
	/**
	 * 
	 * @param ladoB estalece el ladoB de una figura en formato Double 
	 */
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	/**
	 * 
	 * @return devuelve el ladoC de una figura en formato Double
	 */
	public double getLadoC() {
		return ladoC;
	}
	/**
	 * 
	 * @param ladoC estalece el ladoC de una figura en formato Double
	 */
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	/**
	 * 
	 * @return devuelve el ladoD de una figura en formato Double
	 */
	public double getLadoD() {
		return ladoD;
	}
	/**
	 * 
	 * @param ladoD estalece el ladoD de una figura en formato Double
	 */
	public void setLadoD(double ladoD) {
		this.ladoD = ladoD;
	}
	/**
	 * 
	 * @return devuelve el radio de una figura en formato Double
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * 
	 * @param radio estalece el radio de una figura en formato Double
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * 
	 * @return devuelve la base de una figura en formato Double
	 */
	public double getBase() {
		return base;
	}
	/**
	 * 
	 * @param base estalece la base de una figura en formato Double
	 */
	public void setBase(double base) {
		this.base = base;
	}
	/**
	 * 
	 * @return devuelve la altura de una figura en formato Double
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * 
	 * @param altura estalece la altura de una figura en formato Double
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * 
	 * @return devuelve el resultado de una operacion en formato Double
	 */
	public double getRespuestaD() {
		return respuestaD;
	}
	/**
	 * 
	 * @param respuestaD estalece el resultado de una operacion en formato Double 
	 */
	public void setRespuestaD(double respuestaD) {
		this.respuestaD = respuestaD;
	}
	
	/*------------------------------------------------------------*/
	
	/**
	 * 
	 * @param ladoA establece el ladoA de una figura en formato Double
	 * @return devuelve el valor de la operacion area del cuadrado
	 */
	public double areaCuadr(double ladoA){
		return respuestaD =  Math.pow( ladoA, 2);
	}
	/**
	 * 
	 * @param base establece la base de una figura en formato Double
	 * @param altura establece la altura de una figura en formato Double
	 * @return devuelve el valor de la operacion area del rectangulo
	 */
	public double areaRect(double base, double altura){
		return respuestaD = base * altura;
	}
	/**
	 * 
	 * @param base establece la base de una figura en formato Double
	 * @param altura establece la altura de una figura en formato Double
	 * @return devuelve el valor de la operacion area del triangulo
	 */
	public double areaTrian(double base, double altura){
		return respuestaD =  (base * altura) / 2;
	}
	/**
	 * 
	 * @param radio establece el radio de una figura en formato Double
	 * @return devuelve el valor de la operacion area del circulo
	 */
	public double areaCirc(double radio){
		return respuestaD = (Math.PI * Math.pow(radio, 2));
	}
	
	/*------------------------------------------------------------*/
	
	/**
	 * 
	 * @param ladoP establece el ladoP de una figura en formato Double
	 * @return devuelve el valor de la operacion perimetro del cuadrado
	 */
	public double perimCuadr(double ladoP){
		return respuestaD = ladoP * 4;
	}
	/**
	 * 
	 * @param baseP establece la base de una figura en formato Double
	 * @param alturaP establece la altura de una figura en formato Double
	 * @return devuelve el valor de la operacion perimetro del rectangulo
	 */
	public double perimRect(double baseP, double alturaP){
		return respuestaD = ( baseP * 2) + ( alturaP * 2);
	}
	/**
	 * 
	 * @param lado1 establece el lado1 de una figura en formato Double
	 * @param lado2 establece el lado2 de una figura en formato Double
	 * @param lado3 establece el lado3 de una figura en formato Double
	 * @return devuelve el valor de la operacion perimetro del triangulo
	 */
	public double perimTrian(double lado1, double lado2, double lado3){
		return respuestaD =  lado1 + lado2 + lado3;
	}
	/**
	 * 
	 * @param radioP establece el radio de una figura en formato Double
	 * @return devuelve el valor de la operacion perimetro del circulo
	 */
	public double perimCirc(double radioP){
		return respuestaD = (Math.PI * radioP) * 2;
	}

}
