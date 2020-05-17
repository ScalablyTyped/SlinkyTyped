package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangedMassAttack extends js.Object {
  var rangedAttack: typingsSlinky.screeps.screepsNumbers.`3` = js.native
  var rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}

object RangedMassAttack {
  @scala.inline
  def apply(
    rangedAttack: typingsSlinky.screeps.screepsNumbers.`3`,
    rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`3`
  ): RangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedMassAttack]
  }
  @scala.inline
  implicit class RangedMassAttackOps[Self <: RangedMassAttack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangedAttack(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedAttack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedMassAttack(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedMassAttack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

