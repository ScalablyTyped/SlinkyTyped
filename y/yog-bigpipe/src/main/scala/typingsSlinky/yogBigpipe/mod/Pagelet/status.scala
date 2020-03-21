package typingsSlinky.yogBigpipe.mod.Pagelet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yogBigpipe.yogBigpipeStrings.pending
  - typingsSlinky.yogBigpipe.yogBigpipeStrings.rendering
  - typingsSlinky.yogBigpipe.yogBigpipeStrings.fulfilled
  - typingsSlinky.yogBigpipe.yogBigpipeStrings.failed
*/
trait status extends js.Object

object status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.yogBigpipe.yogBigpipeStrings.failed = this.cast("failed")
  @scala.inline
  def fulfilled: typingsSlinky.yogBigpipe.yogBigpipeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typingsSlinky.yogBigpipe.yogBigpipeStrings.pending = this.cast("pending")
  @scala.inline
  def rendering: typingsSlinky.yogBigpipe.yogBigpipeStrings.rendering = this.cast("rendering")
}

