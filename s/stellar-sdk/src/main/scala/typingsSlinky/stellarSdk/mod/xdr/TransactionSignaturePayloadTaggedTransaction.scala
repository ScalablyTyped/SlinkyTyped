package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction")
@js.native
class TransactionSignaturePayloadTaggedTransaction ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionSignaturePayloadTaggedTransaction
object TransactionSignaturePayloadTaggedTransaction {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.envelopeTypeTx")
  @js.native
  def envelopeTypeTx(value: typingsSlinky.stellarBase.xdrMod.xdr.Transaction): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.envelopeTypeTxFeeBump")
  @js.native
  def envelopeTypeTxFeeBump(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransaction): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionSignaturePayloadTaggedTransaction.write")
  @js.native
  def write(
    value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction,
    io: Buffer
  ): Unit = js.native
}
