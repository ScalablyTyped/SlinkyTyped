package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceCandidatePair extends js.Object {
  var local: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceCandidate] = js.native
  var remote: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceCandidate] = js.native
}

object RTCIceCandidatePair {
  @scala.inline
  def apply(): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
  @scala.inline
  implicit class RTCIceCandidatePairOps[Self <: RTCIceCandidatePair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: org.scalajs.dom.experimental.webrtc.RTCIceCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: org.scalajs.dom.experimental.webrtc.RTCIceCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
  }
  
}

