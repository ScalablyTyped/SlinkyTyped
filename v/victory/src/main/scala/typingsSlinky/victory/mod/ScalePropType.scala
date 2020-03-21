package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Acceptable scale types
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.victory.victoryStrings.linear
  - typingsSlinky.victory.victoryStrings.time
  - typingsSlinky.victory.victoryStrings.log
  - typingsSlinky.victory.victoryStrings.sqrt
*/
trait ScalePropType extends js.Object

object ScalePropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linear: typingsSlinky.victory.victoryStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsSlinky.victory.victoryStrings.log = this.cast("log")
  @scala.inline
  def sqrt: typingsSlinky.victory.victoryStrings.sqrt = this.cast("sqrt")
  @scala.inline
  def time: typingsSlinky.victory.victoryStrings.time = this.cast("time")
}

