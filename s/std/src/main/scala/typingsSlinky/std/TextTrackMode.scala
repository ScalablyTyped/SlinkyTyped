package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.disabled
  - typingsSlinky.std.stdStrings.hidden
  - typingsSlinky.std.stdStrings.showing
*/
trait TextTrackMode extends js.Object

object TextTrackMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.std.stdStrings.disabled = this.cast("disabled")
  @scala.inline
  def hidden: typingsSlinky.std.stdStrings.hidden = this.cast("hidden")
  @scala.inline
  def showing: typingsSlinky.std.stdStrings.showing = this.cast("showing")
}

