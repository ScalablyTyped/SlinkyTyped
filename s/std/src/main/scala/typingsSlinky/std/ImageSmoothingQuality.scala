package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.low
  - typings.std.stdStrings.medium
  - typings.std.stdStrings.high
*/
trait ImageSmoothingQuality extends js.Object

object ImageSmoothingQuality {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.std.stdStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.std.stdStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsSlinky.std.stdStrings.medium = this.cast("medium")
}

