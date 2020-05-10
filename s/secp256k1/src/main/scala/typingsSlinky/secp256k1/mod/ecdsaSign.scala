package typingsSlinky.secp256k1.mod

import typingsSlinky.secp256k1.AnonRecid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaSign")
@js.native
object ecdsaSign extends js.Object {
  def apply(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): AnonRecid = js.native
  def apply(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: SignOptions): AnonRecid = js.native
}

