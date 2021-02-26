package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
@js.native
trait RTCSessionDescription extends StObject {
  
  val sdp: java.lang.String = js.native
  
  def toJSON(): js.Any = js.native
  
  val `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType = js.native
}
object RTCSessionDescription {
  
  @scala.inline
  def apply(
    sdp: java.lang.String,
    toJSON: () => js.Any,
    `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType
  ): org.scalajs.dom.experimental.webrtc.RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCSessionDescription]
  }
  
  @scala.inline
  implicit class RTCSessionDescriptionMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCSessionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: org.scalajs.dom.experimental.webrtc.RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
