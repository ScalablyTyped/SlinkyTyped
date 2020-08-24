package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AssetCode
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.AssetAlphaNum4")
@js.native
class AssetAlphaNum4 protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.AssetAlphaNum4 {
  def this(attributes: AssetCode) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.AssetAlphaNum4")
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
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AssetAlphaNum4, io: Buffer): Unit = js.native
}

