package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.OfferEntryExt")
@js.native
class OfferEntryExt ()
  extends typingsSlinky.stellarBase.mod.xdr.OfferEntryExt

/* static members */
@JSImport("stellar-sdk", "xdr.OfferEntryExt")
@js.native
object OfferEntryExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntryExt, io: Buffer): Unit = js.native
}

