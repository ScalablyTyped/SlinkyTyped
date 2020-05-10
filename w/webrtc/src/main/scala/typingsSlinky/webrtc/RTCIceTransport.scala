package typingsSlinky.webrtc

import org.scalajs.dom.experimental.webrtc.RTCIceCandidate
import org.scalajs.dom.experimental.webrtc.RTCIceGatheringState
import typingsSlinky.std.RTCIceCandidatePair
import typingsSlinky.std.RTCIceParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceTransport extends js.Object {
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: RTCIceGatheringState = js.native
  var ongatheringstatechange: IceTransportEventHandler = js.native
  var onselectedcandidatepairchange: IceTransportEventHandler = js.native
  var onstatechange: IceTransportEventHandler = js.native
  def getLocalCandidates(): js.Array[RTCIceCandidate] = js.native
  def getLocalParameters(): RTCIceParameters | Null = js.native
  def getRemoteCandidates(): js.Array[RTCIceCandidate] = js.native
  def getRemoteParameters(): RTCIceParameters | Null = js.native
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null = js.native
}

object RTCIceTransport {
  @scala.inline
  def apply(
    gatheringState: RTCIceGatheringState,
    getLocalCandidates: () => js.Array[RTCIceCandidate],
    getLocalParameters: () => RTCIceParameters | Null,
    getRemoteCandidates: () => js.Array[RTCIceCandidate],
    getRemoteParameters: () => RTCIceParameters | Null,
    getSelectedCandidatePair: () => RTCIceCandidatePair | Null
  ): RTCIceTransport = {
    val __obj = js.Dynamic.literal(gatheringState = gatheringState.asInstanceOf[js.Any], getLocalCandidates = js.Any.fromFunction0(getLocalCandidates), getLocalParameters = js.Any.fromFunction0(getLocalParameters), getRemoteCandidates = js.Any.fromFunction0(getRemoteCandidates), getRemoteParameters = js.Any.fromFunction0(getRemoteParameters), getSelectedCandidatePair = js.Any.fromFunction0(getSelectedCandidatePair))
    __obj.asInstanceOf[RTCIceTransport]
  }
  @scala.inline
  implicit class RTCIceTransportOps[Self <: RTCIceTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatheringState(value: RTCIceGatheringState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatheringState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLocalCandidates(value: () => js.Array[RTCIceCandidate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalCandidates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalParameters(value: () => RTCIceParameters | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRemoteCandidates(value: () => js.Array[RTCIceCandidate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteCandidates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRemoteParameters(value: () => RTCIceParameters | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedCandidatePair(value: () => RTCIceCandidatePair | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedCandidatePair")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOngatheringstatechange(value: IceTransportEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongatheringstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOngatheringstatechangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongatheringstatechange")(null)
        ret
    }
    @scala.inline
    def withOnselectedcandidatepairchange(value: IceTransportEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectedcandidatepairchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnselectedcandidatepairchangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectedcandidatepairchange")(null)
        ret
    }
    @scala.inline
    def withOnstatechange(value: IceTransportEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstatechangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstatechange")(null)
        ret
    }
  }
  
}

