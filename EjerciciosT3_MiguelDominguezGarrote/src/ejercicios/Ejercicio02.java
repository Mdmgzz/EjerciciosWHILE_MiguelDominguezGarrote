package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// bloque de variables
		int num; 		// se guardara los numeros que el usuario quiera sumar 
		int suma=0;			// se guarda la suma
		
		//creamos el Scanner y preguntamos por el numero 
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un numero para sumar: ");		// pedimos al usuario que introduzca un numero
		num=sc.nextInt();
		while (num>=0) {												// mientras el numero introducido sea positivo el bucle contiunara
			suma ++;													// cada vez que se introduzca un numero se sumara 1 a la variable suma
			System.out.println("Introduzca un numero para sumar: ");	// volvemos a preguntar
			num=sc.nextInt();
		}
		System.out.println("En total hay: " + suma + " numeros");	// mostramos el resultado
		// cerramos el scanner
		sc.close();
	}

}
