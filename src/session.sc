object session {

  println(14 % 21)
  println("Welcome to the scala worksheet")
  def abs(x: Double) = if (x<0) - x else x

  def sqrt (x: Double) = {
    def sqrtInter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtInter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtInter(1.0)
  }

  sqrt(2)
  sqrt(4)
  sqrt(0.000001)

  

}