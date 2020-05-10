package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApprovalSnapshots extends js.Object {
  var all: Double = js.native
  var approvalSnapshots: Double = js.native
  var automatedApprovals: Double = js.native
  var manualApprovals: Double = js.native
  var none: Double = js.native
}

object AnonApprovalSnapshots {
  @scala.inline
  def apply(
    all: Double,
    approvalSnapshots: Double,
    automatedApprovals: Double,
    manualApprovals: Double,
    none: Double
  ): AnonApprovalSnapshots = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvalSnapshots = approvalSnapshots.asInstanceOf[js.Any], automatedApprovals = automatedApprovals.asInstanceOf[js.Any], manualApprovals = manualApprovals.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApprovalSnapshots]
  }
  @scala.inline
  implicit class AnonApprovalSnapshotsOps[Self <: AnonApprovalSnapshots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprovalSnapshots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedApprovals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualApprovals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

