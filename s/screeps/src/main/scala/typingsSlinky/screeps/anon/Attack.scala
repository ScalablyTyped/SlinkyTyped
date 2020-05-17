package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attack extends js.Object {
  var attack: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}

object Attack {
  @scala.inline
  def apply(attack: typingsSlinky.screeps.screepsNumbers.`2`): Attack = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attack]
  }
  @scala.inline
  implicit class AttackOps[Self <: Attack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttack(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

