package typingsSlinky.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannelinit
@js.native
trait RTCDataChannelInit extends StObject {
  
  // default = false
  var id: js.UndefOr[Double] = js.native
  
  // default = true
  var maxPacketLifeTime: js.UndefOr[Double] = js.native
  
  var maxRetransmits: js.UndefOr[Double] = js.native
  
  // default = ''
  var negotiated: js.UndefOr[Boolean] = js.native
  
  var ordered: js.UndefOr[Boolean] = js.native
  
  var protocol: js.UndefOr[String] = js.native
}
object RTCDataChannelInit {
  
  @scala.inline
  def apply(): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDataChannelInit]
  }
  
  @scala.inline
  implicit class RTCDataChannelInitMutableBuilder[Self <: RTCDataChannelInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
    
    @scala.inline
    def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
    
    @scala.inline
    def setNegotiated(value: Boolean): Self = StObject.set(x, "negotiated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegotiatedUndefined: Self = StObject.set(x, "negotiated", js.undefined)
    
    @scala.inline
    def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
