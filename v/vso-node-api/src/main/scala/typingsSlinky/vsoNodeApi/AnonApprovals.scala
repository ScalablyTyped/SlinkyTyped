package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApprovals extends js.Object {
  var all: Double = js.native
  var approvals: Double = js.native
  var artifacts: Double = js.native
  var deploymentOnly: Double = js.native
}

object AnonApprovals {
  @scala.inline
  def apply(all: Double, approvals: Double, artifacts: Double, deploymentOnly: Double): AnonApprovals = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], deploymentOnly = deploymentOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApprovals]
  }
  @scala.inline
  implicit class AnonApprovalsOps[Self <: AnonApprovals] (val x: Self) extends AnyVal {
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
    def withApprovals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentOnly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

