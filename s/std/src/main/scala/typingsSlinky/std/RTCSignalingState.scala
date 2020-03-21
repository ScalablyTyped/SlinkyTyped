package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.closed
  - typingsSlinky.std.stdStrings.`have-local-offer`
  - typingsSlinky.std.stdStrings.`have-local-pranswer`
  - typingsSlinky.std.stdStrings.`have-remote-offer`
  - typingsSlinky.std.stdStrings.`have-remote-pranswer`
  - typingsSlinky.std.stdStrings.stable
*/
trait RTCSignalingState extends js.Object

object RTCSignalingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def `have-local-offer`: typingsSlinky.std.stdStrings.`have-local-offer` = this.cast("have-local-offer")
  @scala.inline
  def `have-local-pranswer`: typingsSlinky.std.stdStrings.`have-local-pranswer` = this.cast("have-local-pranswer")
  @scala.inline
  def `have-remote-offer`: typingsSlinky.std.stdStrings.`have-remote-offer` = this.cast("have-remote-offer")
  @scala.inline
  def `have-remote-pranswer`: typingsSlinky.std.stdStrings.`have-remote-pranswer` = this.cast("have-remote-pranswer")
  @scala.inline
  def stable: typingsSlinky.std.stdStrings.stable = this.cast("stable")
}

