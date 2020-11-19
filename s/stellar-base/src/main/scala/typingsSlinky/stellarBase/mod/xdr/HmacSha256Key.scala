package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Key
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.HmacSha256Key")
@js.native
class HmacSha256Key protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.HmacSha256Key {
  def this(attributes: Key) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.HmacSha256Key")
@js.native
object HmacSha256Key extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.HmacSha256Key, io: Buffer): Unit = js.native
}
