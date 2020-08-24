package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AmountAsset
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "SimplePaymentResult")
@js.native
class SimplePaymentResult protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult {
  def this(attributes: AmountAsset) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "SimplePaymentResult")
@js.native
object SimplePaymentResult extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SimplePaymentResult, io: Buffer): Unit = js.native
}

