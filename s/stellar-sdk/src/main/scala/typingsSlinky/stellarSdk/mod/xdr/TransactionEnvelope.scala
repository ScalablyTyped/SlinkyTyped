package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionEnvelope")
@js.native
class TransactionEnvelope ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionEnvelope
/* static members */
@JSImport("stellar-sdk", "xdr.TransactionEnvelope")
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
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope, io: Buffer): Unit = js.native
}
