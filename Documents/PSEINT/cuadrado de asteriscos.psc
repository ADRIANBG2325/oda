Algoritmo cuateriscos
	Definir r Como Caracter
	Imprimir "dime un numero "
	leer x
	i=1
	r=" * "
	t="   "
	mientras (i<=x) Hacer
		j=j+r
		i=i+1
	FinMientras
	imprimir j
	e=1
	Mientras (e<(x-1))
		p=1
		mientras (p<=x)
			si p=1 o p=x
				k=k+r
			SiNo
				k=k+t
			FinSi
			p=p+1
		FinMientras
		imprimir k
		k=""
		e=e+1
	FinMientras
	si x>1
		u=1
		mientras (u<=x) Hacer
			z=z+r
			u=u+1
		FinMientras
		imprimir z
	FinSi
FinAlgoritmo
