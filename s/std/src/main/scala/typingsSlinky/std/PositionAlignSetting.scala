package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`line-left`
  - typings.std.stdStrings.center
  - typings.std.stdStrings.`line-right`
  - typings.std.stdStrings.auto
*/
trait PositionAlignSetting extends js.Object

object PositionAlignSetting {
  @scala.inline
  def auto: typingsSlinky.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsSlinky.std.stdStrings.center = this.cast("center")
  @scala.inline
  def `line-left`: typingsSlinky.std.stdStrings.`line-left` = this.cast("line-left")
  @scala.inline
  def `line-right`: typingsSlinky.std.stdStrings.`line-right` = this.cast("line-right")
}

