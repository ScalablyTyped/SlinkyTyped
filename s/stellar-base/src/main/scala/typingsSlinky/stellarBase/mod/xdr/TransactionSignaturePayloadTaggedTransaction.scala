package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionSignaturePayloadTaggedTransaction")
@js.native
class TransactionSignaturePayloadTaggedTransaction ()
  extends typingsSlinky.stellarBase.xdrMod.default.TransactionSignaturePayloadTaggedTransaction
/* static members */
@JSImport("stellar-base", "xdr.TransactionSignaturePayloadTaggedTransaction")
@js.native
object TransactionSignaturePayloadTaggedTransaction extends js.Object {
  
  def envelopeTypeTx(value: typingsSlinky.stellarBase.xdrMod.xdr.Transaction): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  def envelopeTypeTxFeeBump(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransaction): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction): Buffer = js.native
  
  def write(
    value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction,
    io: Buffer
  ): Unit = js.native
}
