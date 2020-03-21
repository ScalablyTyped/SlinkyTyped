package typingsSlinky.tweetnacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait nacl extends js.Object {
  @JSName("box")
  var box_Original: box = js.native
  @JSName("hash")
  var hash_Original: hash = js.native
  @JSName("scalarMult")
  var scalarMult_Original: scalarMult = js.native
  @JSName("secretbox")
  var secretbox_Original: secretbox = js.native
  @JSName("sign")
  var sign_Original: sign = js.native
  def box(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def hash(msg: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def randomBytes(n: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def scalarMult(n: scala.scalajs.js.typedarray.Uint8Array, p: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def secretbox(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def setPRNG(fn: js.Function2[/* x */ scala.scalajs.js.typedarray.Uint8Array, /* n */ Double, Unit]): Unit = js.native
  def sign(msg: scala.scalajs.js.typedarray.Uint8Array, secretKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def verify(x: scala.scalajs.js.typedarray.Uint8Array, y: scala.scalajs.js.typedarray.Uint8Array): Boolean = js.native
}

