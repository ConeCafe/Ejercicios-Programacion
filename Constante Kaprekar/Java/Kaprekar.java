package p1;

import java.util.Scanner;

public class Kaprekar {

	public static void main(String[] args) {
		System.out.println("Introduce un numero menor o igual a 9999");
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		sc.close();

		if(n > 9999) {
			throw new IllegalArgumentException("Introduce un numero menor o igual a 9999");
		}
		System.out.println("\n Iteraciones: "+kap(n));

	}
	
	
	public static Integer ordenaNA(Integer num) {
		Integer temp = 0;
		Integer acum = 0;
		Integer copia = 0;
		
		while(temp<10) {
			copia = num;
			while(copia > 0) {
				if(copia % 10 == temp) {
					acum = acum * 10 + copia % 10;
				}
				copia = copia/10;
			}
			temp++;
		}
		return acum;
	}
	
	
	public static Integer ordenaND(Integer num) {
		Integer temp = 9;
		Integer acum = 0;
		Integer copia;
		while(temp >= 0) {
			copia = num;
			while(copia > 0) {
				if(copia % 10 == temp) {
					acum = acum * 10 + copia % 10;
				}
				copia  = copia/10;
			}
			temp--;
		}
		return acum;
	}

	public static Integer kap(Integer num) {
		return kap(num, 0);
	}
	
	private static Integer kap(Integer num, Integer contador) {
		Integer a = ordenaND(num);
		Integer b = ordenaNA(num);
		Integer c = contador;
		/*
		 * Si resulta que ponemos por ejemplo 0009 como numero de entrada,
		 * el compilador al hacer el ordenaND dara como salida 9 en vez 9000,
		 * Por este motivo hacemos un bucle while que lo que hace es multiplicar el numero que sea
		 * si es menor de 1000 hasta que sea de cuatro cifras.
		 */
		while(a<1000) {
			a = a * 10;
		}
		//Caso base, a-b es igual a 6174
		if(a-b==6174) {
			return c;
		}
		//Otro caso base, a-b=0. Se lanza una excepcion, sino el programa entraría en un bucle infinito
		if(a-b==0) {
			throw new IllegalArgumentException("No se pudo realizar la operacion. El numero debe tener al menos dos digitos diferentes");
		}
		//En cualquier otro caso, hacemos una llamada recursiva actualizando los parametros de entrada
		else {
			c++;
			return kap(a-b,c);
		}
	}
}
