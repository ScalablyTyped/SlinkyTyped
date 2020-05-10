package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlobalWorkflow extends js.Object {
  var globalWorkflow: Double = js.native
  var workItemType: Double = js.native
}

object AnonGlobalWorkflow {
  @scala.inline
  def apply(globalWorkflow: Double, workItemType: Double): AnonGlobalWorkflow = {
    val __obj = js.Dynamic.literal(globalWorkflow = globalWorkflow.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalWorkflow]
  }
  @scala.inline
  implicit class AnonGlobalWorkflowOps[Self <: AnonGlobalWorkflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalWorkflow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

