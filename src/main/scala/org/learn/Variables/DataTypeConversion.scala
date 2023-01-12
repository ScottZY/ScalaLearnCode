package org.learn.Variables

/**
 * When a Scala program performs an assignment or operation, the type with less precision is automatically
 * converted to the data type with more precision, this is automatic type conversion (implicit conversion)
 *
 * The data types are sorted by precision (capacity) size as:
 * Byte -> Short -> Int -> Long -> Float -> Double
 * Byte -> Boolean -> StringOps -> Unit
 *
 * Automatic type conversion details description:
 * 1) When there is a mixture of multiple types of data, the system automatically converts all
 *    the data to the data type with the largest capacity first, and then performs the calculation.
 * 2) When we assign a data type with large precision (capacity) to a data type with small precision (capacity),
 *    an error will be reported, and automatic type conversion will be performed instead.
 * 3) (byte, short) and char are not automatically converted to each other
 * 4) Byte, short, and char can be computed by first converting them to Int
 * 5) Auto-lifting principle: The type of the result of the expression is automatically lifted to
 *    the largest type in the operand
 *
 * Forced type conversion:
 * The inverse process of automatic type conversion, converting a large capacity data type to a small capacity
 * data type. It is used with a forced conversion function, but it may cause precision degradation or overflow,
 * so be extra careful.
 *
 * @author Cheung Theodore Yung
 */
object DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val num: Double = 1.9.toInt
    val b: Byte = 10
    println(b.toInt)
    val d: Double = 1.123
    println(d.toByte.toInt)

    /*
    1) When performing data conversion from large-->small, you need to use the forced conversion,
       note that there is a loss of precision
    2) The forced conversion symbol is only valid for the nearest operand,
       often using parentheses to raise the priority
    3) Char type can hold the constant value of Int, but cannot hold the variable value of Int,
       and needs to be strongly converted.
    4) Byte and Short types are treated as Int types when performing operations.
     */
  }
}
