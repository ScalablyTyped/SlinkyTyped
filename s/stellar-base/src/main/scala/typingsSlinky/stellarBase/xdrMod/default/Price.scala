package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.D
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "Price")
@js.native
class Price protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.Price {
  def this(attributes: D) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "Price")
@js.native
object Price extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Price): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Price = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Price): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Price, io: Buffer): Unit = js.native
}
