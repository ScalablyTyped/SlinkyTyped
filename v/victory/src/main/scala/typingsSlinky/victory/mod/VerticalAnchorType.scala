package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vertical anchor type
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.victory.victoryStrings.start
  - typingsSlinky.victory.victoryStrings.middle
  - typingsSlinky.victory.victoryStrings.end
*/
trait VerticalAnchorType extends js.Object

object VerticalAnchorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsSlinky.victory.victoryStrings.end = this.cast("end")
  @scala.inline
  def middle: typingsSlinky.victory.victoryStrings.middle = this.cast("middle")
  @scala.inline
  def start: typingsSlinky.victory.victoryStrings.start = this.cast("start")
}

