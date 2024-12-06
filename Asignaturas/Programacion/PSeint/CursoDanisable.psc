// Al crear una función te pide que le pongas un argumento entre parentesis, si no se necesita, se pone uno y no hace falta usarlo
Funcion mostrar_hola (sinargumento)
	Escribir "hola muy bien";
Fin Funcion

//Si le declaramos la variable resultado a la funsión, hay que pasarle los argumentos, num1 y num2 en este caso, e indicar que hace la Funcion 
Funcion resultado <- RestarNumeros ( num1, num2 )
	resultado <- num1 - num2
Fin Funcion

//También se puede declarar sin asignar la variable al declarar la función y hacerlo dentro de ella.
Funcion SumarNumeros ( num1, num2 )
	c <- num1 + num2;
	Escribir "El resultado de sumar num1 y num2 es: ", c;
FinFuncion


Algoritmo elMayorDeTres	
	Escribir "Indica el primer número";
	Leer num1;
	Escribir "Indica el segundo número";
	Leer num2;
	Escribir "Indica el tercer número";
	Leer num3;
	
	Si num1 > num2 Y num1 > num3 Entonces
        Escribir "El número mayor es: ", num1
    Sino 
        Si num2 > num1 Y num2 > num3 Entonces
            Escribir "El número mayor es: ", num2
        Sino
            Escribir "El número mayor es: ", num3
        Fin Si
    Fin Si
	
	//Con "Defininir Como.." indicamos que tipo de variable va a ser
	Definir number Como Entero;
	Definir char Como Caracter;
	Definir log Como Logico;
	Definir rea Como Real;
	
	Definir number1 Como Entero;
	Definir number2 Como Entero;
	Definir resul Como Entero;
	
	SumarNumeros(num1, num2);
	Escribir "El resultado de restar num1 y num2 es: ", RestarNumeros(num1, num2);
	mostrar_hola(sinargumento);
	
	Escribir "Vamos a sumar number1 con number2, indica number 1";
	Leer number1;
	Escribir "Indica number2";
	Leer number2;
	
	resul <- number1 + number2;
	
	Escribir "El resultado de sumar number1 + number2 es : ", resul;
	
	//explicación de bucle for
	Escribir "Ahora vamos a enseñar un bucle for que imprime de 1 a 10:"
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir contador;
	Fin Para
	
	//ARRAYS
	//en PSeint los array se llaman Dimension y empiezan en 1
	Dimension  array[3];
	
	array[1] <- 100;
	array[2] <- 200;
	array[3] <- 300;
	
	Escribir "Mi array tiene estos valores:"
	Escribir "El elemento 1: ", array[1];
	Escribir "El elemento 2: ", array[2];
	Escribir "El elemento 3: ", array[3];
	
	//Ahora vamos a rellenar un array con un bucle for
	Escribir "Ahora vamos a rellenar otro array que se llama arrayConBucle con 5 elementos"
	
	Dimension arrayConBucle[5];
	//rellenamos
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		arrayConBucle[i]<- i;
	Fin Para
	//imprimimos recorriendo el array
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir arrayConBucle[i];
	Fin Para
	
	//Para pedir los elementos desde consola para un array
	
	Dimension arrayARellenar[5];
	//rellenamos
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Ingrese un número para rellenar el array1 en la posición : ", i;
		Leer arrayARellenar[i];
	FinPara
	//mostramos
	Escribir "El contenido del array1 es: ";
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir  arrayARellenar[i];
	FinPara
	
	//Si queremos pedir el tamaño del array 
	Escribir "Ingresa en tamaño del array2";
	Leer tamano;
	Dimension array2[tamano];
	//rellenamos
	Para i<-1 Hasta tamano Con Paso 1 Hacer
		Escribir "Ingrese un número para rellenar el array en la posición : ", i;
		Leer array2[i];
	FinPara
	//mostramos
	Escribir "El contenido del array2 es: ";
	Para i<-1 Hasta tamano Con Paso 1 Hacer
		Escribir  array2[i];
	FinPara

	
	// operadores lógicos O e Y, no deja escribir los simbolos de o e y 
	compararConO <- 10;
	Si compararConO > 5 O compararConO < 20 Entonces
		Escribir "El valor de ", compararConO, " es mayor que 5 O es menor que 20"
	SiNo
		Escribir "no cumple con ninguna de las dos opciones"

	Fin Si
	Si compararConO > 12 Y compararConO < 20 Entonces
		Escribir "compararConO es mayor que 5 O es menor que 20"
	SiNo
		Escribir "no cumple con una de las dos opciones"
		
	Fin Si
	
	//*******************Promedio******************************
	prom <- 89 / 10;
	Escribir "El promedio es ", prom;
	
	//Vamos a crear una secuencia que pida cuantas materias tienes y el promedio de las notas que saca, pidiendo las notas de cada materia
	
	Escribir "Ingrese la cantidad de materias";
	Leer mat;
	//creamos una variable acumulador
	acum <- 0;
	
	Para i<-1 Hasta mat Con Paso 1 Hacer
		
		Escribir "Ingresa la calificación de la materia ", i;
		Leer calif;
		
		acum <- acum + calif;
		
	FinPara
	
	prom <- acum / mat;
	Escribir "El promedio es ", prom;
	
	
	//Variantes de Dimensiones (Arrays) Matriz, lo que son tablas x - y, en PSeint los arrays empiezan en 1 no en 0 ***********************
	
	//En Pseint se crea un array bidimensional así, no como java int[][] array = new int[][]
	Dimension nums[3,3];
	nums[1,1] <- 10;
	nums[2,1] <- 20;
	nums[3,1] <- 30;
	
	Escribir "El elemento 1 - 1 es : ", nums[1,1];  //output 10
	
	// Para rellenar una matriz bidimensional se tiene que anidar dos bucles
	
	Escribir "La matríz bidimesional rellena del 1 al 9";
	cont <- 1;
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Para j<-1 Hasta 3 Con Paso 1 Hacer
			nums[i, j] <- cont;
			cont <- cont + 1;
		Fin Para
	Fin Para
	
	Para k<-1 Hasta 3 Con Paso 1 Hacer
		Para l<-1 Hasta 3 Con Paso 1 Hacer
			Escribir nums[k, l];
		Fin Para
	Fin Para
	
	//CALCULADORA*************************
	Escribir "Elije la operación que quieras realizar:";
	//Repetir se comporta como bucle do while
	Repetir
		Escribir "1.- Suma";
		Escribir "2.- Resta";
		Escribir "3.- Multiplicación";
		Escribir "4.- División";
		
		Leer opc;
		//Esto es un switch 
		Segun opc Hacer
			1:
				Escribir "Elegiste hacer una SUMA";
			2:
				Escribir "Elegiste hacer una RESTA";
			3:
				Escribir "Elegiste hacer una MULTIPLICACIÓN";
			4:
				Escribir "Elegiste hacer una DIVISIÓN";
			De Otro Modo:
				Escribir "Elegiste una opción INCORRECTA";
		Fin Segun
		
	Hasta Que opc > 0 Y opc < 5;
	
	
FinAlgoritmo




