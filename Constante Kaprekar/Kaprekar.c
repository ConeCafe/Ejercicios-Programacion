/*
 * Kaprekar.c
 *
 *  Created on: 17 feb. 2019
 *      Author: Jorge
 */

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int ordenaNA(int);
int ordenaND(int);
int kap(int);
int kapI(int, int);

int main(){
	printf("Introduce un numero menor o igual a 9999: \n");
	int n;
	scanf("%d", &n);
	printf("Numero iteraciones: %d\n", kap(n));

}

//Este método ordena de orden descendente a ascendente los dígitos de un número
int ordenaNA(int num){
	int temp = 0;
	int acum = 0;
	int a = num;
//Este bucle hace que se miren primero los dígitos más bajos
	while(temp<10){
		num = a;
		while (num > 0){
			if(num % 10 == temp){
				acum = acum * 10 + num % 10;
			}
			num = num/10;
		}
		temp++;
	}
	return acum;
}
//invierte de orden los dígitos de un número. Hay que usar antes el metodo ordenaNA si queremos que este metodo ordene de orden ascendente a descendente.
int ordenaND(int num){
	//nDigits = número de dígitos de un número - 1
	int nDigits = floor(log10(abs(num)));

	if(num < 10){
		return num;
	}
	else{
		//Último dígito del número que recibe la función * 10^(nº dígitos del número que recibe la función - 1) + llamada recursiva
		return num %10 * pow(10, nDigits)  + ordenaND((num - num % 10)/10);
	}

}
//recursivo final, al principio siempre habra 1 iteración
int kap(int i){
	return kapI(i, 1);
}


//si por ejemplo i = 9, entonces b tiene que ser mayor que 1000 para que podamos encontrar la constante de Kaprekar.
int kapI(int i, int c){
	int a = ordenaND(ordenaNA(i));
	int b = ordenaNA(i);
	int contador = c;
	while(a < 1000){
		a = a*10;
	}
	if(a-b==6174){
		return contador;
	}
	else{
		contador++;
		return kapI(a-b,contador);
	}
}
