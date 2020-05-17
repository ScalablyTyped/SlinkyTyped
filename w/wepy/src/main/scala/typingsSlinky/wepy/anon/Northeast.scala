package typingsSlinky.wepy.anon

import typingsSlinky.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Northeast extends js.Object {
  var northeast: LagLng = js.native
  var southwest: LagLng = js.native
}

object Northeast {
  @scala.inline
  def apply(northeast: LagLng, southwest: LagLng): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
  @scala.inline
  implicit class NortheastOps[Self <: Northeast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNortheast(value: LagLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northeast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthwest(value: LagLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southwest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

