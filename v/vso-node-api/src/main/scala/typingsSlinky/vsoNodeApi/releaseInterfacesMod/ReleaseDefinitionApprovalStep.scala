package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionApprovalStep extends ReleaseDefinitionEnvironmentStep {
  var approver: IdentityRef = js.native
  var isAutomated: Boolean = js.native
  var isNotificationOn: Boolean = js.native
  var rank: Double = js.native
}

object ReleaseDefinitionApprovalStep {
  @scala.inline
  def apply(approver: IdentityRef, id: Double, isAutomated: Boolean, isNotificationOn: Boolean, rank: Double): ReleaseDefinitionApprovalStep = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], isNotificationOn = isNotificationOn.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
  @scala.inline
  implicit class ReleaseDefinitionApprovalStepOps[Self <: ReleaseDefinitionApprovalStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprover(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAutomated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNotificationOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotificationOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

