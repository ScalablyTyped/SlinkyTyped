package typingsSlinky.typeorm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Timestamp")
@js.native
class Timestamp protected ()
  extends typingsSlinky.typeorm.typingsMod.Timestamp {
  /**
    * @param low The low (signed) 32 bits of the Timestamp.
    * @param high The high (signed) 32 bits of the Timestamp.
    */
  def this(low: scala.Double, high: scala.Double) = this()
}
/* static members */
object Timestamp {
  
  @JSImport("typeorm/browser", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typeorm/browser", "Timestamp.MAX_VALUE")
  @js.native
  def MAX_VALUE: typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  @scala.inline
  def MAX_VALUE_=(x: typingsSlinky.typeorm.typingsMod.Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Timestamp.MIN_VALUE")
  @js.native
  def MIN_VALUE: typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  @scala.inline
  def MIN_VALUE_=(x: typingsSlinky.typeorm.typingsMod.Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Timestamp.NEG_ONE")
  @js.native
  def NEG_ONE: typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  @scala.inline
  def NEG_ONE_=(x: typingsSlinky.typeorm.typingsMod.Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Timestamp.ONE")
  @js.native
  def ONE: typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  @scala.inline
  def ONE_=(x: typingsSlinky.typeorm.typingsMod.Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Timestamp.ZERO")
  @js.native
  def ZERO: typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  @scala.inline
  def ZERO_=(x: typingsSlinky.typeorm.typingsMod.Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Timestamp representing the 64-bit integer that comes by concatenating the
    * given high and low bits. Each is assumed to use 32 bits..
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @JSImport("typeorm/browser", "Timestamp.fromBits")
  @js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  @JSImport("typeorm/browser", "Timestamp.fromInt")
  @js.native
  def fromInt(value: scala.Double): typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  @JSImport("typeorm/browser", "Timestamp.fromNumber")
  @js.native
  def fromNumber(value: scala.Double): typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Timestamp.
    * @param radix The radix in which the text is written.
    */
  @JSImport("typeorm/browser", "Timestamp.fromString")
  @js.native
  def fromString(str: String): typingsSlinky.typeorm.typingsMod.Timestamp = js.native
  @JSImport("typeorm/browser", "Timestamp.fromString")
  @js.native
  def fromString(str: String, radix: scala.Double): typingsSlinky.typeorm.typingsMod.Timestamp = js.native
}
