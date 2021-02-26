package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCStats extends StObject {
  
  var id: java.lang.String = js.native
  
  var timestamp: Double = js.native
  
  var `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType = js.native
}
object RTCStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType): org.scalajs.dom.experimental.webrtc.RTCStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCStats]
  }
  
  @scala.inline
  implicit class RTCStatsMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: org.scalajs.dom.experimental.webrtc.RTCStatsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
