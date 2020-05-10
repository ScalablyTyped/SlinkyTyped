package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtcpParameters extends js.Object {
  var cname: js.UndefOr[java.lang.String] = js.native
  var reducedSize: js.UndefOr[scala.Boolean] = js.native
}

object RTCRtcpParameters {
  @scala.inline
  def apply(): RTCRtcpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtcpParameters]
  }
  @scala.inline
  implicit class RTCRtcpParametersOps[Self <: RTCRtcpParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCname(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname")(js.undefined)
        ret
    }
    @scala.inline
    def withReducedSize(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReducedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducedSize")(js.undefined)
        ret
    }
  }
  
}

