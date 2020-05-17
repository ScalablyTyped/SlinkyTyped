package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalSnapshots extends js.Object {
  var all: scala.Double = js.native
  var approvalSnapshots: scala.Double = js.native
  var automatedApprovals: scala.Double = js.native
  var manualApprovals: scala.Double = js.native
  var none: scala.Double = js.native
}

object ApprovalSnapshots {
  @scala.inline
  def apply(
    all: scala.Double,
    approvalSnapshots: scala.Double,
    automatedApprovals: scala.Double,
    manualApprovals: scala.Double,
    none: scala.Double
  ): ApprovalSnapshots = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvalSnapshots = approvalSnapshots.asInstanceOf[js.Any], automatedApprovals = automatedApprovals.asInstanceOf[js.Any], manualApprovals = manualApprovals.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalSnapshots]
  }
  @scala.inline
  implicit class ApprovalSnapshotsOps[Self <: ApprovalSnapshots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprovalSnapshots(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedApprovals(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualApprovals(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

