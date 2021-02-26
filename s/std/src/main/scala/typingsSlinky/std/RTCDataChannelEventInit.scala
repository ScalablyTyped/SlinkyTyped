package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelEventInit extends EventInit {
  
  var channel: org.scalajs.dom.experimental.webrtc.RTCDataChannel = js.native
}
object RTCDataChannelEventInit {
  
  @scala.inline
  def apply(channel: org.scalajs.dom.experimental.webrtc.RTCDataChannel): org.scalajs.dom.experimental.webrtc.RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCDataChannelEventInit]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventInitMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCDataChannelEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: org.scalajs.dom.experimental.webrtc.RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
