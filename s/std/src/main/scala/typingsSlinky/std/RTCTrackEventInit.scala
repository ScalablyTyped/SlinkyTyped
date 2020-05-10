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
    def withReceiver(value: RTCRtpReceiver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransceiver(value: RTCRtpTransceiver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transceiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreams(value: js.Array[org.scalajs.dom.experimental.mediastream.MediaStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(js.undefined)
        ret
    }
  }
  
}

