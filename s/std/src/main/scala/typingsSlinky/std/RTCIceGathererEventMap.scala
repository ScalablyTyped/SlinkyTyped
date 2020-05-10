package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceGathererEventMap extends js.Object {
  var error: Event_ = js.native
  var localcandidate: RTCIceGathererEvent = js.native
}

object RTCIceGathererEventMap {
  @scala.inline
  def apply(error: Event_, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], localcandidate = localcandidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
  @scala.inline
  implicit class RTCIceGathererEventMapOps[Self <: RTCIceGathererEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalcandidate(value: RTCIceGathererEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localcandidate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

