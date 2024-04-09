package app;

import util.Algoritmos;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Llamamos al metodo Algoritmo del paquete util
		 */
		int sumatorio = Algoritmos.sumatorio(4);
		int factorial = Algoritmos.factorial(4);
		
		System.out.println(sumatorio);
		System.out.print(factorial);
	}

}
