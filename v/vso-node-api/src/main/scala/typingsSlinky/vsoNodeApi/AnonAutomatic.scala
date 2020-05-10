package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutomatic extends js.Object {
  var automatic: Double = js.native
  var deploymentSubmitter: Double = js.native
  var firstPreDeploymentApprover: Double = js.native
}

object AnonAutomatic {
  @scala.inline
  def apply(automatic: Double, deploymentSubmitter: Double, firstPreDeploymentApprover: Double): AnonAutomatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomatic]
  }
  @scala.inline
  implicit class AnonAutomaticOps[Self <: AnonAutomatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentSubmitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentSubmitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPreDeploymentApprover(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPreDeploymentApprover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

