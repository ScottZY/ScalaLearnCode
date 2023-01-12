package org.learn.Loop

/**
 * For loop usage mainly including :
 * double for loop, nested loop, basic for loop, generator for loop (yield)
 *
 * @author Cheung Theodore Yung
 */
object ForLoop {
  def main(args: Array[String]): Unit = {
    // A simple example of a for loop
    for (i <- 1 to 3){
      println(i)
    }

    // 1 to n can also be a collection object directly
    val list: List[String] = List("HSBC", "Swire", "Jardine")
    for (elem <- list) {
      println(elem)
    }

    // Operation of adding variables (the following variables j)
    for (i <- 1 to 4; j = 4 - i){
      println("j = "+j)
    }

    // The above code is equivalent to:
    for (i <- 1 to 4){
      var j =i-1
      println("j2 = "+j)
    }

    // Nested for loops(use the yield keyword)
    // output: List(HSBC, Swire, Jardine)
    for (i <- 1 to 5; j <- 1 to 4){
      println(s"i=$i j=$j")
    }
    // The above code is equivalent to:
    for ( i <- 1 to 5){
      for (j <- 1 to 4){
        println(s"i=$i j=$j")
      }
    }

    // The writing type of for loop return value
    val returnVal = for (elem <- list) yield elem
    println(returnVal)
  }
}
