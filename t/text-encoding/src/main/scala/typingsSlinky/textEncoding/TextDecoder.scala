package typingsSlinky.textEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  val encoding: String = js.native
  def decode(): String = js.native
  def decode(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def decode(input: scala.scalajs.js.typedarray.Uint8Array, options: TextDecoderOptions): String = js.native
}

