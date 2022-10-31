package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// bloque de variables
		int numero;					// sera el numero aleatorio
		int respuesta=0;				// se guardara la respuesta del usuario
		
		//creamos el scanner 
		Scanner sc=new Scanner(System.in);
		
		// generamos el numero aleatorio
		numero = (int)(Math.random()*100+1);
		
		// preguntamos por una respuesta 
		System.out.println("Se ha generado un numero secreto.");
		System.out.println("Cual podría ser?: ");
		respuesta=sc.nextInt();
		
		// iniciamos el bucle
		while (respuesta!=-1 && respuesta!=numero) {
			if (respuesta>numero) {
				System.out.println("MAYOR");
			}else if(respuesta<numero){
				System.out.println("MENOR");
			}
				System.out.println("Cual podría ser?: ");
				respuesta=sc.nextInt();
		}
		if (respuesta==numero) {
			System.out.println("CORRECTO!!!");
		}

		sc.close();
	}

}
