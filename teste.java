public boolean saque(double valor){
boolean status = false;
//1
if(valor <= saldo){ //1
//2
saldo = saldo valor;
status=true;
3
else{
if(valor <= limiteCredito){
//3
limiteCredito = limiteCredito - valor; /7/4
status = true; //4
}
//5
return status;