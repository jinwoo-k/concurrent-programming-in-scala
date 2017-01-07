package ch1

/**
  * Created by jason.kim on 2017. 1. 7..
  */
object Compose{
  def compose[A, B, C](g: B => C, f: A => B): A => C = a => g(f(a))

  def composeTest(): Unit = {
    def doubleToInt(d: Double): Int = d.toInt
    def intToString(i: Int): String = i.toString

    def doubleToIntString(d: Double): String = compose(intToString, doubleToInt)(d)

    assert("10" == doubleToIntString(10.1))
  }

  composeTest()
}
