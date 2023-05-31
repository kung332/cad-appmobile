fun main(args: Array<String>) {
  class Carro {
    var marca = ""
    var modelo = ""
    var ano = 0
  }
  // Criando o obejto fuca na classe   Carrp
  val fuca = Carro()

  // Acessando a propiedades e desiguinando valores
  fuca.marca = "Wolks"
  fuca.modelo = "Fuca"
  fuca.ano = 1975

  println(fuca.marca) // Mostra Wolks
  println(fuca.modelo) // Mostra Fuca
  println(fuca.ano) // Outputs 1975

  // instanciar outro carro e imprimir atributos

  println("Teste do Carro Maralo")

  val maralo = Carro()

  maralo.marca = "Martilhes"
  maralo.modelo = "Maralo"
  maralo.ano = 1976

  println(maralo.marca)
  println(maralo.modelo)
  println(maralo.ano)
}
