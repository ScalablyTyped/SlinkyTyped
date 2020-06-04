package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidatePair extends js.Object {
  var local: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceCandidate] = js.undefined
  var remote: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceCandidate] = js.undefined
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocal(value: org.scalajs.dom.experimental.webrtc.RTCIceCandidate): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setRemote(value: org.scalajs.dom.experimental.webrtc.RTCIceCandidate): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
  
}

