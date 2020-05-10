package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpUnhandled extends js.Object {
  var muxId: js.UndefOr[java.lang.String] = js.native
  var payloadType: js.UndefOr[Double] = js.native
  var ssrc: js.UndefOr[Double] = js.native
}

object RTCRtpUnhandled {
  @scala.inline
  def apply(): RTCRtpUnhandled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpUnhandled]
  }
  @scala.inline
  implicit class RTCRtpUnhandledOps[Self <: RTCRtpUnhandled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuxId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuxId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muxId")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadType")(js.undefined)
        ret
    }
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

