package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.discrete
  - typingsSlinky.std.stdStrings.speakers
*/
trait ChannelInterpretation extends js.Object

object ChannelInterpretation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def discrete: typingsSlinky.std.stdStrings.discrete = this.cast("discrete")
  @scala.inline
  def speakers: typingsSlinky.std.stdStrings.speakers = this.cast("speakers")
}

