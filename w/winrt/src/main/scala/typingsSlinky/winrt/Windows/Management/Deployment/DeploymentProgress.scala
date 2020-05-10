package typingsSlinky.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentProgress extends js.Object {
  var percentage: Double = js.native
  var state: DeploymentProgressState = js.native
}

object DeploymentProgress {
  @scala.inline
  def apply(percentage: Double, state: DeploymentProgressState): DeploymentProgress = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentProgress]
  }
  @scala.inline
  implicit class DeploymentProgressOps[Self <: DeploymentProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: DeploymentProgressState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

