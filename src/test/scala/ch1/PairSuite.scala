package ch1

import org.scalatest.FunSuite

/**
  * Created by jason.kim on 2017. 1. 7..
  */
class PairSuite extends FunSuite {
  test("Test pattern Matching") {
    val a = "asdf"
    val b = 1010

    val p = Pair(a, b)
    p match {
      case Pair(aa, bb) => assert(a == aa && b == bb)
    }
  }
}
