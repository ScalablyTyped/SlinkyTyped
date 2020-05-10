package typingsSlinky.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPassiveUndefined extends js.Object {
  var passive: js.UndefOr[scala.Nothing] = js.native
}

object AnonPassiveUndefined {
  @scala.inline
  def apply(): AnonPassiveUndefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPassiveUndefined]
  }
  @scala.inline
  implicit class AnonPassiveUndefinedOps[Self <: AnonPassiveUndefined] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassive(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(js.undefined)
        ret
    }
  }
  
}

