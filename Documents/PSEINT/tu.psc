Algoritmo tu cambio
	Definir monto,b500,b200,b100,b50,b20,m10 Como Entero
	p<-10
	b<-50
	b<-100
	b<-200
	b<-500
	Escribir Sin Saltar"monto de dinero : $"
	leer monto
	b200<-trunc(monto/200)
	monto<-monto%200
	b500<-trunc(monto/500)
	monto<-monto%500
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
	Escribir "500 : ",b500
	Escribir "200 : ",b200
	Escribir "100 : ",b100
	Escribir "50 : ",b50
	Escribir "20 : ",b20
	Escribir "10 : ",p10
	Escribir "5 : ",p5
	Escribir "2 : ",p2
	Escribir "1 : ",p1
FinAlgoritmo
