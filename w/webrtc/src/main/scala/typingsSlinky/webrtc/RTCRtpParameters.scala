package typingsSlinky.webrtc

import typingsSlinky.std.RTCDegradationPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpparameters
@js.native
trait RTCRtpParameters extends js.Object {
  //encodings: RTCRtpEncodingParameters[];
  //headerExtensions: RTCRtpHeaderExtensionParameters[];
  //rtcp: RTCRtcpParameters;
  //codecs: RTCRtpCodecParameters[];
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.native
  var transactionId: String = js.native
}

object RTCRtpParameters {
  @scala.inline
  def apply(transactionId: String): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  @scala.inline
  implicit class RTCRtpParametersOps[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDegradationPreference(value: RTCDegradationPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degradationPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegradationPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degradationPreference")(js.undefined)
        ret
    }
  }
  
}

