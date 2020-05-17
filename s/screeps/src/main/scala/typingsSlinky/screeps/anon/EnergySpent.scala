package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnergySpent extends js.Object {
  var amount: Double = js.native
  var energySpent: Double = js.native
}

object EnergySpent {
  @scala.inline
  def apply(amount: Double, energySpent: Double): EnergySpent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], energySpent = energySpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergySpent]
  }
  @scala.inline
  implicit class EnergySpentOps[Self <: EnergySpent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergySpent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energySpent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

