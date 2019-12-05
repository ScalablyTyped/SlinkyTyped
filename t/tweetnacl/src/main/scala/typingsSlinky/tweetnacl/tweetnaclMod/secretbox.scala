package typingsSlinky.tweetnacl.tweetnaclMod

import typingsSlinky.tweetnacl.tweetnaclNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait secretbox extends js.Object {
  val keyLength: Double = js.native
  val nonceLength: Double = js.native
  val overheadLength: Double = js.native
  def apply(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def open(
    box: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array | `false` = js.native
}

