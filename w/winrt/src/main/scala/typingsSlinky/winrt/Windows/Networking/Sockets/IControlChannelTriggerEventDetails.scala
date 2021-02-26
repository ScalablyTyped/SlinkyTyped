package typingsSlinky.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlChannelTriggerEventDetails extends StObject {
  
  var controlChannelTrigger: ControlChannelTrigger = js.native
}
object IControlChannelTriggerEventDetails {
  
  @scala.inline
  def apply(controlChannelTrigger: ControlChannelTrigger): IControlChannelTriggerEventDetails = {
    val __obj = js.Dynamic.literal(controlChannelTrigger = controlChannelTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlChannelTriggerEventDetails]
  }
  
  @scala.inline
  implicit class IControlChannelTriggerEventDetailsMutableBuilder[Self <: IControlChannelTriggerEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlChannelTrigger(value: ControlChannelTrigger): Self = StObject.set(x, "controlChannelTrigger", value.asInstanceOf[js.Any])
  }
}
