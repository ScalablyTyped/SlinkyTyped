package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickSourceAction extends js.Object {
  var pickSourceAction: scala.Double = js.native
  var pickTargetAction: scala.Double = js.native
  var undecided: scala.Double = js.native
}

object PickSourceAction {
  @scala.inline
  def apply(pickSourceAction: scala.Double, pickTargetAction: scala.Double, undecided: scala.Double): PickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSourceAction]
  }
  @scala.inline
  implicit class PickSourceActionOps[Self <: PickSourceAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickSourceAction(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSourceAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickTargetAction(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickTargetAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

