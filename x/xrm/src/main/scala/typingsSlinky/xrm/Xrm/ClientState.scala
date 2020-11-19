package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
  * @see {@link XrmEnum.ClientState}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.Online
  - typingsSlinky.xrm.xrmStrings.Offline
*/
trait ClientState extends js.Object
object ClientState {
  
  @scala.inline
  def Offline: typingsSlinky.xrm.xrmStrings.Offline = "Offline".asInstanceOf[typingsSlinky.xrm.xrmStrings.Offline]
  
  @scala.inline
  def Online: typingsSlinky.xrm.xrmStrings.Online = "Online".asInstanceOf[typingsSlinky.xrm.xrmStrings.Online]
}
