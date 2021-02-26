package typingsSlinky.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#h-rtcdatachannelevent
@js.native
trait RTCDataChannelEvent extends StObject {
  
  val channel: RTCDataChannel = js.native
}
object RTCDataChannelEvent {
  
  @scala.inline
  def apply(channel: RTCDataChannel): RTCDataChannelEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEvent]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventMutableBuilder[Self <: RTCDataChannelEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
