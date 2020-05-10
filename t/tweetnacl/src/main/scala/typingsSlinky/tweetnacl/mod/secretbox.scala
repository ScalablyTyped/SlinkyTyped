package typingsSlinky.tweetnacl.mod

import typingsSlinky.tweetnacl.tweetnaclBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait secretbox extends js.Object {
  val keyLength: Double = js.native
  val nonceLength: Double = js.native
  val overheadLength: Double = js.native
  def apply(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def open(box: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array | `false` = js.native
}

