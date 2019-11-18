package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.frozen
  - typings.std.stdStrings.waiting
  - typings.std.stdStrings.inprogress
  - typings.std.stdStrings.failed
  - typings.std.stdStrings.succeeded
  - typings.std.stdStrings.cancelled
*/
trait RTCStatsIceCandidatePairState extends js.Object

object RTCStatsIceCandidatePairState {
  @scala.inline
  def cancelled: typingsSlinky.std.stdStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def frozen: typingsSlinky.std.stdStrings.frozen = this.cast("frozen")
  @scala.inline
  def inprogress: typingsSlinky.std.stdStrings.inprogress = this.cast("inprogress")
  @scala.inline
  def succeeded: typingsSlinky.std.stdStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def waiting: typingsSlinky.std.stdStrings.waiting = this.cast("waiting")
}

