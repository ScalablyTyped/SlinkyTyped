package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGatherOptions extends js.Object {
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.undefined
  var iceservers: js.UndefOr[js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]] = js.undefined
}

object RTCIceGatherOptions {
  @scala.inline
  def apply(
    gatherPolicy: RTCIceGatherPolicy = null,
    iceservers: js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer] = null
  ): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    if (gatherPolicy != null) __obj.updateDynamic("gatherPolicy")(gatherPolicy.asInstanceOf[js.Any])
    if (iceservers != null) __obj.updateDynamic("iceservers")(iceservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
}

