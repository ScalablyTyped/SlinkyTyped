package typingsSlinky.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPassive extends js.Object {
  var passive: Boolean = js.native
}

object AnonPassive {
  @scala.inline
  def apply(passive: Boolean): AnonPassive = {
    val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassive]
  }
  @scala.inline
  implicit class AnonPassiveOps[Self <: AnonPassive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

