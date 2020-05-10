package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceCandidateInit extends js.Object {
  var candidate: js.UndefOr[java.lang.String] = js.native
  var sdpMLineIndex: js.UndefOr[Double | Null] = js.native
  var sdpMid: js.UndefOr[java.lang.String | Null] = js.native
  var usernameFragment: js.UndefOr[java.lang.String | Null] = js.native
}

object RTCIceCandidateInit {
  @scala.inline
  def apply(): RTCIceCandidateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateInit]
  }
  @scala.inline
  implicit class RTCIceCandidateInitOps[Self <: org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidate(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpMLineIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMLineIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpMLineIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMLineIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpMLineIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMLineIndex")(null)
        ret
    }
    @scala.inline
    def withSdpMid(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpMidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(null)
        ret
    }
    @scala.inline
    def withUsernameFragment(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameFragmentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameFragment")(null)
        ret
    }
  }
  
}

