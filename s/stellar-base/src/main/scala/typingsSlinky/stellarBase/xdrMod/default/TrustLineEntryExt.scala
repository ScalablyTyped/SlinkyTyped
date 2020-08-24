package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TrustLineEntryExt")
@js.native
class TrustLineEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt

/* static members */
@JSImport("stellar-base/types/xdr", "TrustLineEntryExt")
@js.native
object TrustLineEntryExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def `1`(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryV1): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt, io: Buffer): Unit = js.native
}

