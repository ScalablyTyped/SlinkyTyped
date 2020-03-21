package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.accumulate
  - typingsSlinky.std.stdStrings.add
  - typingsSlinky.std.stdStrings.auto
  - typingsSlinky.std.stdStrings.replace
*/
trait CompositeOperationOrAuto extends js.Object

object CompositeOperationOrAuto {
  @scala.inline
  def accumulate: typingsSlinky.std.stdStrings.accumulate = this.cast("accumulate")
  @scala.inline
  def add: typingsSlinky.std.stdStrings.add = this.cast("add")
  @scala.inline
  def auto: typingsSlinky.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def replace: typingsSlinky.std.stdStrings.replace = this.cast("replace")
}

