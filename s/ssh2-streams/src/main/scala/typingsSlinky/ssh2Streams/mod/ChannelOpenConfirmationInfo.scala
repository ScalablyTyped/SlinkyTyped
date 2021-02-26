package typingsSlinky.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelOpenConfirmationInfo extends StObject {
  
  var packetSize: Double = js.native
  
  var recipient: Double = js.native
  
  var sender: Double = js.native
  
  var window: Double = js.native
}
object ChannelOpenConfirmationInfo {
  
  @scala.inline
  def apply(packetSize: Double, recipient: Double, sender: Double, window: Double): ChannelOpenConfirmationInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenConfirmationInfo]
  }
  
  @scala.inline
  implicit class ChannelOpenConfirmationInfoMutableBuilder[Self <: ChannelOpenConfirmationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
