package typingsSlinky.webrtc

import typingsSlinky.std.RTCRtpTransceiverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverinit
@js.native
trait RTCRtpTransceiverInit extends js.Object {
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.native
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.native
   // default = 'sendrecv'
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
}

object RTCRtpTransceiverInit {
  @scala.inline
  def apply(): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
  @scala.inline
  implicit class RTCRtpTransceiverInitOps[Self <: RTCRtpTransceiverInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: RTCRtpTransceiverDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withSendEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendEncodings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendEncodings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendEncodings")(js.undefined)
        ret
    }
    @scala.inline
    def withStreams(value: js.Array[MediaStream]): Self = {
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

