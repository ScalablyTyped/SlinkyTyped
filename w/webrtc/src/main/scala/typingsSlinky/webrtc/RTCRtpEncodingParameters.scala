package typingsSlinky.webrtc

import typingsSlinky.std.RTCDtxStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters
@js.native
trait RTCRtpEncodingParameters extends js.Object {
  //ssrc: number;
  //rtx: RTCRtpRtxParameters;
  //fec: RTCRtpFecParameters;
  var dtx: js.UndefOr[RTCDtxStatus] = js.native
  //active: boolean;
  //priority: RTCPriorityType;
  //maxBitrate: number;
  var rid: String = js.native
  var scaleResolutionDownBy: js.UndefOr[Double] = js.native
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(rid: String): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal(rid = rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  @scala.inline
  implicit class RTCRtpEncodingParametersOps[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtx(value: RTCDtxStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtx")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleResolutionDownBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleResolutionDownBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleResolutionDownBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleResolutionDownBy")(js.undefined)
        ret
    }
  }
  
}

