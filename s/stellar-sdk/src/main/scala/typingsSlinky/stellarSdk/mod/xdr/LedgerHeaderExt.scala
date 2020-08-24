package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.LedgerHeaderExt")
@js.native
class LedgerHeaderExt ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerHeaderExt

/* static members */
@JSImport("stellar-sdk", "xdr.LedgerHeaderExt")
@js.native
object LedgerHeaderExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderExt, io: Buffer): Unit = js.native
}

