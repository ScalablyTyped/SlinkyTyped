package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpCapabilities extends js.Object {
  var codecs: js.Array[RTCRtpCodecCapability] = js.native
  var headerExtensions: js.Array[RTCRtpHeaderExtensionCapability] = js.native
}

object RTCRtpCapabilities {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecCapability],
    headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
  ): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
  @scala.inline
  implicit class RTCRtpCapabilitiesOps[Self <: RTCRtpCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodecs(value: js.Array[RTCRtpCodecCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtensions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

