package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.ended
  - typingsSlinky.std.stdStrings.live
*/
trait MediaStreamTrackState extends js.Object

object MediaStreamTrackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ended: typingsSlinky.std.stdStrings.ended = this.cast("ended")
  @scala.inline
  def live: typingsSlinky.std.stdStrings.live = this.cast("live")
}

