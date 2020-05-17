package typingsSlinky.scroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Error
  - scala.Null
*/
trait ScrollError extends js.Object

object ScrollError {
  @scala.inline
  implicit def apply(value: js.Error): ScrollError = value.asInstanceOf[ScrollError]
  @scala.inline
  implicit def apply(value: Null): ScrollError = value.asInstanceOf[ScrollError]
}

