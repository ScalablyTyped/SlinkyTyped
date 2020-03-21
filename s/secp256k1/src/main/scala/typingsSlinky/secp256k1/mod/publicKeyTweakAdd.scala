package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyTweakAdd")
@js.native
object publicKeyTweakAdd extends js.Object {
  def apply(publicKey: scala.scalajs.js.typedarray.Uint8Array, tweak: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    tweak: scala.scalajs.js.typedarray.Uint8Array,
    compressed: Boolean
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

