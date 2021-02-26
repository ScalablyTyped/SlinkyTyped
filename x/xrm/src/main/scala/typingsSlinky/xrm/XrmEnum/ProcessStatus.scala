package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.aborted
import typingsSlinky.xrm.xrmStrings.active
import typingsSlinky.xrm.xrmStrings.finished
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.active
  - typingsSlinky.xrm.xrmStrings.aborted
  - typingsSlinky.xrm.xrmStrings.finished
*/
trait ProcessStatus extends StObject
object ProcessStatus {
  
  @scala.inline
  def Aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @scala.inline
  def Active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def Finished: finished = "finished".asInstanceOf[finished]
}
