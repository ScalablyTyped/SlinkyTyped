package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCErrorInit extends js.Object {
  var errorDetail: RTCErrorDetailType = js.native
  var httpRequestStatusCode: js.UndefOr[Double] = js.native
  var receivedAlert: js.UndefOr[Double] = js.native
  var sctpCauseCode: js.UndefOr[Double] = js.native
  var sdpLineNumber: js.UndefOr[Double] = js.native
  var sentAlert: js.UndefOr[Double] = js.native
}

object RTCErrorInit {
  @scala.inline
  def apply(errorDetail: RTCErrorDetailType): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
  @scala.inline
  implicit class RTCErrorInitOps[Self <: RTCErrorInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetail(value: RTCErrorDetailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpRequestStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequestStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRequestStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequestStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivedAlert(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivedAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withSctpCauseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sctpCauseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSctpCauseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sctpCauseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpLineNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSentAlert(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentAlert")(js.undefined)
        ret
    }
  }
  
}

