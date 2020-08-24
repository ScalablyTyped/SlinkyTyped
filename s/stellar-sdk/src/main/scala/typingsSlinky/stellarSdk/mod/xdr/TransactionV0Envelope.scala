package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Signatures
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TransactionV0Envelope")
@js.native
class TransactionV0Envelope protected ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionV0Envelope {
  def this(attributes: Signatures) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.TransactionV0Envelope")
@js.native
object TransactionV0Envelope extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope, io: Buffer): Unit = js.native
}

