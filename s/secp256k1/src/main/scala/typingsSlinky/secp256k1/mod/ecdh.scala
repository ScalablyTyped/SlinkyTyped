package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdh")
@js.native
object ecdh extends js.Object {
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    opt: ecdhOptions
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

