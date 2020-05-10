package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  var active: js.UndefOr[scala.Boolean] = js.native
  var codecPayloadType: js.UndefOr[Double] = js.native
  var dtx: js.UndefOr[RTCDtxStatus] = js.native
  var maxBitrate: js.UndefOr[Double] = js.native
  var maxFramerate: js.UndefOr[Double] = js.native
  var ptime: js.UndefOr[Double] = js.native
  var scaleResolutionDownBy: js.UndefOr[Double] = js.native
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  @scala.inline
  implicit class RTCRtpEncodingParametersOps[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecPayloadType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecPayloadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecPayloadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecPayloadType")(js.undefined)
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
    def withMaxBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFramerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFramerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFramerate")(js.undefined)
        ret
    }
    @scala.inline
    def withPtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptime")(js.undefined)
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

