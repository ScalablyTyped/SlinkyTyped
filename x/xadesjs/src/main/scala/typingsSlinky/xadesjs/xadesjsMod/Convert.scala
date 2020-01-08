package typingsSlinky.xadesjs.xadesjsMod

import typingsSlinky.std.BufferSource
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlBufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "Convert")
@js.native
class Convert ()
  extends typingsSlinky.xmlDashCore.xmlDashCoreMod.Convert

/* static members */
@JSImport("xadesjs", "Convert")
@js.native
object Convert extends js.Object {
  /* protected */ def Base64Padding(base64: String): String = js.native
  def FromBase64(base64Text: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromBase64Url(base64url: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromBinary(text: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Converts Date to string
    *
    * @static
    * @param {Date} dateTime
    * @returns {string}
    *
    * @memberOf Convert
    */
  def FromDateTime(dateTime: js.Date): String = js.native
  /**
    * Converts HEX string to buffer
    *
    * @static
    * @param {string} hexString
    * @returns {Uint8Array}
    *
    * @memberOf Convert
    */
  def FromHex(hexString: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromString(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromString(str: String, enc: XmlBufferEncoding): scala.scalajs.js.typedarray.Uint8Array = js.native
  def FromUtf8String(text: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def ToBase64(buf: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToBase64Url(data: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToBinary(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  /**
    * Converts string to Date
    *
    * @static
    * @param {string} dateTime
    * @returns {Date}
    *
    * @memberOf Convert
    */
  def ToDateTime(dateTime: String): js.Date = js.native
  /**
    * Converts buffer to HEX string
    * @param  {BufferSource} buffer Incoming buffer
    * @returns string
    */
  def ToHex(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def ToString(buffer: BufferSource): String = js.native
  def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
  def ToUtf8String(buffer: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

