package typingsSlinky.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodecparameters
@js.native
trait RTCRtpCodecParameters extends js.Object {
  //clockRate: number;
  var channels: js.UndefOr[Double] = js.native
  //payloadType: number;
  var mimeType: String = js.native
   // default = 1
  var sdpFmtpLine: js.UndefOr[String] = js.native
}

object RTCRtpCodecParameters {
  @scala.inline
  def apply(mimeType: String): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
  @scala.inline
  implicit class RTCRtpCodecParametersOps[Self <: RTCRtpCodecParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpFmtpLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpFmtpLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpFmtpLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpFmtpLine")(js.undefined)
        ret
    }
  }
  
}

