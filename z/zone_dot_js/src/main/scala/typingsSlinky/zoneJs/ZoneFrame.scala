package typingsSlinky.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _ZoneFrame represents zone stack frame information
  */
@js.native
trait ZoneFrame extends js.Object {
  var parent: ZoneFrame | Null = js.native
  var zone: Zone = js.native
}

object ZoneFrame {
  @scala.inline
  def apply(zone: Zone): ZoneFrame = {
    val __obj = js.Dynamic.literal(zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneFrame]
  }
  @scala.inline
  implicit class ZoneFrameOps[Self <: ZoneFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZone(value: Zone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ZoneFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

