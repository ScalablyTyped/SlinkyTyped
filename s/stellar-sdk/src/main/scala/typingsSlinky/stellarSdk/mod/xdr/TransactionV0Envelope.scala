package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Signatures
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionV0Envelope")
@js.native
class TransactionV0Envelope protected ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionV0Envelope {
  def this(attributes: Signatures) = this()
}
object TransactionV0Envelope {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionV0Envelope, io: Buffer): Unit = js.native
}
