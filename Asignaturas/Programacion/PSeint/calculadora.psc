Funci�n Suma (argumento)
	Escribir 'Indica el primer n�mero'
	Leer num1
	Escribir 'Indica el segundo n�mero'
	Leer num2
	res <- num1+num2
	Escribir 'El resultado de sumar ', num1, ' y ', num2, ' es: ', res
FinFunci�n

Funci�n Resta (argumento)
	Escribir 'Indica el primer n�mero'
	Leer num1
	Escribir 'Indica el segundo n�mero'
	Leer num2
	res <- num1-num2
	Escribir 'El resultado de restar ', num1, ' y ', num2, ' es: ', res
FinFunci�n

Funci�n Multiplicacion (argumento)
	Escribir 'Indica el primer n�mero'
	Leer num1
	Escribir 'Indica el segundo n�mero'
	Leer num2
	res <- num1*num2
	Escribir 'El resultado de multiplicar ', num1, ' y ', num2, ' es: ', res
FinFunci�n

Funci�n Division (argumento)
	Escribir 'Indica el primer n�mero'
	Leer num1
	Escribir 'Indica el segundo n�mero'
	Leer num2
	res <- num1/num2
	Escribir 'El resultado de dividir ', num1, ' y ', num2, ' es: ', res
FinFunci�n

Funci�n Porcentaje (argumento)
	Escribir 'Indica el n�mero'
	Leer num1
	Escribir 'Indica el porcentaje que quieres saber'
	Leer num2
	res <- (num2/100)*num1
	Escribir 'El ', num2, ' porciento de ', num1, ' es: ', res
FinFunci�n

Algoritmo calculadora
	Escribir 'Elije la operaci�n que quieras realizar:'
	Repetir
		Escribir '1.- Suma'
		Escribir '2.- Resta'
		Escribir '3.- Multiplicaci�n'
		Escribir '4.- Divisi�n'
		Escribir '5.- Porcentaje'
		Leer opc
		Seg�n opc Hacer
			1:
				Escribir 'Elegiste hacer una SUMA'
				Suma(argumento)
				Definir sumando Como Entero
			2:
				Escribir 'Elegiste hacer una RESTA'
				Resta(argumento)
			3:
				Escribir 'Elegiste hacer una MULTIPLICACI�N'
				Multiplicacion(argumento)
			4:
				Escribir 'Elegiste hacer una DIVISI�N'
				Division(argumento)
			5:
				Escribir 'Elegiste calcular el Porcentaje'
				Porcentaje(argumento)
			De Otro Modo:
				Escribir 'Elegiste una opci�n INCORRECTA'
		FinSeg�n
	Hasta Que opc>0 Y opc<6
FinAlgoritmo
