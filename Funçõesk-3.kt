//criar uma função passando um parâmetro
fun meuNome (nome: String){
  println("Seu nome é: "+nome)
  
}

//crie uma função que retorne  true ou false
fun verdadeirooufalso (x: Boolean){
 println(x)
  }

// crie uma função que verifica a idade passada como parametro, se é maior de idade

fun seramaior (y: Int){ 
if (y >= 18) {
  println("Maior de idade")
} else {
  println("Dane-se")
  }
}

    
//crie uma funçãp que passa doi9s parametros interios a e b, a função retorna a soma dos dois valores

fun somadeparametros (x: Int, p: Int): Int {
  return (x + p)
}


    
//função principal kotlin
fun main() {
  meuNome("Gabriel Henrique ")
  verdadeirooufalso (true)
  verdadeirooufalso (false)
  seramaior(11)

  var resultado = somadeparametros (4000, 1 )
  println ( resultado )
  }
  
