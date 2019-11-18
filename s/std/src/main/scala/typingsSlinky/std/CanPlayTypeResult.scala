package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Empty
  - typings.std.stdStrings.maybe
  - typings.std.stdStrings.probably
*/
trait CanPlayTypeResult extends js.Object

object CanPlayTypeResult {
  @scala.inline
  def Empty: typingsSlinky.std.stdStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def maybe: typingsSlinky.std.stdStrings.maybe = this.cast("maybe")
  @scala.inline
  def probably: typingsSlinky.std.stdStrings.probably = this.cast("probably")
}

