package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.aborted
import typingsSlinky.xrm.xrmStrings.active
import typingsSlinky.xrm.xrmStrings.finished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.active
  - typingsSlinky.xrm.xrmStrings.aborted
  - typingsSlinky.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def Aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def Active: active = "active".asInstanceOf[active]
  @scala.inline
  def Finished: finished = "finished".asInstanceOf[finished]
}

