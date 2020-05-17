package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
@js.native
trait RTCIceCandidate extends js.Object {
  val candidate: java.lang.String = js.native
  val component: RTCIceComponent | Null = js.native
  val foundation: java.lang.String | Null = js.native
  val port: Double | Null = js.native
  val priority: Double | Null = js.native
  val protocol: RTCIceProtocol | Null = js.native
  val relatedAddress: java.lang.String | Null = js.native
  val relatedPort: Double | Null = js.native
  val sdpMLineIndex: Double | Null = js.native
  val sdpMid: java.lang.String | Null = js.native
  val tcpType: RTCIceTcpCandidateType | Null = js.native
  val `type`: RTCIceCandidateType | Null = js.native
  val usernameFragment: java.lang.String | Null = js.native
  def toJSON(): org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit = js.native
}

object RTCIceCandidate {
  @scala.inline
  def apply(candidate: java.lang.String, toJSON: () => org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[RTCIceCandidate]
  }
  @scala.inline
  implicit class RTCIceCandidateOps[Self <: org.scalajs.dom.experimental.webrtc.RTCIceCandidate] (val x: Self) extends AnyVal {
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
    def withToJSON(value: () => org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComponent(value: RTCIceComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(null)
        ret
    }
    @scala.inline
    def withFoundation(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFoundationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundation")(null)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(null)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(null)
        ret
    }
    @scala.inline
    def withProtocol(value: RTCIceProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(null)
        ret
    }
    @scala.inline
    def withRelatedAddress(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedAddressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAddress")(null)
        ret
    }
    @scala.inline
    def withRelatedPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedPortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPort")(null)
        ret
    }
    @scala.inline
    def withSdpMLineIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMLineIndex")(value.asInstanceOf[js.Any])
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
    def withSdpMidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(null)
        ret
    }
    @scala.inline
    def withTcpType(value: RTCIceTcpCandidateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcpTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpType")(null)
        ret
    }
    @scala.inline
    def withType(value: RTCIceCandidateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
    @scala.inline
    def withUsernameFragment(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameFragment")(value.asInstanceOf[js.Any])
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

