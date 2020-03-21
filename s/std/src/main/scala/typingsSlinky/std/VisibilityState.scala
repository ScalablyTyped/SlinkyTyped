package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.hidden
  - typingsSlinky.std.stdStrings.visible
*/
trait VisibilityState extends js.Object

object VisibilityState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typingsSlinky.std.stdStrings.hidden = this.cast("hidden")
  @scala.inline
  def visible: typingsSlinky.std.stdStrings.visible = this.cast("visible")
}

