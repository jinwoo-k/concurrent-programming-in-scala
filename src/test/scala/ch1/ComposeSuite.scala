package ch1

import org.scalatest.FunSuite

/**
  * Created by jason.kim on 2017. 1. 7..
  */
class ComposeSuite extends FunSuite {
  test("Compose a id method should return input value") {
    def id[A](a: A): A = a
    def idCompose[A](a: A): A = Compose.compose(id[A], id[A])(a)

    assert("10" == idCompose("10"))
  }

  test("Compose doubleToInt and intToString methods") {
    def doubleToInt(d: Double): Int = d.toInt
    def intToString(i: Int): String = i.toString

    def doubleToIntString(d: Double): String = Compose.compose(intToString, doubleToInt)(d)

    assert("10" == doubleToIntString(10.0))
  }

}
