Algoritmo Funciones
	escribir "dime un numero" 
	leer x
	Escribir "dime un numero"
	leer x2
	Fibonaci(a1,b)
	Factorial(A,AC)
	TablasMultiplicar(e,c)
	Cuadrados(z,m,n)
	GenerarTablaMultiplicar(resultado,numero)
FinAlgoritmo
Funcion Fibonaci(A1,B)
		a1 = 1
		b = 1
		a = 1
		Mientras (a1 <= x ) Hacer
			c = a + b
			
			Escribir a1, "|" , b
			a = b
			b = c
			a1 = a1 + 1
		Fin Mientras
		Imprimir "el resultado es" a
	FinFuncion	
Funcion Factorial(A,AC)
		A = 1
		AC = 1
		Mientras (A <= numero) Hacer
			AC = AC * A
			A = A + 1
		Fin Mientras
		imprimir "el resultado es: " AC
	FinFuncion
	
	Funcion Cuadrados (X2,Z2,M2)
		Escribir "Números que cumplen con la fórmula x² = m² + z² dentro del rango de 1 a ", n, " son:"
		Para x = 1 Hasta n Hacer
			Para m = 1 Hasta n Hacer
				Para z = 1 Hasta n Hacer
					Si x*x = m*m + z*z Entonces
						Escribir "x=", x, ", m=", m, ", z=", z
					FinSi
				FinPara
			FinPara
		FinPara
FinFuncion

Funcion TablasMultiplicar(e,c)
		Escribir "Tablas de multiplicar del 1 al", r, ":"
		e <- 1
		c <- r
		dimension matriz[r, c]
		Mientras (e <= r) Hacer
			m <- 1
			Mientras (m <= c) Hacer
				matriz[e, m] <- e * m
				m <- m + 1
			FinMientras
			e <- e + 1
		FinMientras
		s <- 1
		Mientras (s <= r) Hacer
			n <- 1
			Mientras (n <= c) Hacer
				Escribir SinSaltar matriz[s, n], " "
				n <- n + 1
			FinMientras
			Escribir "" 
			s <- s + 1
		FinMientras
	Fin Funcion
	
	Funcion GenerarTablaMultiplicar(resultado,numero)
		Escribir "Tabla de multiplicar del ", numero, ":"
		Para i = 1 Hasta 10 Hacer
			resultado = numero * i
			Escribir numero, " x ", i, " = ", resultado
		FinPara
	Fin Funcion