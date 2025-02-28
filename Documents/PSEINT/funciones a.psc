Algoritmo Funciones
	escribir "1.FIBONACI,2.FACTORIAL,3.CUADRADOS,4.TABLAS,5.GENERAR TABLAS" 
	leer G
				Segun G Hacer
					CASO 1:
						Fibonaci(A1,B)
					CASO 2:
						Factorial(A,AC)
				CASO 3 :
					Cuadrados(X2,Z2,M2)
				CASO 4:TablasMultiplicar(e,c)
					CASO 5:GenerarTablaMultiplicar(resultado,numero)
					De Otro Modo:
						Escribir "TODO MAL"
				Fin Segun
			
FinAlgoritmo
Funcion Fibonaci(A1,B)
	imprimir "hasta que numero quieres la tabla"
	leer X
	A=1
	B=1
	C=0
	Imprimir "Tabla de Fibonaci"
	mientras (A<=X)
		R=B+C
		imprimir A " | " R
		B=C
		C=R
		A=A+1
	FinMientras
	FinFuncion	
Funcion Factorial(A,AC)
	imprimir "que numero decea sacar su factorial"
	leer X
	A=1
	AC=1
	Mientras (A<=X)
		AC=AC*A
		A=A+1
	FinMientras
	imprimir " el factorial de " X " es " AC
	FinFuncion
	
	Funcion Cuadrados (X2,Z2,M2)
		Imprimir "z^2=w^2+x^2"
		Imprimir "que numero es z"
		Leer z
		Imprimir "que numero es w"
		leer w
		Imprimir "que numero es x"
		leer x
		si z^2=w^2+x^2 Entonces
			Imprimir "¡es correcto!"
		SiNo
			Imprimir "¡algo anda mal, es incorrecto!"
		FinSi
FinFuncion

Funcion TablasMultiplicar(e,c)
	imprimir "dime el numero de tabla que decea realizar"
	leer x
	b=1
	mientras(b<=x)
		A=1
		Mientras (A<=10)
			r=X*A
			imprimir b "*" A "=" r
			A=A+1
		fin mientras
		b=b+1
	FinMientras
	Fin Funcion
	
	Funcion GenerarTablaMultiplicar(resultado,numero)
		imprimir "dime el numero de tabla que decea realizar"
		leer x
		A=1
		Mientras (A<=10)
			r=X*A
			imprimir X "*" A "=" r
			A=A+1
		FinMientras
	Fin Funcion