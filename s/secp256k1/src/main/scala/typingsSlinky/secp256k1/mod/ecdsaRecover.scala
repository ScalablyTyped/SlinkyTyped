package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaRecover")
@js.native
object ecdsaRecover extends js.Object {
  def apply(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    recovery: Double,
    message: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    recovery: Double,
    message: scala.scalajs.js.typedarray.Uint8Array,
    compressed: Boolean
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

