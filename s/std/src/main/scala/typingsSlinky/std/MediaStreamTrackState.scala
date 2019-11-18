package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.live
  - typings.std.stdStrings.ended
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

