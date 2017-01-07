package ch1

/**
  * Created by jason.kim on 2017. 1. 7..
  */
object Permutation{
  def permutation1(x: String): Seq[String] = {
    x.foldLeft(Seq.empty[String])((acc, c) => acc :+ c.toString)
  }

  def permutation2(x: String): Seq[String] = {
    x.split("\\s+").foldLeft(Seq.empty[String])(_ :+ _)
  }
}
