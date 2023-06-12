
  //criando uma class
 class Car {
  var marca = ""
  var modelo = ""
  var ano = 0
} 
 
 // CRIANDO OUTRA CLASSE
 class Carros (var marca: String, var modelo: String, var ano: Int)


 
//função principal
fun main() {

  
  var fd = Carros("Ford", "Fusca", 1989)

 

 //CRIANDO OBJETO
 var c1 = Car()

//ATRIBUINDO VALORES
c1.marca = "PPK"
c1.modelo = "XOTROLÉ"
c1.ano= 2023

//PRINTANDO VALORES NA TELA
println(c1.marca)   
println(c1.modelo)  
println(c1.ano) 

println(fd.marca)   
println(fd.modelo)  
println(fd.ano) 

}
