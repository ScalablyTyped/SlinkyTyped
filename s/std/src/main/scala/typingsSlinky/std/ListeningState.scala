package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.inactive
  - typings.std.stdStrings.active
  - typings.std.stdStrings.disambiguation
*/
trait ListeningState extends js.Object

object ListeningState {
  @scala.inline
  def active: typingsSlinky.std.stdStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disambiguation: typingsSlinky.std.stdStrings.disambiguation = this.cast("disambiguation")
  @scala.inline
  def inactive: typingsSlinky.std.stdStrings.inactive = this.cast("inactive")
}

