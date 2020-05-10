package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSessionDescriptionInit extends js.Object {
  var sdp: js.UndefOr[java.lang.String] = js.native
  var `type`: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCSdpType] = js.native
}

object RTCSessionDescriptionInit {
  @scala.inline
  def apply(): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
  @scala.inline
  implicit class RTCSessionDescriptionInitOps[Self <: org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSdp(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: org.scalajs.dom.experimental.webrtc.RTCSdpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

