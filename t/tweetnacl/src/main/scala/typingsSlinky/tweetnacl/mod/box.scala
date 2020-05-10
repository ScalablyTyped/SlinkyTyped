package typingsSlinky.tweetnacl.mod

import typingsSlinky.tweetnacl.mod.box.keyPair
import typingsSlinky.tweetnacl.mod.box.open
import typingsSlinky.tweetnacl.tweetnaclBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait box extends js.Object {
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  val nonceLength: Double = js.native
  @JSName("open")
  var open_Original: open = js.native
  val overheadLength: Double = js.native
  val publicKeyLength: Double = js.native
  val secretKeyLength: Double = js.native
  val sharedKeyLength: Double = js.native
  def apply(
    msg: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def after(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def before(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def keyPair(): BoxKeyPair = js.native
  def open(
    msg: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array | `false` = js.native
}

@JSImport("tweetnacl", "box")
@js.native
object box extends js.Object {
  @js.native
  trait keyPair extends js.Object {
    def apply(): BoxKeyPair = js.native
    def fromSecretKey(secretKey: js.typedarray.Uint8Array): BoxKeyPair = js.native
  }
  
  @js.native
  trait open extends js.Object {
    def apply(
      msg: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      publicKey: js.typedarray.Uint8Array,
      secretKey: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | `false` = js.native
    def after(box: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array | `false` = js.native
  }
  
}

