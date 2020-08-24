package typingsSlinky.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncodingStatic extends js.Object {
  @JSName("TextDecoder")
  var TextDecoder_Original: TextDecoderStatic = js.native
  @JSName("TextEncoder")
  var TextEncoder_Original: TextEncoderStatic = js.native
  def TextDecoder(): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: String): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: String, options: TextDecoderOptions): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextEncoder(): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: String): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: String, options: TextEncoderOptions): typingsSlinky.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
}

