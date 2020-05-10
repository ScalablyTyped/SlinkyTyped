package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerEventMap extends ProxyEventMap {
  var update: AccelerometerUpdateEvent = js.native
}

object AccelerometerEventMap {
  @scala.inline
  def apply(update: AccelerometerUpdateEvent): AccelerometerEventMap = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerEventMap]
  }
  @scala.inline
  implicit class AccelerometerEventMapOps[Self <: AccelerometerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdate(value: AccelerometerUpdateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

