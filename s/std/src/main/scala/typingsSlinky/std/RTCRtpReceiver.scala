package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
@js.native
trait RTCRtpReceiver extends js.Object {
  val rtcpTransport: RTCDtlsTransport | Null = js.native
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  val transport: RTCDtlsTransport | Null = js.native
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  def getParameters(): RTCRtpReceiveParameters = js.native
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
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
    def withGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContributingSources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameters(value: () => RTCRtpReceiveParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStats(value: () => js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSynchronizationSources(value: () => js.Array[RTCRtpSynchronizationSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSynchronizationSources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtcpTransport(value: RTCDtlsTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtcpTransportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpTransport")(null)
        ret
    }
    @scala.inline
    def withTransport(value: RTCDtlsTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(null)
        ret
    }
  }
  
}

