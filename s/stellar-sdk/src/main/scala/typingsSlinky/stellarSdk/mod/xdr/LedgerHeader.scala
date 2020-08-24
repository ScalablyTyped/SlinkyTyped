package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.BaseFee
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.LedgerHeader")
@js.native
class LedgerHeader protected ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerHeader {
  def this(attributes: BaseFee) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.LedgerHeader")
@js.native
object LedgerHeader extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeader, io: Buffer): Unit = js.native
}

