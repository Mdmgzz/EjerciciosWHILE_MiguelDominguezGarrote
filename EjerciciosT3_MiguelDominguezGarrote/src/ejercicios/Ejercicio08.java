package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// bloque de variables
		double arbol;			// se guarda la altura de los arboles que se vayan introduciendo
		double masalto=0;			// se guarda la altura del arbol mas alto
		
		// creamos el Scanner 
		Scanner sc=new Scanner(System.in);
		
		// preguntamos por la altura del primer arbol
		System.out.println("Introduce la altura del arbol: ");
		arbol=sc.nextInt();
		
		//empezamos el bucle
		while (arbol!=-1) {												// el bucle funciona mientras no se introduzca -1
			if (arbol>masalto) {										// si el arbol introducido es mas alto que la variable arbolmasalto
				masalto=arbol;											// guarda el valor del arbol mas alto
			}
			System.out.println("Introduce la altura del arbol: ");		// volvemos a preguntar
			arbol=sc.nextInt();
		}
		System.out.println("El arbol mas alto mide: "+masalto);			//mostramos el arbol mas alto
		
		//cerramos el scanner
		sc.close();
	}
}
