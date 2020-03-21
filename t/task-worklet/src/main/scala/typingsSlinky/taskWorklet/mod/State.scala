package typingsSlinky.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.taskWorklet.taskWorkletStrings.cancelled
  - typingsSlinky.taskWorklet.taskWorkletStrings.completed
  - typingsSlinky.taskWorklet.taskWorkletStrings.fulfilled
  - typingsSlinky.taskWorklet.taskWorkletStrings.pending
  - typingsSlinky.taskWorklet.taskWorkletStrings.scheduled
*/
trait State extends js.Object

object State {
  @scala.inline
  def cancelled: typingsSlinky.taskWorklet.taskWorkletStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.taskWorklet.taskWorkletStrings.completed = this.cast("completed")
  @scala.inline
  def fulfilled: typingsSlinky.taskWorklet.taskWorkletStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typingsSlinky.taskWorklet.taskWorkletStrings.pending = this.cast("pending")
  @scala.inline
  def scheduled: typingsSlinky.taskWorklet.taskWorkletStrings.scheduled = this.cast("scheduled")
}

