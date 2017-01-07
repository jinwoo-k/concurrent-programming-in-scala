package ch1

import org.scalatest.FunSuite

/**
  * Created by jason.kim on 2017. 1. 7..
  */
class PermutationSuite extends FunSuite {
  test("Test permutation1") {
    assert(Permutation.permutation1("abc def") == Seq("a", "b", "c", " ", "d", "e", "f"))
  }

  test("Test permutation2") {
    assert(Permutation.permutation2("abc def") == Seq("abc", "def"))
  }
}
