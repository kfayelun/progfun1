package week4

trait Expr {
  def paranProd(ep: Expr): String = ep match {
    case Product(ll, rr) => "(" + show(ll) + " * " + show(rr) + ")"
    case _ => show(ep)
  }

  def paranSum(ep: Expr): String = ep match {
    case Sum(ll, rr) => "(" + show(ll) + " + " + show(rr) + ")"
    case _ => show(ep)
  }

  def show(e: Expr): String = e match {
    case Number(n) => n.toString
    case Var(a) => a.toString
    // why is r a string below but l is Expr when in show(l) ?
    //    case Sum(l, r) => { show(l) + " + " + r match {
    //      case Product(ll, rr) => "(" + show(ll) + " * " + show(rr) + ")"
    //    }}
    case Sum(l, r) => show(l) + " + " + paranProd(r)
    case Product(l, r) => show(l) + " * " + paranSum(r)

  }
}
case class Number(n: Int) extends Expr
case class Sum(l: Expr, r: Expr) extends Expr
case class Var(n: Int) extends Expr
case class Product(l: Expr, r: Expr) extends Expr

