package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Approvals extends js.Object {
  var all: scala.Double = js.native
  var approvals: scala.Double = js.native
  var artifacts: scala.Double = js.native
  var deploymentOnly: scala.Double = js.native
}

object Approvals {
  @scala.inline
  def apply(all: scala.Double, approvals: scala.Double, artifacts: scala.Double, deploymentOnly: scala.Double): Approvals = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], deploymentOnly = deploymentOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approvals]
  }
  @scala.inline
  implicit class ApprovalsOps[Self <: Approvals] (val x: Self) extends AnyVal {
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
    def withApprovals(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentOnly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

