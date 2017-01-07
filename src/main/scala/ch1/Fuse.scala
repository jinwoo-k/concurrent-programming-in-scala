package ch1

/**
  * Created by jason.kim on 2017. 1. 7..
  */
object Fuse{
  def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = {
    for {
      aa <- a
      bb <- b
    } yield (aa, bb)
  }
}
