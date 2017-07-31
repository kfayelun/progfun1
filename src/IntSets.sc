object intsets {

}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Boolean): Boolean
}

class NonEmpty(element: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < element) left contains x
    else if (x > element) right contains x
    else true //we have the element we are looking for, x == element

  def incl(x: Int): IntSet =
    if (x < element) new NonEmpty(element, left incl x, right)
    else if (x > element) new NonEmpty(element, left, right incl x)
    else this
}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
}

