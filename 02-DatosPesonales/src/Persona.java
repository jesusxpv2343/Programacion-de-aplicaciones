/**
 * 
 * @author Jesus
 *
 */
public class Persona {
  private String nombre;
  private String apellidoP;
  private String apellidoM;
  private String telefono;
  private int edad;
  private String estado;
  private String municipio;
  private int codigoP;
  private String escuela;
  private String matricula;
  
  /**
   * Constructor por defecto
   */
 public Persona(){ //Constructor
	 
 }
/**
 * 
 * @param nombre de la persona en formato Strnig
 * @param telefono de la persona en formato String
 * @param edad de la persona en formato Integer
 */
public Persona(String nombre, String telefono, int edad) {
	super();
	this.nombre = nombre;
	this.telefono = telefono;
	this.edad = edad;
	
}
/**
 * @param nombre de la persona en formato String
 * @param telefono de la persona en formato String
 * @param edad de la persona en formato Integer
 * @param apellidoP apellidoP de la persona en formato String
 * @param apellidoM de la persona en formato String
 * @param estado de la persona en formato String
 * @param municipio de la persona en formato String
 * @param codigoP de la persona en formato Integer
 * @param escuela de la persona en formato String
 * @param matricula de la persona en formato String
 */
public Persona(String nombre, String apellidoP, String apellidoM,
		String telefono, int edad, String estado, String municipio,
		int codigoP, String escuela, String matricula) {
	super();
	this.nombre = nombre;
	this.apellidoP = apellidoP;
	this.apellidoM = apellidoM;
	this.telefono = telefono;
	this.edad = edad;
	this.estado = estado;
	this.municipio = municipio;
	this.codigoP = codigoP;
	this.escuela = escuela;
	this.matricula = matricula;
}
/**
 * 
 * @return retorna el nombre de la persona en formato String
 */
public String getNombre() {
	return nombre;
}
/**
 * 
 * @return retorna el apellidoP de la persona en formato String
 */
public String getApellidoP() {
	return apellidoP;
}
/**
 * 
 * @param apellidoP establece el parametro en formato String
 */
public void setApellidoP(String apellidoP) {
	this.apellidoP = apellidoP;
}
/**
 * 
 * @return retorna apellidoM de la persona en formato String
 */
public String getApellidoM() {
	return apellidoM;
}
/**
 * 
 * @param apellidoM estabelce el parametro en formato String
 */
public void setApellidoM(String apellidoM) {
	this.apellidoM = apellidoM;
}
/**
 * 
 * @return retorna el estado de la persona en formato String
 */
public String getEstado() {
	return estado;
}
/**
 * 
 * @param estado establece el parametro en formato String
 */
public void setEstado(String estado) {
	this.estado = estado;
}
/**
 * 
 * @return retorna el municipio de la persona en formato String
 */
public String getMunicipio() {
	return municipio;
}
/**
 * 
 * @param municipio establece el parametro en formato String
 */
public void setMunicipio(String municipio) {
	this.municipio = municipio;
}
/**
 * 
 * @return retorna el codigoP de la persona en formato String
 */
public int getCodigoP() {
	return codigoP;
}
/**
 * 
 * @param codigoP establece el parametro de la persona en formato String
 */
public void setCodigoP(int codigoP) {
	this.codigoP = codigoP;
}
/**
 * 
 * @return retorna escuela de la persona en formato string
 */
public String getEscuela() {
	return escuela;
}
/**
 * 
 * @param escuela establece el parametro de la persona en formato String
 */
public void setEscuela(String escuela) {
	this.escuela = escuela;
}
/**
 * 
 * @return matricula de la persona en formato String
 */
public String getMatricula() {
	return matricula;
}
/**
 * 
 * @param matricula establece el parametro de la persona en formato String
 */
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
/**
 * 
 * @param nombre estable el nombre en formato String
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * 
 * @return  retorna el telefono de la persona en formato String
 */

public String getTelefono() {
	return telefono;
}
/**
 * 
 * @param telefono establece el nombre en formato String
 */
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

/**
 * 
 * @return la edad de la persona en formato Integer
 */
public int getEdad() {
	return edad;
}
/**
 * 
 * @param edad establece la edad de la persona en formato Integer
 */
public void setEdad(int edad) {
	this.edad = edad;
}


}
