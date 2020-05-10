package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceEventInit extends EventInit {
  var candidate: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceCandidate | Null] = js.native
  var url: js.UndefOr[java.lang.String | Null] = js.native
}

object RTCPeerConnectionIceEventInit {
  @scala.inline
  def apply(): RTCPeerConnectionIceEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCPeerConnectionIceEventInit]
  }
  @scala.inline
  implicit class RTCPeerConnectionIceEventInitOps[Self <: org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidate(value: org.scalajs.dom.experimental.webrtc.RTCIceCandidate): Self = {
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
    def withCandidateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(null)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(null)
        ret
    }
  }
  
}

