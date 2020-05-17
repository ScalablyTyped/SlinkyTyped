package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Automatic extends js.Object {
  var automatic: scala.Double = js.native
  var deploymentSubmitter: scala.Double = js.native
  var firstPreDeploymentApprover: scala.Double = js.native
}

object Automatic {
  @scala.inline
  def apply(
    automatic: scala.Double,
    deploymentSubmitter: scala.Double,
    firstPreDeploymentApprover: scala.Double
  ): Automatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automatic]
  }
  @scala.inline
  implicit class AutomaticOps[Self <: Automatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatic(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentSubmitter(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentSubmitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPreDeploymentApprover(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPreDeploymentApprover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

