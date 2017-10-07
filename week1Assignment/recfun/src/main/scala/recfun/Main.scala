package recfun


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

      if (c > r) throw new IllegalArgumentException()
      else if (c==0 || r == 0 || c == r) 1
      else pascal(c-1, r-1) + pascal(c, r-1)

    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def balanceHelper(charList: List[Char], acc: Int): Boolean = {
        if (charList.isEmpty || acc < 0) acc == 0
        else if (charList.head == '(') balanceHelper(charList.tail, acc+1)
        else if (charList.head == ')') balanceHelper(charList.tail, acc-1)
        else if (charList.tail.nonEmpty) balanceHelper(charList.tail, acc)
        else acc == 0
      }

      balanceHelper(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      if (money == 0 ) 1
      else if (money < 0 || coins.isEmpty) 0
      else countChange(money-coins.head, coins) + countChange(money, coins.tail)
    }
  }
