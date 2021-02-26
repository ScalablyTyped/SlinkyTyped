package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceTransportEventMap extends StObject {
  
  var gatheringstatechange: org.scalajs.dom.raw.Event = js.native
  
  var selectedcandidatepairchange: org.scalajs.dom.raw.Event = js.native
  
  var statechange: org.scalajs.dom.raw.Event = js.native
}
object RTCIceTransportEventMap {
  
  @scala.inline
  def apply(
    gatheringstatechange: org.scalajs.dom.raw.Event,
    selectedcandidatepairchange: org.scalajs.dom.raw.Event,
    statechange: org.scalajs.dom.raw.Event
  ): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  
  @scala.inline
  implicit class RTCIceTransportEventMapMutableBuilder[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatheringstatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "gatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedcandidatepairchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "selectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
