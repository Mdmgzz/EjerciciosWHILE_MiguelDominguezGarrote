package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// bloque de variables
		int numero;						// se guardan los numeros que introduzca el usuario y se calculara la media
		int contador=1;					// guarda el conteo de los numero para que cuando llegue a 10 se detenga 
		int cantidad0=0;				// contara el numero de 0 que el usuario introduzca
		int negativos=0;				// se guarda la suma de los numeros negativos
		int positivos=0; 				// se guarda la suma de los numeros positivos
		int contadornegativo=0;			// se guarda los numeros negativos para hacer la media
		// creamos el scanner y preguntamos al usuario por el primer numero +
		Scanner sc = new Scanner(System.in);
		
		while (contador<=10) {
			System.out.println("Introduce el "+contador+"º numero");
			numero = sc.nextInt();
			//if (numero)
			if (numero==0) {							// si el numero es un 0 el contador de ceros aumenta
				cantidad0++;
			}else if (numero<0){						// si es menos que 0 entonces el contador de negativos aumente
				contadornegativo++;
				negativos+= numero;						// y se van sumando todos los numeros negativos
			}else if (numero>0){
				positivos+=numero;						// aqui se van sumando todos los numeros mayores que 0
			}
			contador++;
		}
		// mostramos la suma de los numeros positivos,la media de los negativos y la cantidad de ceros introducidos
		System.out.println("La suma de los numeros positivos es: "+ positivos);
		System.out.println("La media de los numeros negativos introducidos es: "+  ((double)negativos/(double)contadornegativo));
		System.out.println("Has introducido "+cantidad0+" de ceros");
	
		//cerramos el Scanner
		sc.close();
	}

}
