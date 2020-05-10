package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPickSourceAction extends js.Object {
  var pickSourceAction: Double = js.native
  var pickTargetAction: Double = js.native
  var undecided: Double = js.native
}

object AnonPickSourceAction {
  @scala.inline
  def apply(pickSourceAction: Double, pickTargetAction: Double, undecided: Double): AnonPickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPickSourceAction]
  }
  @scala.inline
  implicit class AnonPickSourceActionOps[Self <: AnonPickSourceAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickSourceAction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSourceAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickTargetAction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickTargetAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

