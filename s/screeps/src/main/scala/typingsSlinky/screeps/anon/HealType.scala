package typingsSlinky.screeps.anon

import typingsSlinky.screeps.EventHealType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealType extends js.Object {
  var amount: Double = js.native
  var healType: EventHealType = js.native
  var targetId: String = js.native
}

object HealType {
  @scala.inline
  def apply(amount: Double, healType: EventHealType, targetId: String): HealType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], healType = healType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealType]
  }
  @scala.inline
  implicit class HealTypeOps[Self <: HealType] (val x: Self) extends AnyVal {
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
    def withHealType(value: EventHealType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healType")(value.asInstanceOf[js.Any])
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

