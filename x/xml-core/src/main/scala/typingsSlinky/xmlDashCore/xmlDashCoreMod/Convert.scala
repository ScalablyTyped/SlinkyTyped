package typingsSlinky.xmlDashCore.xmlDashCoreMod

import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "Convert")
@js.native
class Convert () extends js.Object

/* static members */
@JSImport("xml-core", "Convert")
@js.native
object Convert extends js.Object {
  /* protected */ def Base64Padding(base64: String): String = js.native
  def FromBase64(base64Text: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromBase64Url(base64url: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromBinary(text: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromDateTime(dateTime: js.Date): String = js.native
  def FromHex(hexString: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromString(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromString(str: String, enc: XmlBufferEncoding): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromUtf8String(text: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def ToBase64(buf: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToBase64Url(data: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToBinary(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToDateTime(dateTime: String): js.Date = js.native
  def ToHex(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToString(buffer: BufferSource): String = js.native
  def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
  def ToUtf8String(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

