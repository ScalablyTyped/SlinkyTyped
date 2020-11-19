package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.MacBuffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.HmacSha256Mac")
@js.native
class HmacSha256Mac protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.HmacSha256Mac {
  def this(attributes: MacBuffer) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.HmacSha256Mac")
@js.native
object HmacSha256Mac extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Mac, io: Buffer): Unit = js.native
}
