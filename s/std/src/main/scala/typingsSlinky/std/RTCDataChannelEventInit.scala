package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelEventInit extends EventInit {
  
  var channel: org.scalajs.dom.experimental.webrtc.RTCDataChannel = js.native
}
object RTCDataChannelEventInit {
  
  @scala.inline
  def apply(channel: org.scalajs.dom.experimental.webrtc.RTCDataChannel): RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventInitOps[Self <: org.scalajs.dom.experimental.webrtc.RTCDataChannelEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: org.scalajs.dom.experimental.webrtc.RTCDataChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
}
