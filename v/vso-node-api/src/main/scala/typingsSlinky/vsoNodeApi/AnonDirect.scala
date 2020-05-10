package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirect extends js.Object {
  var direct: Double = js.native
  var expanded: Double = js.native
  var expandedDown: Double = js.native
  var expandedUp: Double = js.native
  var none: Double = js.native
}

object AnonDirect {
  @scala.inline
  def apply(direct: Double, expanded: Double, expandedDown: Double, expandedUp: Double, none: Double): AnonDirect = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], expandedDown = expandedDown.asInstanceOf[js.Any], expandedUp = expandedUp.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirect]
  }
  @scala.inline
  implicit class AnonDirectOps[Self <: AnonDirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

