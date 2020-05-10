package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDevicesEventMap extends js.Object {
  var devicechange: Event_ = js.native
}

object MediaDevicesEventMap {
  @scala.inline
  def apply(devicechange: Event_): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  @scala.inline
  implicit class MediaDevicesEventMapOps[Self <: MediaDevicesEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevicechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

