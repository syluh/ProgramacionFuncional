// Representa la función de la raiz cuadrada de un número
def funcionX(x:Double, num:Int): Double = Math.pow(x,2) - num
// Representa la derivada de la función anterior
def derivadaX(x: Double): Double = 2 * x
// Funcion basada en rangos
def metodoNewtonPahson(num: Int): Double = {
  var x = 1.0 // Se declara como double
  (1 to 4).foreach(i => x = x - (funcionX(x, num) / derivadaX(x)))
  return x
}
// Se aplica la funcion para calcular la raíz cuadrada de 10
metodoNewtonPahson( 10)