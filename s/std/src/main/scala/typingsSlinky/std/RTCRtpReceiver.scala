package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
trait RTCRtpReceiver extends js.Object {
  val rtcpTransport: RTCDtlsTransport | Null
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
  val transport: RTCDtlsTransport | Null
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  def getParameters(): RTCRtpReceiveParameters
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport]
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource]
}

object RTCRtpReceiver {
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport],
    getSynchronizationSources: () => js.Array[RTCRtpSynchronizationSource],
    track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  @scala.inline
  implicit class RTCRtpReceiverOps[Self <: RTCRtpReceiver] (val x: Self) extends AnyVal {
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
    def setGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = this.set("getContributingSources", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameters(value: () => RTCRtpReceiveParameters): Self = this.set("getParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStats(value: () => js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport]): Self = this.set("getStats", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSynchronizationSources(value: () => js.Array[RTCRtpSynchronizationSource]): Self = this.set("getSynchronizationSources", js.Any.fromFunction0(value))
    @scala.inline
    def setTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtcpTransport(value: RTCDtlsTransport): Self = this.set("rtcpTransport", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtcpTransportNull: Self = this.set("rtcpTransport", null)
    @scala.inline
    def setTransport(value: RTCDtlsTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportNull: Self = this.set("transport", null)
  }
  
}

