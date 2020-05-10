package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaRecover")
@js.native
object ecdsaRecover extends js.Object {
  def apply(signature: js.typedarray.Uint8Array, recid: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean
  ): js.typedarray.Uint8Array = js.native
}

