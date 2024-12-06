Función Suma (argumento)
	Escribir 'Indica el primer número'
	Leer num1
	Escribir 'Indica el segundo número'
	Leer num2
	res <- num1+num2
	Escribir 'El resultado de sumar ', num1, ' y ', num2, ' es: ', res
FinFunción

Función Resta (argumento)
	Escribir 'Indica el primer número'
	Leer num1
	Escribir 'Indica el segundo número'
	Leer num2
	res <- num1-num2
	Escribir 'El resultado de restar ', num1, ' y ', num2, ' es: ', res
FinFunción

Función Multiplicacion (argumento)
	Escribir 'Indica el primer número'
	Leer num1
	Escribir 'Indica el segundo número'
	Leer num2
	res <- num1*num2
	Escribir 'El resultado de multiplicar ', num1, ' y ', num2, ' es: ', res
FinFunción

Función Division (argumento)
	Escribir 'Indica el primer número'
	Leer num1
	Escribir 'Indica el segundo número'
	Leer num2
	res <- num1/num2
	Escribir 'El resultado de dividir ', num1, ' y ', num2, ' es: ', res
FinFunción

Función Porcentaje (argumento)
	Escribir 'Indica el número'
	Leer num1
	Escribir 'Indica el porcentaje que quieres saber'
	Leer num2
	res <- (num2/100)*num1
	Escribir 'El ', num2, ' porciento de ', num1, ' es: ', res
FinFunción

Algoritmo calculadora
	Escribir 'Elije la operación que quieras realizar:'
	Repetir
		Escribir '1.- Suma'
		Escribir '2.- Resta'
		Escribir '3.- Multiplicación'
		Escribir '4.- División'
		Escribir '5.- Porcentaje'
		Leer opc
		Según opc Hacer
			1:
				Escribir 'Elegiste hacer una SUMA'
				Suma(argumento)
				Definir sumando Como Entero
			2:
				Escribir 'Elegiste hacer una RESTA'
				Resta(argumento)
			3:
				Escribir 'Elegiste hacer una MULTIPLICACIÓN'
				Multiplicacion(argumento)
			4:
				Escribir 'Elegiste hacer una DIVISIÓN'
				Division(argumento)
			5:
				Escribir 'Elegiste calcular el Porcentaje'
				Porcentaje(argumento)
			De Otro Modo:
				Escribir 'Elegiste una opción INCORRECTA'
		FinSegún
	Hasta Que opc>0 Y opc<6
FinAlgoritmo
