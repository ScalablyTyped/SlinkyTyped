package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpParameters extends js.Object {
  var codecs: js.Array[RTCRtpCodecParameters] = js.native
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters] = js.native
  var rtcp: RTCRtcpParameters = js.native
}

object RTCRtpParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  @scala.inline
  implicit class RTCRtpParametersOps[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodecs(value: js.Array[RTCRtpCodecParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtcp(value: RTCRtcpParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

