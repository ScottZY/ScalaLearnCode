package org.learn.Variables

/**
 * Definition and use of scala variables and precautions
 * @author Cheung Theodore Yung
 */
object ValOrVar {
  def main(args: Array[String]): Unit = {
    // Define a constant, such as String, Int and Float
    val str: String = "This is a String"
    val number: Int = 5
    val floatNumber: Float = 9f

    // Print the variables defined above
    // output: (This is a String,5,9.0)
    println(s"$str", number, floatNumber)

    // In scala, it is usually not necessary to specify a specific variable type when defining a variable,
    // and scala can determine the data type of the variable itself

    /*
     The difference between val and var:
     When defining a variable, if it is defined with var then the variable is mutable at a later time,
     for example: i can define <var i: Int = 0> then define <var i: Int = 9> again
     there is no error in this operation.
     But if it is defined with val then the variable is immutable similar to a constant

     In scala, once the type is determined, it cannot be modified, which means that Scala is a strongly typed language.
     */

    // Use isInstanceOf[Type] to determine the variable data type
    val isOrnotInt: Boolean = str.isInstanceOf[Int]
    if (isOrnotInt) println("is Int") else println("is not Int")

    // Define a Dog class and reassign values to the variables inside (use of var)
    val dog = new Dog
    dog.age = 10
    dog.name = "Jasper"
    println(dog.name, dog.age)
  }


  class Dog {
    var name: String = ""
    var age: Int = 0
  }

}
