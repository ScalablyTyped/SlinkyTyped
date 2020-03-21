package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaVerify")
@js.native
object ecdsaVerify extends js.Object {
  def apply(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    message: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
}

