package typingsSlinky.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "Long")
@js.native
class Long protected () extends js.Object {
  /**
    * @param low The low (signed) 32 bits of the Long.
    * @param high The high (signed) 32 bits of the Long.
    */
  def this(low: scala.Double, high: scala.Double) = this()
  
  /**
    * Returns the sum of this and the given Long.
    *
    * @param other Long to add to this one.
    */
  def add(other: Long): Long = js.native
  
  /**
    * Returns the bitwise-AND of this Long and the given one.
    *
    * @param other The Long with which to AND.
    */
  def and(other: Long): Long = js.native
  
  /**
    * Compares this Long with the given one.
    *
    * @param other Long to compare against.
    */
  def compare(other: Long): scala.Double = js.native
  
  /**
    * Returns this Long divided by the given one.
    *
    * @param other Long by which to divide.
    */
  def div(other: Long): Long = js.native
  
  /**
    * Return whether this Long equals the other.
    *
    * @param other Long to compare against.
    */
  def equals(other: Long): Boolean = js.native
  
  /**
    * Return the high 32-bits value.
    */
  def getHighBits(): scala.Double = js.native
  
  /**
    * Return the low 32-bits value.
    */
  def getLowBits(): scala.Double = js.native
  
  /**
    * Return the low unsigned 32-bits value.
    */
  def getLowBitsUnsigned(): scala.Double = js.native
  
  /**
    * Returns the number of bits needed to represent the absolute value of this Long.
    */
  def getNumBitsAbs(): scala.Double = js.native
  
  /**
    * Return whether this Long is greater than the other.
    *
    * @param other Long to compare against.
    */
  def greaterThan(other: Long): scala.Double = js.native
  
  /**
    * Return whether this Long is greater than or equal to the other.
    *
    * @param other Long to compare against.
    */
  def greaterThanOrEqual(other: Long): scala.Double = js.native
  
  /**
    * Return whether this value is negative.
    */
  def isNegative(): Boolean = js.native
  
  /**
    * Return whether this value is odd.
    */
  def isOdd(): Boolean = js.native
  
  /**
    * Return whether this value is zero.
    */
  def isZero(): Boolean = js.native
  
  /**
    * Return whether this Long is less than the other.
    *
    * @param other Long to compare against.
    */
  def lessThan(other: Long): Boolean = js.native
  
  /**
    * Return whether this Long is less than or equal to the other.
    *
    * @param other Long to compare against.
    */
  def lessThanOrEqual(other: Long): Boolean = js.native
  
  /**
    * Returns this Long modulo the given one.
    *
    * @param other Long by which to mod.
    */
  def modulo(other: Long): Long = js.native
  
  /**
    * Returns the product of this and the given Long.
    *
    * @param other Long to multiply with this.
    */
  def multiply(other: Long): Long = js.native
  
  /**
    * The negation of this value.
    */
  def negate(): Long = js.native
  
  /**
    * The bitwise-NOT of this value.
    */
  def not(): Long = js.native
  
  /**
    * Return whether this Long does not equal the other.
    *
    * @param other Long to compare against.
    */
  def notEquals(other: Long): Boolean = js.native
  
  /**
    * Returns the bitwise-OR of this Long and the given one.
    *
    * @param other The Long with which to OR.
    */
  def or(other: Long): Long = js.native
  
  /**
    * Returns this Long with bits shifted to the left by the given amount.
    *
    * @param other The number of bits by which to shift.
    */
  def shiftLeft(other: scala.Double): Long = js.native
  
  /**
    * Returns this Long with bits shifted to the right by the given amount.
    *
    * @param other The number of bits by which to shift.
    */
  def shiftRight(other: scala.Double): Long = js.native
  
  /**
    * Returns this Long with bits shifted to the right by the given amount, with the new top bits matching the current sign bit.
    *
    * @param other The number of bits by which to shift.
    */
  def shiftRightUnsigned(other: scala.Double): Long = js.native
  
  /**
    * Returns the difference of this and the given Long.
    *
    * @param other Long to subtract from this.
    */
  def subtract(other: Long): Long = js.native
  
  /**
    * Return the int value.
    */
  def toInt(): scala.Double = js.native
  
  /**
    * Return the JSON value.
    */
  def toJSON(): String = js.native
  
  /**
    * Return the Number value.
    */
  def toNumber(): scala.Double = js.native
  
  def toString(opt_radix: scala.Double): String = js.native
  
  /**
    * Returns the bitwise-XOR of this Long and the given one.
    *
    * @param other The Long with which to XOR.
    */
  def xor(other: Long): Long = js.native
}
/* static members */
@JSImport("typeorm/driver/mongodb/typings", "Long")
@js.native
object Long extends js.Object {
  
  var MAX_VALUE: Long = js.native
  
  var MIN_VALUE: Long = js.native
  
  var NEG_ONE: Long = js.native
  
  var ONE: Long = js.native
  
  var ZERO: Long = js.native
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits.
    * Each is assumed to use 32 bits.
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): Long = js.native
  
  /**
    * Returns a Long representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  def fromInt(value: scala.Double): Long = js.native
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  def fromNumber(value: scala.Double): Long = js.native
  
  /**
    * Returns a Long representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Long.
    * @param radix The radix in which the text is written.
    */
  def fromString(str: String): Long = js.native
  def fromString(str: String, radix: scala.Double): Long = js.native
}
