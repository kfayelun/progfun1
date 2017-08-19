
object collectionTests {

  val xs = Array(1, 2, 3, 44)
  xs map (x => x * 2)

  val s = "Hello World"
  s filter (c => c.isUpper)

  s exists(c => c.isUpper)
  s forall(c => c.isUpper)

  val pair = List(1, 2, 3) zip s
  pair.unzip

  s flatMap (c => List('.', c))

  val romanNumerals = Map( "I" -> 1, "V" -> 5, "X" -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

  capitalOfCountry("US")

//  do we have the key in map?
  capitalOfCountry get "andorra"

  val fruit = List("apple", "pear", "orange", "pineapple")
  fruit sortWith(_.length < _.length)
  fruit.sorted

  fruit.groupBy( _.head )
}