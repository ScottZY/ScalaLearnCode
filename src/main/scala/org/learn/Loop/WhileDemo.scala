package org.learn.Loop

/**
 * 1) A loop condition is an expression that returns a boolean value
 * 2) The while loop is a judgement followed by an execution statement
 * 3) Unlike the If statement, the While statement itself has no value, i.e. the result of the entire
 *    While statement is of type Unit()
 * 4) Because there is no return value in the while statement, when the statement is
 *    used to calculateand return the result, it is inevitable that variables are used,
 *    and variables need to be declared outside the while loop, which is equivalent to the inside of
 *    the loop affecting the outside variables. (The scala designer's philosophy: if you can use a for loop,
 *    consider using it first.)
 *
 * @author Cheung Theodore Yung
 */
object WhileDemo {
  def main(args: Array[String]): Unit = {
    var n = 1
    while (n <= 10){
      println("this is :"+n.toString)
      n += 1
    }
  }
}
