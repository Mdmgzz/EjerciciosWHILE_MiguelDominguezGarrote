package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// bloque de variables
		int num; 				// se guardara los numeros que el usuario quiera sumar 
		int suma=0;				// se guarda la suma
		int conteo=0;			// se guarda la  cuenta de los numeros
		
		//creamos el Scanner y preguntamos por el numero 
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un numero para sumar: ");		// pedimos al usuario que introduzca un numero
		num=sc.nextInt();
		while (num>=0) {												// mientras el numero introducido sea positivo el bucle contiunara
			conteo ++;													// cada vez que se introduzca un numero se sumara 1 a la variable suma
			suma +=num;												 	// se va sumando los numeros 
			System.out.println("Introduzca un numero para sumar: ");	// volvemos a preguntar
			num=sc.nextInt();
		}
		System.out.println("La media de los numeros es: "+ suma/conteo);	// mostramos el resultado
		// cerramos el scanner
		sc.close();
	}

}
