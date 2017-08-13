
object higherOrderFunct {

  def squareList1(xs: List[Int]): List[Int] =
    xs match {
      case Nil => xs
      case y :: ys => y*y :: squareList1(ys)
    }


  def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x * x)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
//      xs takeWhile(y => y == x) :: pack(xs drop (y => y == x))
      val (first, rest) = xs span(y => y == x)
      first :: pack(rest)
  }

  def encode[T](xs: List[T]): List[(T, Int)] = {
    pack(xs) map (ys => (ys.head, ys.length))
  }

  val nums = List(2, -6, 3, 6, 3, 4)
  val fruit = List("apple", "banana", "orange")
  val charss = List("a", "a", "a", "b", "c", "c", "a")

  nums filter (x => x > 0)
  nums filterNot (x => x > 0)
  nums partition (x => x > 0)

  nums takeWhile (x => x > 0)
  nums dropWhile (x => x > 0)
  nums span (x => x > 0)

  pack(charss)
  encode(charss)
}