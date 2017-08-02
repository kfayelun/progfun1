package week4

trait Expr
case class Number(n: Int) extends Expr
case class Sum(l: Expr, r: Expr) extends Expr
case class Var(n: Int) extends Expr
case class Product(l: Expr, r: Expr) extends Expr
