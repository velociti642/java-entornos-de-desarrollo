package app;

import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		int area1 = r1.getArea();
		int perimetro = r2.getPerimetro();
		
		System.out.print("El área del rectangulo es: " + area1 + "\n El perímetro del rectangulo es: " + perimetro);
		
		
	}

}
