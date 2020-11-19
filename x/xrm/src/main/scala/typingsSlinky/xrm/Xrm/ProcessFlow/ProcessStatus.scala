package typingsSlinky.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def aborted: typingsSlinky.xrm.xrmStrings.aborted = "aborted".asInstanceOf[typingsSlinky.xrm.xrmStrings.aborted]
  
  @scala.inline
  def active: typingsSlinky.xrm.xrmStrings.active = "active".asInstanceOf[typingsSlinky.xrm.xrmStrings.active]
  
  @scala.inline
  def finished: typingsSlinky.xrm.xrmStrings.finished = "finished".asInstanceOf[typingsSlinky.xrm.xrmStrings.finished]
}
