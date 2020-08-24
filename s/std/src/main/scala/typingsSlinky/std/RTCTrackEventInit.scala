package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTrackEventInit extends EventInit {
  var receiver: RTCRtpReceiver = js.native
  var streams: js.UndefOr[js.Array[org.scalajs.dom.experimental.mediastream.MediaStream]] = js.native
  var track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  var transceiver: RTCRtpTransceiver = js.native
}

object RTCTrackEventInit {
  @scala.inline
  def apply(
    receiver: RTCRtpReceiver,
    track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack,
    transceiver: RTCRtpTransceiver
  ): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
  @scala.inline
  implicit class RTCTrackEventInitOps[Self <: RTCTrackEventInit] (val x: Self) extends AnyVal {
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
    def setReceiver(value: RTCRtpReceiver): Self = this.set("receiver", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransceiver(value: RTCRtpTransceiver): Self = this.set("transceiver", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamsVarargs(value: org.scalajs.dom.experimental.mediastream.MediaStream*): Self = this.set("streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: js.Array[org.scalajs.dom.experimental.mediastream.MediaStream]): Self = this.set("streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
  
}

