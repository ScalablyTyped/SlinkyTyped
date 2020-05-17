package typingsSlinky.screeps.anon

import typingsSlinky.screeps.PowerConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Power extends js.Object {
  var power: PowerConstant = js.native
  var targetId: String = js.native
}

object Power {
  @scala.inline
  def apply(power: PowerConstant, targetId: String): Power = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Power]
  }
  @scala.inline
  implicit class PowerOps[Self <: Power] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPower(value: PowerConstant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

