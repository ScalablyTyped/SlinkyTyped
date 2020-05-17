package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.webpack.mod.ExternalsObjectElement
  - typingsSlinky.webpack.mod.ExternalsFunctionElement
*/
trait ExternalsElement extends js.Object

object ExternalsElement {
  @scala.inline
  implicit def apply(value: ExternalsFunctionElement): ExternalsElement = value.asInstanceOf[ExternalsElement]
  @scala.inline
  implicit def apply(value: ExternalsObjectElement): ExternalsElement = value.asInstanceOf[ExternalsElement]
  @scala.inline
  implicit def apply(value: js.RegExp): ExternalsElement = value.asInstanceOf[ExternalsElement]
  @scala.inline
  implicit def apply(value: String): ExternalsElement = value.asInstanceOf[ExternalsElement]
}

