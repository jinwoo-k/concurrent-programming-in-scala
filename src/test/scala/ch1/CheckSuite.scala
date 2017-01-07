package ch1

import org.scalatest.FunSuite

/**
  * Created by jason.kim on 2017. 1. 7..
  */
class CheckSuite extends FunSuite {
  test("Empty seq must be true") {
    assert(Check.check(Seq.empty[Int])(40 / _ > 0))
  }

  test("Test false case") {
    assert(!Check.check(-1 to 10)(_ > 0))
  }

  test("Test true case") {
    assert(Check.check(0 until 10)(i => i >= 0))
  }
}
