package typingsSlinky.secp256k1.mod

import typingsSlinky.secp256k1.AnonRecovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaSign")
@js.native
object ecdsaSign extends js.Object {
  def apply(
    message: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array
  ): AnonRecovery = js.native
  def apply(
    message: scala.scalajs.js.typedarray.Uint8Array,
    privateKey: scala.scalajs.js.typedarray.Uint8Array,
    options: SignOptions
  ): AnonRecovery = js.native
}

