package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.TransactionEnvelope")
@js.native
class TransactionEnvelope ()
  extends typingsSlinky.stellarBase.xdrMod.default.TransactionEnvelope

/* static members */
@JSImport("stellar-base", "xdr.TransactionEnvelope")
@js.native
object TransactionEnvelope extends js.Object {
  def envelopeTypeTx(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV1Envelope): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def envelopeTypeTxFeeBump(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def envelopeTypeTxV0(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope, io: Buffer): Unit = js.native
}

