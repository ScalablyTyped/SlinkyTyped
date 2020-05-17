package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xmlCore.xmlCoreStrings.utf8
  - typingsSlinky.xmlCore.xmlCoreStrings.binary
  - typingsSlinky.xmlCore.xmlCoreStrings.hex
  - typingsSlinky.xmlCore.xmlCoreStrings.base64
  - typingsSlinky.xmlCore.xmlCoreStrings.base64url
*/
trait XmlBufferEncoding extends js.Object

object XmlBufferEncoding {
  @scala.inline
  def utf8: typingsSlinky.xmlCore.xmlCoreStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.xmlCore.xmlCoreStrings.utf8]
  @scala.inline
  def binary: typingsSlinky.xmlCore.xmlCoreStrings.binary = "binary".asInstanceOf[typingsSlinky.xmlCore.xmlCoreStrings.binary]
  @scala.inline
  def hex: typingsSlinky.xmlCore.xmlCoreStrings.hex = "hex".asInstanceOf[typingsSlinky.xmlCore.xmlCoreStrings.hex]
  @scala.inline
  def base64: typingsSlinky.xmlCore.xmlCoreStrings.base64 = "base64".asInstanceOf[typingsSlinky.xmlCore.xmlCoreStrings.base64]
  @scala.inline
  def base64url: typingsSlinky.xmlCore.xmlCoreStrings.base64url = "base64url".asInstanceOf[typingsSlinky.xmlCore.xmlCoreStrings.base64url]
  @scala.inline
  implicit def apply(value: String): XmlBufferEncoding = value.asInstanceOf[XmlBufferEncoding]
}

