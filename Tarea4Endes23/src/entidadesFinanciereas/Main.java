/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadesFinanciereas;

public class Main {

	public static void main(String[] args) {

		System.out.println("1 CAMBIO EN ECLIPSE");
		System.out.println("2 CAMBIO EN ECLIPSE");
		System.out.println("3 CAMBIO EN ECLIPSE");
		System.out.println("4 CAMBIO EN ECLIPSE");

		CCuenta objetoCuenta;
		double saldoActual;

		objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = objetoCuenta.estado();
		System.out.println("El saldo actual es: " + saldoActual);
		

		probarIngresar(objetoCuenta, 200, 2700);

		probarRetirar(objetoCuenta, 2000, 700);

	}

	

	
	public static void probarIngresar(CCuenta c, int cantidad, double cantidadEsperada) {
		try {
			c.ingresar(cantidad);
		} catch (Exception e) {
			System.out.println("\nERROR, al hacer el ingreso.");
			e.printStackTrace();
		}

	}

	public static void probarRetirar(CCuenta c, int cantidad, double cantidadEsperada){
		try {
			c.retirar(cantidad);
		} catch (Exception e) {
			System.out.println("\nERROR, al hacer la retirada.");
			e.printStackTrace();
		}
	}

}
