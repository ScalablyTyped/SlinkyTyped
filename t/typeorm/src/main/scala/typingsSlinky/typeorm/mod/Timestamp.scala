package typingsSlinky.typeorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Timestamp")
@js.native
class Timestamp protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.Timestamp {
  /**
    * @param low The low (signed) 32 bits of the Timestamp.
    * @param high The high (signed) 32 bits of the Timestamp.
    */
  def this(low: scala.Double, high: scala.Double) = this()
}
/* static members */
@JSImport("typeorm", "Timestamp")
@js.native
object Timestamp extends js.Object {
  
  var MAX_VALUE: typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  var MIN_VALUE: typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  var NEG_ONE: typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  var ONE: typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  var ZERO: typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the 64-bit integer that comes by concatenating the
    * given high and low bits. Each is assumed to use 32 bits..
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  def fromInt(value: scala.Double): typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  def fromNumber(value: scala.Double): typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Timestamp.
    * @param radix The radix in which the text is written.
    */
  def fromString(str: String): typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
  def fromString(str: String, radix: scala.Double): typingsSlinky.typeorm.mongodbTypingsMod.Timestamp = js.native
}
