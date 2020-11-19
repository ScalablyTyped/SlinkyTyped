package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDRArray[T] extends js.Object {
  
  def fromXDR(input: Buffer): js.Array[T] = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): js.Array[T] = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): js.Array[T] = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): js.Array[T] = js.native
  
  def isValid(value: js.Array[T]): Boolean = js.native
  
  def read(io: Buffer): Buffer = js.native
  
  def toXDR(value: js.Array[T]): Buffer = js.native
  
  def write(value: js.Array[T], io: Buffer): Unit = js.native
}
