package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrustOp extends js.Object {
  def asset(): AllowTrustOpAsset = js.native
  def asset(value: AllowTrustOpAsset): AllowTrustOpAsset = js.native
  def authorize(): Double = js.native
  def authorize(value: Double): Double = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def trustor(): AccountId = js.native
  def trustor(value: AccountId): AccountId = js.native
}

