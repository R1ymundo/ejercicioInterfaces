package interfacesProject;

import org.generation.classes.*;
import org.generation.interfac.FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("Bermudas", 20, 10, 15);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 20);
		Rectangulo rectangulo = new Rectangulo("Rectángulo Largo", 15, 6);
		Rombo rombo = new Rombo("Rombo Delgado", 10, 12, 16);
		Romboide romboide = new Romboide("Romboide Inclinado",14,9);
		Trapecio trapecio = new Trapecio("Trapecio Irregular", 10, 18,6,7,8,7,8);
		
		Main.imprimirCalculos(triangulo);
		Main.imprimirCalculos(cuadrado);
		Main.imprimirCalculos(rectangulo);
		Main.imprimirCalculos(rombo);
		Main.imprimirCalculos(romboide);
		Main.imprimirCalculos(trapecio);

	}
	
	public static void imprimirCalculos(FiguraGeometrica fg) {
		System.out.println(fg);
		
		System.out.println("+----------------------------------------+");
		System.out.println("| El área de [" + fg.getNombre() + "]");
		System.out.println("| es " + fg.calculaArea() );
		System.out.println("| El perímetro de [" + fg.getNombre() + "]");
		System.out.println("| es " + fg.calculaPerimetro() );
		System.out.println("+----------------------------------------+ \n");
	}

}
