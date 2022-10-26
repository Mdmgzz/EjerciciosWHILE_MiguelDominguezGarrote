package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// bloque de variables
		int numero,division; 			// se guarda el numero que el cliente introduzca 
		
		// creamos el scanner y preguntamos al usuario
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un  numero y te diremos si es par o impar");		 //preguntamos al usuario 
		System.out.println("Para salir del bucle introduzca el numero 0: ");			// le explicamos como se sale del programa
		numero=sc.nextInt();
		while (numero!=0){
			division=numero%2;															// sacamos el resto de dividir el numero entre 2
			if (division==0) {															// si el resto es 0 sera par
				System.out.println("PAR");
			}else {																		// si el resto no es 0 sera impar
				System.out.println("IMPAR");
			}
			System.out.println("Introduzca un  numero y te diremos si es par o impar");		 // volvemos a preguntamos al usuario 
			System.out.println("Para salir del bucle introduzca el numero 0: ");			// le explicamos como se sale del programa
			numero=sc.nextInt();
		}
		//cerramos el Scanner
		sc.close();
	}

}
