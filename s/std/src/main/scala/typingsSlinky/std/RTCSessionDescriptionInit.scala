package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSessionDescriptionInit extends StObject {
  
  var sdp: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCSdpType] = js.native
}
object RTCSessionDescriptionInit {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit]
  }
  
  @scala.inline
  implicit class RTCSessionDescriptionInitMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
    
    @scala.inline
    def setType(value: org.scalajs.dom.experimental.webrtc.RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
