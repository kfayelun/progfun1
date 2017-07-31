import week3._

object nth {
  println("scala worksheet")

  // n gets smaller until 0, if theres still anything in the list then
  // return that, if not we are unsuccessful
  def nth[T](n: Int, xs: List[T]): T = {
    if(xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n-1, xs.tail)
  }

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  nth(2, list)
  nth(4, list)
  nth(-1, list)


}