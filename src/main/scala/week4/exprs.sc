package week4


object exprs {
  def show(e: Expr): String = e match {
    case Number(n) => n.toString
    case Var(a) => a.toString
    case Sum(l, r) => show(l) + " + " + show(r)
    case Product(l, r) => show(l) + " * " + show(r)
  }

  println(show(Sum(Number(1), Number(22))))
}