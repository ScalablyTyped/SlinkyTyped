package typingsSlinky.taskDashWorklet.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.taskDashWorklet.taskDashWorkletStrings.cancelled
  - typings.taskDashWorklet.taskDashWorkletStrings.completed
  - typings.taskDashWorklet.taskDashWorkletStrings.fulfilled
  - typings.taskDashWorklet.taskDashWorkletStrings.pending
  - typings.taskDashWorklet.taskDashWorkletStrings.scheduled
*/
trait State extends js.Object

object State {
  @scala.inline
  def cancelled: typingsSlinky.taskDashWorklet.taskDashWorkletStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.taskDashWorklet.taskDashWorkletStrings.completed = this.cast("completed")
  @scala.inline
  def fulfilled: typingsSlinky.taskDashWorklet.taskDashWorkletStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typingsSlinky.taskDashWorklet.taskDashWorkletStrings.pending = this.cast("pending")
  @scala.inline
  def scheduled: typingsSlinky.taskDashWorklet.taskDashWorkletStrings.scheduled = this.cast("scheduled")
}

