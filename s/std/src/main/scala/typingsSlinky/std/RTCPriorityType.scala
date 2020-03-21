package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.high
  - typingsSlinky.std.stdStrings.low
  - typingsSlinky.std.stdStrings.medium
  - typingsSlinky.std.stdStrings.`very-low`
*/
trait RTCPriorityType extends js.Object

object RTCPriorityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.std.stdStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.std.stdStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsSlinky.std.stdStrings.medium = this.cast("medium")
  @scala.inline
  def `very-low`: typingsSlinky.std.stdStrings.`very-low` = this.cast("very-low")
}

