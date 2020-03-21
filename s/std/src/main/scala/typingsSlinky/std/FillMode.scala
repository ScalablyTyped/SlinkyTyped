package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.auto
  - typingsSlinky.std.stdStrings.backwards
  - typingsSlinky.std.stdStrings.both
  - typingsSlinky.std.stdStrings.forwards
  - typingsSlinky.std.stdStrings.none
*/
trait FillMode extends js.Object

object FillMode {
  @scala.inline
  def auto: typingsSlinky.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  def backwards: typingsSlinky.std.stdStrings.backwards = this.cast("backwards")
  @scala.inline
  def both: typingsSlinky.std.stdStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forwards: typingsSlinky.std.stdStrings.forwards = this.cast("forwards")
  @scala.inline
  def none: typingsSlinky.std.stdStrings.none = this.cast("none")
}

