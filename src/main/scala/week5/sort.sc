//package week5

object mergeSortTest {
// can also use scala.math.Ordering std lib
  def msort[T](xs: List[T])(implicit lt: (T, T) => Boolean ): List[T] = {
    val n = xs.length/2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, y) => y
          case (x, Nil) => x
          case (x::xs1, y::ys1) =>
            if (lt(x, y)) x::merge(xs1, ys)
            else y::merge(xs,ys1)

        }
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }
  }

  val numb = List(2, -6, 3, 6, 3, 4)
  val fruit = List("apple", "banana", "orange")
  msort(numb)((x: Int, y: Int) => x < y)
  msort(fruit)((x: String, y: String) => x.compareTo(y) < 0)
}