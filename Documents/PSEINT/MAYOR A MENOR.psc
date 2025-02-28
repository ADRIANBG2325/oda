Algoritmo sin_titulo
	imprimir "Dime 3 numeros"
	Leer  N1
	Leer N2
	Leer N3
	Si N3>=N2 Y N2>N1
		Imprimir N3 "," N2 "," N1
	SiNo
		SI N2>=N3 Y N3>N1
			Imprimir N2 "," N3 "," N1
		SiNo
			SI N1>=N3 Y N3>N2 Entonces
				Imprimir N1 "," N3 "," N2
			SiNo
				SI N1<=N3 y N3<=N2
					Imprimir N2 "," N3 "," N1
				SiNo
					SI N2<=N3 Y N3<N1
						Imprimir N1 "," N3 "," N2 
					SiNo
						SI N3<=N2 Y N2<N1
							Imprimir N1 "," N2 "," N3
						SiNo
							SI N3=N2=N1
								Imprimir N1 "," N2 "," N3
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
