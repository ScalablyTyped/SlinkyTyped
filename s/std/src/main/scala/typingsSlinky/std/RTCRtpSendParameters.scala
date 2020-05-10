package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpSendParameters extends RTCRtpParameters {
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.native
  var encodings: js.Array[RTCRtpEncodingParameters] = js.native
  var priority: js.UndefOr[RTCPriorityType] = js.native
  var transactionId: java.lang.String = js.native
}

object RTCRtpSendParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    encodings: js.Array[RTCRtpEncodingParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters,
    transactionId: java.lang.String
  ): RTCRtpSendParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSendParameters]
  }
  @scala.inline
  implicit class RTCRtpSendParametersOps[Self <: RTCRtpSendParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionId(value: java.lang.String): Self = {
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
    @scala.inline
    def withPriority(value: RTCPriorityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

