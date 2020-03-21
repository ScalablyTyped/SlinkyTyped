package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text anchor type
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.victory.victoryStrings.start
  - typingsSlinky.victory.victoryStrings.middle
  - typingsSlinky.victory.victoryStrings.end
  - typingsSlinky.victory.victoryStrings.inherit
*/
trait TextAnchorType extends js.Object

object TextAnchorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsSlinky.victory.victoryStrings.end = this.cast("end")
  @scala.inline
  def inherit: typingsSlinky.victory.victoryStrings.inherit = this.cast("inherit")
  @scala.inline
  def middle: typingsSlinky.victory.victoryStrings.middle = this.cast("middle")
  @scala.inline
  def start: typingsSlinky.victory.victoryStrings.start = this.cast("start")
}

