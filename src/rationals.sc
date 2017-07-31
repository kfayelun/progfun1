object rationals {
  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)

  x.sub(y).sub(z)
  y.add(y)
  x.less(y)

  x max y

}

class Rational(x: Int, y: Int) {
  require(y != 0, "denum must be nonzero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def numer = x
  def denum = y

  def less(that: Rational) = numer * that.denum < that.numer * denum

  def max(that: Rational) = if (this.less(that)) that else this

  def add(that: Rational) = new Rational(
      numer * that.denum + that.numer * denum,
      denum * that. denum)

  def neg: Rational = new Rational(-numer, denum)

  def sub(that: Rational) = add(that.neg)

  override def toString = {
    val g = gcd(numer, denum)
    numer + "/" + denum
  }

}