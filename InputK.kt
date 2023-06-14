fun main() {
  println ( "Digite algo ")
  var texto=readLine()!!
  println (texto+ " Igual Escola Palmira ")


  // Faça um progama em kotlin que receba dois numeros interios e o progame faz a soma dos numeros

  println ("BEM A CALCULADORA SOMATORIA ")
  println ("CONTA DE ADIÇÃO")
  println ("Digite o primeiro número da somátória ")
  var num1=readLine()!!
  var numero1 = num1.toInt()
  
  println ("Digite o segundo número da somátória ")
  var num2=readLine()!!
  var numero2 = num2.toInt()
  
  var soma=numero1+numero2
  println (soma)

  // Faça agora todas outras 3 operações

  // SUBTRAÇÃO
    
  println ("BEM A CALCULADORA SOMATORIA ")
  println ("CONTA DE SUBTRAÇÃO")
  println ("Digite o primeiro número da SUBTRATÓRIA ")
  
  var nume1=readLine()!!
  var nume11 = nume1.toInt()
  
  println ("Digite o segundo número da SUBTRATÓRIA ")
  var nume2=readLine()!!
  var nume22 = nume2.toInt()
  
  var subtracao=nume11-nume22
  println (subtracao)


  // DIVISÃO
  println ("BEM A CALCULADORA SOMATORIA ")
  println ("CONTA DE DIVISÃO")
  println ("Digite o primeiro número da DIVISÓRIA  ")
  
  var numer1=readLine()!!
  var numer11 = numer1.toInt()
  
  println ("Digite o segundo número da DIVISÓRIA ")
  var numer2=readLine()!!
  var numer22 = numer2.toInt()
  
  var divisao=numer11/numer22
  println (divisao)

  // MULTIPLICAÇÃO
  println ("BEM A CALCULADORA SOMATORIA ")
  println ("CONTA DE MULTIPLICAÇÃO")
  println ("Digite o primeiro número da MULTIPLICATÓRIA ")
  
  var numeros1=readLine()!!
  var numeros11 = numeros1.toInt()
  
  println ("Digite o segundo número da MULTIPLICATÓRIA ")
  var numeros2=readLine()!!
  var numeros22 = numeros2.toInt()
  
  var multiplicacao=numeros11/numeros22
  println (multiplicacao)

}
