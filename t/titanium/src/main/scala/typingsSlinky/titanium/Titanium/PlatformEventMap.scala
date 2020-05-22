package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformEventMap extends ProxyEventMap {
  var battery: PlatformBatteryEvent
}

object PlatformEventMap {
  @scala.inline
  def apply(battery: PlatformBatteryEvent): PlatformEventMap = {
    val __obj = js.Dynamic.literal(battery = battery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEventMap]
  }
}

