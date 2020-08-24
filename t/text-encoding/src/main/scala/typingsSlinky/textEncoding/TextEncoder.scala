package typingsSlinky.textEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  val encoding: String = js.native
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(input: js.UndefOr[scala.Nothing], options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
  def encode(input: String): js.typedarray.Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
}

