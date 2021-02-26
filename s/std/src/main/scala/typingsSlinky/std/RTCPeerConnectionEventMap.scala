package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionEventMap extends StObject {
  
  var connectionstatechange: org.scalajs.dom.raw.Event = js.native
  
  var datachannel: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent = js.native
  
  var icecandidate: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent = js.native
  
  var icecandidateerror: RTCPeerConnectionIceErrorEvent = js.native
  
  var iceconnectionstatechange: org.scalajs.dom.raw.Event = js.native
  
  var icegatheringstatechange: org.scalajs.dom.raw.Event = js.native
  
  var negotiationneeded: org.scalajs.dom.raw.Event = js.native
  
  var signalingstatechange: org.scalajs.dom.raw.Event = js.native
  
  var statsended: RTCStatsEvent = js.native
  
  var track: RTCTrackEvent = js.native
}
object RTCPeerConnectionEventMap {
  
  @scala.inline
  def apply(
    connectionstatechange: org.scalajs.dom.raw.Event,
    datachannel: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent,
    icecandidate: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: org.scalajs.dom.raw.Event,
    icegatheringstatechange: org.scalajs.dom.raw.Event,
    negotiationneeded: org.scalajs.dom.raw.Event,
    signalingstatechange: org.scalajs.dom.raw.Event,
    statsended: RTCStatsEvent,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], statsended = statsended.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  
  @scala.inline
  implicit class RTCPeerConnectionEventMapMutableBuilder[Self <: RTCPeerConnectionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionstatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "connectionstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatachannel(value: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent): Self = StObject.set(x, "datachannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcecandidate(value: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent): Self = StObject.set(x, "icecandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcecandidateerror(value: RTCPeerConnectionIceErrorEvent): Self = StObject.set(x, "icecandidateerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceconnectionstatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "iceconnectionstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcegatheringstatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "icegatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegotiationneeded(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "negotiationneeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalingstatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "signalingstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsended(value: RTCStatsEvent): Self = StObject.set(x, "statsended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: RTCTrackEvent): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
