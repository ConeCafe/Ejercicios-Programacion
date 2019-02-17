Este ejercicio contiene los siguientes métodos de interés.
	-Ordenación de los dígitos de un número en orden descendente a ascendente.
	-Invertir de orden los dígitos de un número.
	-Función recursiva final para hallar el número de iteraciones necesarias para obtener la constante de Kaprekar


El matemático indio Dattaraya Ramchandra Kaprekar descubrió en 1949 una curiosa característica del número 6174. Hoy, se conoce a dicho número como constante de Kaprekar en honor a él.

El número es notable por la siguiente propiedad:

    1.Elige un número de cuatro dígitos que tenga al menos dos diferentes (es válido colocar el dígito 0 al principio, por lo que el número 0009 es válido).
    2.Coloca sus dígitos en orden ascendente y en orden descendente para formar dos nuevos números. Puedes añadir los dígitos 0 que necesites al principio.
    3.Resta el menor al mayor.
    4.Vuelve al paso 2.

A este proceso se le conoce como la rutina de Kaprekar, y siempre llegará al número 6174 en, como mucho, 7 iteraciones. Una vez en él, el proceso no avanzará, dado que 7641 − 1467 = 6174.

Por ejemplo, el número 3524 alcanzará la constante de Kaprekar en 3 iteraciones.



En la carpeta Java, se podrá encontrar el análogo del código en C en dicho lenguaje. Aunque en la versión Java en vez de usar una función que invierte los dígitos de un número he puesto la correspondiente que ordena los dígitos de orden ascendente a descendente.