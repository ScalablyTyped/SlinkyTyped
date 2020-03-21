package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.exponential
  - typingsSlinky.std.stdStrings.inverse
  - typingsSlinky.std.stdStrings.linear
*/
trait DistanceModelType extends js.Object

object DistanceModelType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exponential: typingsSlinky.std.stdStrings.exponential = this.cast("exponential")
  @scala.inline
  def inverse: typingsSlinky.std.stdStrings.inverse = this.cast("inverse")
  @scala.inline
  def linear: typingsSlinky.std.stdStrings.linear = this.cast("linear")
}

