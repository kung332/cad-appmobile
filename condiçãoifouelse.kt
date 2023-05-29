fun main(args: Array<String>) {
  println("Qual seu nome:")
  val nome = readLine ()!!
  println("Olá " +nome)

  println("Qual sua idade:")
  val idade = readLine ()!!
  val num = idade.toInt()
  
  if ( num >= 18 ) {
    println ("Você é maior de idade")
  }else{
    println  ("Você é menor de              idade") 
  }
}