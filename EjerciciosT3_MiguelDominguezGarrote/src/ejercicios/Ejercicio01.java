package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		int num; 		// se guardara los numeros que el usuario quiera sumar 
		int suma=0;			// se guarda la sum
		
		//creamos el Scanner y preguntamos por el numero 
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un numero para sumar: ");
		num=sc.nextInt();
		while (num>=0) {
			suma +=num;
			System.out.println("El resultado de la suma es: "+suma);
			System.out.println("Introduzca un numero para sumar: ");
			num=sc.nextInt();
		}
	sc.close();
	}

}
