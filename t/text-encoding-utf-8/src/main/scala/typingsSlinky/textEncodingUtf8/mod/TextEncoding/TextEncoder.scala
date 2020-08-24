package typingsSlinky.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  var encoding: String = js.native
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(input: js.UndefOr[scala.Nothing], options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
  def encode(input: String): js.typedarray.Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
}

