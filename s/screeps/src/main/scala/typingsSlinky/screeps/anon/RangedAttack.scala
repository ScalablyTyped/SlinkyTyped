package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangedAttack extends js.Object {
  var rangedAttack: typingsSlinky.screeps.screepsNumbers.`2` = js.native
  var rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}

object RangedAttack {
  @scala.inline
  def apply(
    rangedAttack: typingsSlinky.screeps.screepsNumbers.`2`,
    rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`2`
  ): RangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttack]
  }
  @scala.inline
  implicit class RangedAttackOps[Self <: RangedAttack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangedAttack(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedAttack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangedMassAttack(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedMassAttack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

