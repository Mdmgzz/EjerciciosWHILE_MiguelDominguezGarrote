package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// bloque de variables
		int edades;					//se registran las edades de los alumnos 
		int sumaedades=0;				// se guarda la suma de todas las edades
		int mayores=0;				// se guardaran los mayores de edad+
		int mediaedades;			//se guardara el valor de la media
		int alumnos=0;				// se guardara el contador de alumnos
		
		// creamos el scanner 
		Scanner sc=new Scanner(System.in);
		
		// preguntamos al usuario por una edad y si el valor es positivo entramos el bucle
		System.out.print("Introduzca una edad de un alumno: ");
		edades= sc.nextInt();
		
		while (edades>=0) {									//mientras el numero sea positivo el bucle funcionará
			alumnos ++;										// una vez introducido el numero se sumara 1 a la variable de alumnos
			sumaedades+=edades;								// se va sumando las edades introducidas en la variable sumaedades
			if (edades>=18) {								// si la edad es igual o mayor de 18 se suma 1 a la variable de mayores
				mayores++;
			}
			System.out.print("Introduzca una edad de un alumno: ");		// vuelves a preguntar para continuar el bucle
			edades=sc.nextInt();										// este se termina cuando introduces un numero negativo
		}
		
		// calculamos la media de las edades
		mediaedades=sumaedades/alumnos;
		System.out.println("La suma de todas las edades es de: "+sumaedades);	// mostramos la suma de edades
		System.out.println("La media de las edades es: "+mediaedades);			// mostramos la media de edades
		System.out.println("Hay una cantidad de "+alumnos+" alumnos.");			// mostramos la cantidad de alumnos
		System.out.println("De los alumnos "+mayores+ " son mayores de edad");	// mostramos la cantidad de alumnos mayores de edad
		
		//cerramos el scanner
		sc.close();
	}

}
