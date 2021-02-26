package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Amount
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PaymentOp")
@js.native
class PaymentOp protected ()
  extends typingsSlinky.stellarBase.mod.xdr.PaymentOp {
  def this(attributes: Amount) = this()
}
object PaymentOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp = js.native
  @JSImport("stellar-sdk", "xdr.PaymentOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp = js.native
  @JSImport("stellar-sdk", "xdr.PaymentOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PaymentOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PaymentOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PaymentOp.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp, io: Buffer): Unit = js.native
}
