package week4
import week3._

object list {
  // List(1,2)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
  def apply[T](x1: T): List[T] = new Cons(x1, new Nil)
  // List()
  def apply() = new Nil

  /* pseudo code from lecture 4.7
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y::ys => insert(y, isort(ys))

  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
      if (x <= y) x::xs
      else y::insert(x, ys)
    }
  }
  */
}
