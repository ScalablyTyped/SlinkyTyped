package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyExport")
@js.native
object privateKeyExport extends js.Object {
  def apply(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
}

