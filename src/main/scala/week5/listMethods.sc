package week5

object week5test {

  // init: all elements except the last element
  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y::init(ys)
  }

  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n+1)
  //usage
  //removeAt(1, List('a', 'b', 'c', 'd')) // List(a, c, d)

}

