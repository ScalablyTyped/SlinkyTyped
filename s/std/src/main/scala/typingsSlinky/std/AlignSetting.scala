package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.start
  - typings.std.stdStrings.center
  - typings.std.stdStrings.end
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
*/
trait AlignSetting extends js.Object

object AlignSetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsSlinky.std.stdStrings.center = this.cast("center")
  @scala.inline
  def end: typingsSlinky.std.stdStrings.end = this.cast("end")
  @scala.inline
  def left: typingsSlinky.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.std.stdStrings.right = this.cast("right")
  @scala.inline
  def start: typingsSlinky.std.stdStrings.start = this.cast("start")
}

