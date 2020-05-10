package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementEventMap extends js.Object {
  var fullscreenchange: Event_ = js.native
  var fullscreenerror: Event_ = js.native
}

object ElementEventMap {
  @scala.inline
  def apply(fullscreenchange: Event_, fullscreenerror: Event_): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  @scala.inline
  implicit class ElementEventMapOps[Self <: ElementEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreenchange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenerror(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenerror")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

