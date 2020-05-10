package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpRtxParameters extends js.Object {
  var ssrc: js.UndefOr[Double] = js.native
}

object RTCRtpRtxParameters {
  @scala.inline
  def apply(): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
  @scala.inline
  implicit class RTCRtpRtxParametersOps[Self <: RTCRtpRtxParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsrc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(js.undefined)
        ret
    }
  }
  
}

