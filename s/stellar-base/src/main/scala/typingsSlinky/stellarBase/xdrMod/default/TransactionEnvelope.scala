package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.TransactionEnvelope")
@js.native
class TransactionEnvelope ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope
object TransactionEnvelope {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.envelopeTypeTx")
  @js.native
  def envelopeTypeTx(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV1Envelope): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.envelopeTypeTxFeeBump")
  @js.native
  def envelopeTypeTxFeeBump(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.envelopeTypeTxV0")
  @js.native
  def envelopeTypeTxV0(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionEnvelope.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope, io: Buffer): Unit = js.native
}
