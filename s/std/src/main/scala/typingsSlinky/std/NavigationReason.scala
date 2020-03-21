package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.down
  - typingsSlinky.std.stdStrings.left
  - typingsSlinky.std.stdStrings.right
  - typingsSlinky.std.stdStrings.up
*/
trait NavigationReason extends js.Object

object NavigationReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typingsSlinky.std.stdStrings.down = this.cast("down")
  @scala.inline
  def left: typingsSlinky.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.std.stdStrings.right = this.cast("right")
  @scala.inline
  def up: typingsSlinky.std.stdStrings.up = this.cast("up")
}

