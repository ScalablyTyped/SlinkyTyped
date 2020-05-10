package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformEventMap extends ProxyEventMap {
  var battery: PlatformBatteryEvent = js.native
}

object PlatformEventMap {
  @scala.inline
  def apply(battery: PlatformBatteryEvent): PlatformEventMap = {
    val __obj = js.Dynamic.literal(battery = battery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEventMap]
  }
  @scala.inline
  implicit class PlatformEventMapOps[Self <: PlatformEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBattery(value: PlatformBatteryEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("battery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

