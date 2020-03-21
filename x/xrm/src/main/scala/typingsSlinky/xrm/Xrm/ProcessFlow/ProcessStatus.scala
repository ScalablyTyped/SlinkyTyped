package typingsSlinky.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link XrmEnum.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.active
  - typingsSlinky.xrm.xrmStrings.aborted
  - typingsSlinky.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def aborted: typingsSlinky.xrm.xrmStrings.aborted = this.cast("aborted")
  @scala.inline
  def active: typingsSlinky.xrm.xrmStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def finished: typingsSlinky.xrm.xrmStrings.finished = this.cast("finished")
}

