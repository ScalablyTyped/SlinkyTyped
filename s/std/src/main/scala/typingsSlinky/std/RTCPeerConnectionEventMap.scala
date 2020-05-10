package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionEventMap extends js.Object {
  var connectionstatechange: Event_ = js.native
  var datachannel: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent = js.native
  var icecandidate: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent = js.native
  var icecandidateerror: RTCPeerConnectionIceErrorEvent = js.native
  var iceconnectionstatechange: Event_ = js.native
  var icegatheringstatechange: Event_ = js.native
  var negotiationneeded: Event_ = js.native
  var signalingstatechange: Event_ = js.native
  var statsended: RTCStatsEvent = js.native
  var track: RTCTrackEvent = js.native
}

object RTCPeerConnectionEventMap {
  @scala.inline
  def apply(
    connectionstatechange: Event_,
    datachannel: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent,
    icecandidate: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: Event_,
    icegatheringstatechange: Event_,
    negotiationneeded: Event_,
    signalingstatechange: Event_,
    statsended: RTCStatsEvent,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], statsended = statsended.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  @scala.inline
  implicit class RTCPeerConnectionEventMapOps[Self <: RTCPeerConnectionEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionstatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatachannel(value: org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datachannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcecandidate(value: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icecandidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcecandidateerror(value: RTCPeerConnectionIceErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icecandidateerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIceconnectionstatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceconnectionstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcegatheringstatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icegatheringstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegotiationneeded(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiationneeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalingstatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalingstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatsended(value: RTCStatsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack(value: RTCTrackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

