fun main (){

println("Digite um numero inteiro: ")
   var num1=readLine()!!
   var numero1=num1.toInt()
   println("Digite outro numero: ")
   var num2=readLine()!!
   var numero2=num2.toInt()
   var soma=numero1+numero2
   println("A soma é: "+soma)
   //agora inclua as funcionalidades de subtração multiplicação e divisão
   var sub=numero1-numero2
   var multi=numero1*numero2
   var div=numero1/numero2
   println("A subtração é: "+ sub)
   println("A multiplicação é: "+ multi)
   println("A Divisão é: "+ div)

}
