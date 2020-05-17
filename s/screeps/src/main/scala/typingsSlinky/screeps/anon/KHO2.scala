package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KHO2 extends js.Object {
  var KHO2: RangedMassAttack = js.native
  var KO: RangedAttack = js.native
  var XKHO2: RangedAttackRangedMassAttack = js.native
}

object KHO2 {
  @scala.inline
  def apply(KHO2: RangedMassAttack, KO: RangedAttack, XKHO2: RangedAttackRangedMassAttack): KHO2 = {
    val __obj = js.Dynamic.literal(KHO2 = KHO2.asInstanceOf[js.Any], KO = KO.asInstanceOf[js.Any], XKHO2 = XKHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[KHO2]
  }
  @scala.inline
  implicit class KHO2Ops[Self <: KHO2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKHO2(value: RangedMassAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKO(value: RangedAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXKHO2(value: RangedAttackRangedMassAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XKHO2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

