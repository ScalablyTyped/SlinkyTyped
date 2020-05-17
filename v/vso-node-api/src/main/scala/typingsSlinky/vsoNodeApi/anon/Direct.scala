package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direct extends js.Object {
  var direct: scala.Double = js.native
  var expanded: scala.Double = js.native
  var expandedDown: scala.Double = js.native
  var expandedUp: scala.Double = js.native
  var none: scala.Double = js.native
}

object Direct {
  @scala.inline
  def apply(
    direct: scala.Double,
    expanded: scala.Double,
    expandedDown: scala.Double,
    expandedUp: scala.Double,
    none: scala.Double
  ): Direct = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], expandedDown = expandedDown.asInstanceOf[js.Any], expandedUp = expandedUp.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direct]
  }
  @scala.inline
  implicit class DirectOps[Self <: Direct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirect(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedDown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedUp(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

