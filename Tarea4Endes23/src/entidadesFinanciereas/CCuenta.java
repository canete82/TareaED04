
package entidadesFinanciereas;

/**
 * <p>
 * Clase publica para la creación de objetos de tipo cuenta, con los atributos
 * nombre, número de cuneta, saldo de la cuenta y tipo de interes.
 * Métodos estado, ingresar y retirar.
 * 
 * </p>
 * 
 * @author Carlos
 * @version 2.0
 *
 */

public class CCuenta {
	
	// Aributos privados de la clase.
	private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;
	
	
	/**
	 * Constructor por defecto de la calse, este constructor inicializa los atributos del objeto con valores por defecto
	 * según el tipo.
	 */
	public CCuenta() {
	}
	
	
	/**
	 * Constructor con parámeros inicializa los atributos del objeto con los parámetros pasados.
	 * 
	 * @param nombre De tipo Stirng.
	 * @param cuenta De tipo String.
	 * @param saldo De tipo double.
	 * @param tipoInteres De tipo double.
	 */
	public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
	}
	
	
	/**
	 * Método publico de tio double para mostrar el saldo.
	 * 
	 * @return De tipo double, retorna el valor del atributo saldo.
	 */
	public double estado() {
		return this.saldo;
	}

	
	/**
	 * Método publico vacío para hacer un ingreso de una cantidad pasada como parámetro, en el saldo.
	 * Si la cantidad a ingresar es menor que cero lanza una excepción que es gestionada por el método
	 * en la llamada al método.
	 * Si la cantidad es mayor que cero se realiza el incremento de la cantidad mas el saldo y se 
	 * almacena en el saldo.
	 * 
	 * @param cantidad De tio double.
	 * @throws Exception Excepción por incopatibilidad en los datos.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception(ERRORCANTIDADNEGATIVA);
		saldo = saldo + cantidad;
	}
	
	
	/**
	 * Método vacío para hacer una retirada de una cantidad pasada como parámetro, en el saldo.
	 * Si la cantidad a retirar es menor o igual a cero lanza una excepción y un mensaje que es gestionada
	 * por el método en la llamada al método.
	 * Si la cantidad es mayor que le saldo lanza una excepción y mensaje que es gestionado por el método 
	 * en la llamada al método.
	 * 
	 * @param cantidad De tio double.
	 * @throws Exception Excepción por incopatibilidad en los datos.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa.");
		if (saldo < cantidad)
			throw new Exception("No hay suficiente saldo.");
		saldo = saldo - cantidad;
	}
	
	
	/**
	 * Método para obtener el valor del atributo nombre.
	 * 
	 * @return De tipo String, retorna el valor del nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método vacio para modificar el valor del atributo nombre.
	 * 
	 * @param nombre De tipo String, que se le asigna al atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método para obtener el valor del atributo cuenta.
	 * 
	 * @return De tipo String, retorna el valor de la cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método vacio para modificar el valor del atributo cuenta.
	 * 
	 * @param cuenta De tipo String, que se le asigna al atributo cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Método para obtener el valor del atributo saldo.
	 * 
	 * @return De tipo double, retorna el valor del saldo.
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Método vacio para modificar el valor del atributo saldo.
	 * 
	 * @param saldo De tipo String, que se le asigna al atributo saldo.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para obtener el valor del atributo tipoInteres.
	 * 
	 * @return De tipo double, retorna el valor del tipoInteres.
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método vacio para modificar el valor del atributo tipoInteres.
	 * 
	 * @param tipoInteres De tipo double, que se le asigna al atributo tipoInteres.
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
