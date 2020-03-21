package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.cors
  - typingsSlinky.std.stdStrings.navigate
  - typingsSlinky.std.stdStrings.`no-cors`
  - typingsSlinky.std.stdStrings.`same-origin`
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsSlinky.std.stdStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typingsSlinky.std.stdStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typingsSlinky.std.stdStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsSlinky.std.stdStrings.`same-origin` = this.cast("same-origin")
}

