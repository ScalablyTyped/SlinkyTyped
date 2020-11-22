package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AssetCode
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "AssetAlphaNum4")
@js.native
class AssetAlphaNum4 protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4 {
  def this(attributes: AssetCode) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "AssetAlphaNum4")
@js.native
object AssetAlphaNum4 extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4 = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4 = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4, io: Buffer): Unit = js.native
}
