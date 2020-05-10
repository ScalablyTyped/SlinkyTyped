package typingsSlinky.welldoneSoftwareWhyDidYouRender.WhyDidYouRender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReasonForUpdate extends js.Object {
  var hookDifferences: js.Array[HookDifference] = js.native
  var propsDifferences: Boolean = js.native
  var stateDifferences: Boolean = js.native
}

object ReasonForUpdate {
  @scala.inline
  def apply(hookDifferences: js.Array[HookDifference], propsDifferences: Boolean, stateDifferences: Boolean): ReasonForUpdate = {
    val __obj = js.Dynamic.literal(hookDifferences = hookDifferences.asInstanceOf[js.Any], propsDifferences = propsDifferences.asInstanceOf[js.Any], stateDifferences = stateDifferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonForUpdate]
  }
  @scala.inline
  implicit class ReasonForUpdateOps[Self <: ReasonForUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHookDifferences(value: js.Array[HookDifference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookDifferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropsDifferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propsDifferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateDifferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDifferences")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

