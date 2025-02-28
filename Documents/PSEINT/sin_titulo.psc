Algoritmo sin_titulo
	Definir monto,b500,b200,b100,b50,b20,m10 Como Entero
	b500<-0;
	b200<-0
	b100<-0
	b50<-0
	b20<-20
	p10<-0
	Escribir Sin Saltar"monto de dinero : $"
	leer monto
	b1000<-trunc(monto/1000)
	monto<-monto%1000
	b500<-trunc(monto/500)
	monto<-monto%500
	b200<-trunc(monto/200)
	monto<-monto%200
	b100<-trunc(monto/100)
	monto<-monto%100
	b50<-trunc(monto/50)
	monto<-monto%50
	b20<-trunc(monto/20)
	monto<-monto%20
	p10<-trunc(monto/10)
	monto<-monto%10
	p5<-trunc(monto/5)
	monto<-monto%5
	p2<-trunc(monto/2)
	//monto<-monto%2
	p1<-trunc(monto/1)
	//monto<-monto%1
	Escribir "cantidad de billetes de 1000 : ",b1000
	Escribir "cantidad de billetes de 500 : ",b500
	Escribir "cantidad de billetes de 200 : ",b200
	Escribir "cantidad de billetes de 100 : ",b100
	Escribir "cantidad de billetes de 50 : ",b50
	Escribir "cantidad de billetes de 20 : ",b20
	Escribir "cantidad de monedas de 10 : ",p10
	Escribir "cantidad de monedas de 5 : ",p5
	Escribir "cantidad de moneda de 2 : ",p2
	Escribir "cantidad de monedas de 1 : ",p1
FinAlgoritmo
