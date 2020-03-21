package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.include
  - typingsSlinky.std.stdStrings.omit
  - typingsSlinky.std.stdStrings.`same-origin`
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsSlinky.std.stdStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsSlinky.std.stdStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsSlinky.std.stdStrings.`same-origin` = this.cast("same-origin")
}

