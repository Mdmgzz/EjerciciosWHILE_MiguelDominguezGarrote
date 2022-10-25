package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		int num; 		// se guardara los numeros que el usuario quiera sumar 
		int suma=0;			// se guarda la sum
		
		//creamos el Scanner y preguntamos por el numero 
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un numero para sumar: ");		// pedimos al usuario que introduzca un numero
		num=sc.nextInt();
		while (num>=0) {												// mientras el numero introducido sea positivo el bucle contiunara
			suma +=num;													// sumamos el numero de la variable num
			System.out.println("El resultado de la suma es: "+suma);	// mostramos el resultado
			System.out.println("Introduzca un numero para sumar: ");	// volvemos a preguntar
			num=sc.nextInt();
		}
		// cerramos el scanner
		sc.close();
	}

}
