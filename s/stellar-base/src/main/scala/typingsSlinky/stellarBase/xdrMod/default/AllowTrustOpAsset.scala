package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "AllowTrustOpAsset")
@js.native
class AllowTrustOpAsset ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset

/* static members */
@JSImport("stellar-base/types/xdr", "AllowTrustOpAsset")
@js.native
object AllowTrustOpAsset extends js.Object {
  def assetTypeCreditAlphanum12(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  def assetTypeCreditAlphanum4(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOpAsset, io: Buffer): Unit = js.native
}

