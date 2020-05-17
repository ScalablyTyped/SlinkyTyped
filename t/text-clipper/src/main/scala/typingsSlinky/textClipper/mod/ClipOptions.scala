package typingsSlinky.textClipper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.textClipper.mod.ClipPlainTextOptions
  - typingsSlinky.textClipper.mod.ClipHtmlOptions
*/
trait ClipOptions extends js.Object

object ClipOptions {
  @scala.inline
  implicit def apply(value: ClipHtmlOptions): ClipOptions = value.asInstanceOf[ClipOptions]
  @scala.inline
  implicit def apply(value: ClipPlainTextOptions): ClipOptions = value.asInstanceOf[ClipOptions]
}

