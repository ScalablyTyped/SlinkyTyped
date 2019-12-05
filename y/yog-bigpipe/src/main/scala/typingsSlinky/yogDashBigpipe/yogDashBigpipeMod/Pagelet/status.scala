package typingsSlinky.yogDashBigpipe.yogDashBigpipeMod.Pagelet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yogDashBigpipe.yogDashBigpipeStrings.pending
  - typings.yogDashBigpipe.yogDashBigpipeStrings.rendering
  - typings.yogDashBigpipe.yogDashBigpipeStrings.fulfilled
  - typings.yogDashBigpipe.yogDashBigpipeStrings.failed
*/
trait status extends js.Object

object status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.yogDashBigpipe.yogDashBigpipeStrings.failed = this.cast("failed")
  @scala.inline
  def fulfilled: typingsSlinky.yogDashBigpipe.yogDashBigpipeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typingsSlinky.yogDashBigpipe.yogDashBigpipeStrings.pending = this.cast("pending")
  @scala.inline
  def rendering: typingsSlinky.yogDashBigpipe.yogDashBigpipeStrings.rendering = this.cast("rendering")
}

