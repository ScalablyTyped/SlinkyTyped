package typingsSlinky.xmlCore.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlError")
@js.native
class XmlError protected () extends Error {
  def this(code: XE, args: js.Any*) = this()
  var code: Double = js.native
  val prefix: /* "XMLJS" */ String = js.native
}

