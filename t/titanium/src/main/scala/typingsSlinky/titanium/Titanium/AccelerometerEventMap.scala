package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerEventMap extends ProxyEventMap {
  var update: AccelerometerUpdateEvent
}

object AccelerometerEventMap {
  @scala.inline
  def apply(update: AccelerometerUpdateEvent): AccelerometerEventMap = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerEventMap]
  }
}

