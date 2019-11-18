package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.suspended
  - typings.std.stdStrings.running
  - typings.std.stdStrings.closed
*/
trait AudioContextState extends js.Object

object AudioContextState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def running: typingsSlinky.std.stdStrings.running = this.cast("running")
  @scala.inline
  def suspended: typingsSlinky.std.stdStrings.suspended = this.cast("suspended")
}

