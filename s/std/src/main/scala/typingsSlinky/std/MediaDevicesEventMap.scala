package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDevicesEventMap extends js.Object {
  var devicechange: org.scalajs.dom.raw.Event = js.native
}

object MediaDevicesEventMap {
  @scala.inline
  def apply(devicechange: org.scalajs.dom.raw.Event): MediaDevicesEventMap = {
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
    def withDevicechange(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

