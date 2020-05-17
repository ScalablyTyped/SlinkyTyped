package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangedHeal extends js.Object {
  var heal: typingsSlinky.screeps.screepsNumbers.`3` = js.native
  var rangedHeal: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}

object RangedHeal {
  @scala.inline
  def apply(
    heal: typingsSlinky.screeps.screepsNumbers.`3`,
    rangedHeal: typingsSlinky.screeps.screepsNumbers.`3`
  ): RangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedHeal]
  }
  @scala.inline
  implicit class RangedHealOps[Self <: RangedHeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeal(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedHeal(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedHeal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

