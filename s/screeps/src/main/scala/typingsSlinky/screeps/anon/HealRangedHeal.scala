package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealRangedHeal extends js.Object {
  var heal: typingsSlinky.screeps.screepsNumbers.`4` = js.native
  var rangedHeal: typingsSlinky.screeps.screepsNumbers.`4` = js.native
}

object HealRangedHeal {
  @scala.inline
  def apply(
    heal: typingsSlinky.screeps.screepsNumbers.`4`,
    rangedHeal: typingsSlinky.screeps.screepsNumbers.`4`
  ): HealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealRangedHeal]
  }
  @scala.inline
  implicit class HealRangedHealOps[Self <: HealRangedHeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeal(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedHeal(value: typingsSlinky.screeps.screepsNumbers.`4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedHeal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

