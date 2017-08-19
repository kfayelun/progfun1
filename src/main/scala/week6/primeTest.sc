
object primeTest {

  /** Task: given a positive integer n, find all pairs of positive integers
    * i and j, with 1 <= j < i < n so that i + j is prime*/

  def isPrime(n: Int) = (2 until n) forall(n % _ != 0 )
  val n = 7

  // testing typical nested for-loop made with map
  val xss = (1 until n) map (i =>
    (1 until n) map (j => (i, j)))

  (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2))

//  Alternative:
//  (xss foldRight Seq[Int]())(_ ++ _) errors


}