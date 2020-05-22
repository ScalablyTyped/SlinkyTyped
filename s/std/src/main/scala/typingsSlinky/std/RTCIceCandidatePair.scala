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
  def apply(
    local: org.scalajs.dom.experimental.webrtc.RTCIceCandidate = null,
    remote: org.scalajs.dom.experimental.webrtc.RTCIceCandidate = null
  ): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
}

