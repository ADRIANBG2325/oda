Algoritmo sin_titulo
	Imprimir "dime el primer numero"
	leer n1
	imprimir"dime el segundo numero"
	leer n2
	Imprimir "dime el tercer numero"
	leer n3
	si(n1<n2) y (n1<n3) y (n2<n3)
		Imprimir n3 ">" n2 ">" n1
	SiNo
		si(n1>n2) y (n2>n3) y (n1>n3)
			Imprimir n1 ">" n2 ">" n3
		SiNo
			si(n2>n1) y (n2>n3) y (n1<n3)
				Imprimir n2 ">" n3 ">" n1
			SiNo
				si (n3>n1) y (n2<n3) y (n1>n2)
					Imprimir n3 ">" n1 ">" n2
				SiNo
					si(n1<n2) y (n2>n1) y (n3<n2)
						Imprimir n2 ">" n1 ">" n3
					SiNo
						si(n1=n2) y (n2<n3)
							Imprimir n3 ">" n2 "=" n1
						SiNo
							si(n3=n2) y (n1<n2)
								imprimir n3 "=" n2 ">" n1
							sino 
								si (n1=n3) y (n3<n2)
									Imprimir n2 ">" n3 "=" n1
								sino 
									si(n1=n2) y (n2=n3)
										Imprimir n1 "=" n2 "=" n3
									SiNo
										si(n1=n3) y (n2<n3)
											Imprimir n1 "=" n3 ">" n2
											si(n2=n3) y (n1>n2)
												Imprimir n1 ">" n2 "=" n3
											SiNo
												si(n1=n2) y (n3<n1)
													Imprimir n2 "=" n1 ">" n3
												FinSi
											FinSi
										FinSi
									finsi
									finsi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
FinAlgoritmo
