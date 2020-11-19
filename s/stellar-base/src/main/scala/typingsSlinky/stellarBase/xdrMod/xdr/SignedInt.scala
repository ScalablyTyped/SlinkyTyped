package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2147483648`
import typingsSlinky.stellarBase.stellarBaseNumbers.`2147483647`
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedInt extends js.Object {
  
  val MAX_VALUE: `2147483647` = js.native
  
  val MIN_VALUE: `-2147483648` = js.native
  
  def fromXDR(input: Buffer): Double = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): Double = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): Double = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): Double = js.native
  
  def isValid(value: Double): Boolean = js.native
  
  def read(io: Buffer): Double = js.native
  
  def toXDR(value: Double): Buffer = js.native
  
  def write(value: Double, io: Buffer): Unit = js.native
}
