package typingsSlinky.textEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  val encoding: String = js.native
  def encode(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def encode(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
}

