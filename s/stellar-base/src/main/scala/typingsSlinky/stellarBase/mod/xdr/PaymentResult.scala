package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.PaymentResult")
@js.native
class PaymentResult ()
  extends typingsSlinky.stellarBase.xdrMod.default.PaymentResult

/* static members */
@JSImport("stellar-base", "xdr.PaymentResult")
@js.native
object PaymentResult extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult): Boolean = js.native
  def paymentSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentResult, io: Buffer): Unit = js.native
}

