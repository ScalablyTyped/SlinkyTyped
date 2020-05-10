package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureEventMap extends ProxyEventMap {
  var orientationchange: GestureOrientationchangeEvent = js.native
  var shake: GestureShakeEvent = js.native
}

object GestureEventMap {
  @scala.inline
  def apply(orientationchange: GestureOrientationchangeEvent, shake: GestureShakeEvent): GestureEventMap = {
    val __obj = js.Dynamic.literal(orientationchange = orientationchange.asInstanceOf[js.Any], shake = shake.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEventMap]
  }
  @scala.inline
  implicit class GestureEventMapOps[Self <: GestureEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientationchange(value: GestureOrientationchangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShake(value: GestureShakeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shake")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

