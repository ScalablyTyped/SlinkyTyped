package typingsSlinky.textEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  val encoding: String = js.native
  def decode(): String = js.native
  def decode(input: js.UndefOr[scala.Nothing], options: TextDecoderOptions): String = js.native
  def decode(input: js.typedarray.Uint8Array): String = js.native
  def decode(input: js.typedarray.Uint8Array, options: TextDecoderOptions): String = js.native
}

