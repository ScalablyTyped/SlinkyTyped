package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutomation extends js.Object {
  var automation: Double = js.native
  var deployment: Double = js.native
}

object AnonAutomation {
  @scala.inline
  def apply(automation: Double, deployment: Double): AnonAutomation = {
    val __obj = js.Dynamic.literal(automation = automation.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomation]
  }
  @scala.inline
  implicit class AnonAutomationOps[Self <: AnonAutomation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

