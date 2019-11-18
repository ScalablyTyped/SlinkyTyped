package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionEventMap extends js.Object {
  var connectionstatechange: org.scalajs.dom.raw.Event
  var datachannel: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent
  var icecandidate: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent
  var icecandidateerror: RTCPeerConnectionIceErrorEvent
  var iceconnectionstatechange: org.scalajs.dom.raw.Event
  var icegatheringstatechange: org.scalajs.dom.raw.Event
  var negotiationneeded: org.scalajs.dom.raw.Event
  var signalingstatechange: org.scalajs.dom.raw.Event
  var statsended: RTCStatsEvent
  var track: RTCTrackEvent
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
}

