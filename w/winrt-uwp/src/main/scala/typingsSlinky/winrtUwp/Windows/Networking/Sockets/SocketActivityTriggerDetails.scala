package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
@js.native
trait SocketActivityTriggerDetails extends StObject {
  
  /** Get the reason the SocketActivityTrigger occurred. */
  var reason: SocketActivityTriggerReason = js.native
  
  /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
  var socketInformation: SocketActivityInformation = js.native
}
object SocketActivityTriggerDetails {
  
  @scala.inline
  def apply(reason: SocketActivityTriggerReason, socketInformation: SocketActivityInformation): SocketActivityTriggerDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], socketInformation = socketInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityTriggerDetails]
  }
  
  @scala.inline
  implicit class SocketActivityTriggerDetailsMutableBuilder[Self <: SocketActivityTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: SocketActivityTriggerReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketInformation(value: SocketActivityInformation): Self = StObject.set(x, "socketInformation", value.asInstanceOf[js.Any])
  }
}
