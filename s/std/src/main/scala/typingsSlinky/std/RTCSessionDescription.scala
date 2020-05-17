package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
@js.native
trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String = js.native
  val `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType = js.native
  def toJSON(): js.Any = js.native
}

object RTCSessionDescription {
  @scala.inline
  def apply(
    sdp: java.lang.String,
    toJSON: () => js.Any,
    `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType
  ): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescription]
  }
  @scala.inline
  implicit class RTCSessionDescriptionOps[Self <: org.scalajs.dom.experimental.webrtc.RTCSessionDescription] (val x: Self) extends AnyVal {
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
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: org.scalajs.dom.experimental.webrtc.RTCSdpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

