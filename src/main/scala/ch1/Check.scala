package ch1

import scala.annotation.tailrec

/**
  * Created by jason.kim on 2017. 1. 7..
  */
object Check{
  @tailrec
  def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = xs match {
    case Seq() => true
    case Seq(x, xs@_*) if pred(x) => check(xs)(pred)
    case _ => false
  }
}
