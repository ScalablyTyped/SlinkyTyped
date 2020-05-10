package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceTransportEventMap extends js.Object {
  var gatheringstatechange: Event_ = js.native
  var selectedcandidatepairchange: Event_ = js.native
  var statechange: Event_ = js.native
}

object RTCIceTransportEventMap {
  @scala.inline
  def apply(gatheringstatechange: Event_, selectedcandidatepairchange: Event_, statechange: Event_): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  @scala.inline
  implicit class RTCIceTransportEventMapOps[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatheringstatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatheringstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedcandidatepairchange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedcandidatepairchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

