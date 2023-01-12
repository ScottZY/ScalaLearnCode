package org.learn.Variables

/**
 * 1) Scala has the same data types as Java, in Scala the data types are all objects, which means that scala
 *    does not have the native types of java native types in scala
 * 2) Scala data types are divided into two categories AnyVal (value type) and AnyRef (reference type),
 *    note: either AnyVal or AnyRef is an object. [Example: Int , Char]
 * 3) Compared to java's type system, scala is more complex! It is this complex and variable type
 *    system that makes object-oriented programming and function This complex and variable type
 *    system is what makes object-oriented programming and numerical programming blend together perfectly
 * @author Cheung Francis Yung
 */
object DataType {
  def main(args: Array[String]): Unit = {
    // Because Int is a class, it has an instance that can use many methods
    // and in scala, if a method has no formal parameters, you can omit the ()
    val number: Int = 10
    println(number.toDouble + "\t"+number.toString)

    val isPass: Boolean = true
    println(isPass.toString)


    sayHello()

    def sayHello(): Unit = {
      println("say Hello")
    }

    /*
    1) In scala there is a root type Any , which is the parent of all classes.
    2) In scala everything is an object, there are two main types AnyVal (value type) and AnyRef (reference type), they are both subclasses of Any.
    3) Null type is a special type in scala, it has only one value null, it is bottom calss , it is a subclass of all AnyRef types.
    4) Nothing type is also a bottom class, it is a subclass of all classes, in development you can usually return the value of
       Nothing type to any variable or function, where throwing exceptions is used a lot.
     */

    def sayHelloError: Nothing = {
      throw new Exception("This is an exception message")
    }

    // In scala, the implicit conversion of low-precision values to high-precision values is automatically observed.
    var num = 1.2 //default double
    var num2 = 1.7f //this is float
    //num2 = num output error, modify: num2 = num.toFloat

  }
}
