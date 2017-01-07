package ch1

import org.scalatest.FunSuite

/**
  * Created by jason.kim on 2017. 1. 7..
  */
class FuseSuite extends FunSuite {
  test("Fuse Some and None is must be None") {
    assert(Fuse.fuse(Some(10), None).isEmpty)
  }

  test("Fuse None and Some is must be None") {
    assert(Fuse.fuse(None, Some(10)).isEmpty)
  }

  test("Fuse Some and Some is must be Some") {
    assert(Fuse.fuse(Some(10), Some("10")).isDefined)
  }

  test("Fuse None and None is must be None") {
    assert(Fuse.fuse(None, None).isEmpty)
  }
}
