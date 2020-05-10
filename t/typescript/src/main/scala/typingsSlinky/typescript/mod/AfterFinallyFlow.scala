package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterFinallyFlow
  extends FlowNodeBase
     with FlowLock
     with FlowNode {
  var antecedent: FlowNode = js.native
}

object AfterFinallyFlow {
  @scala.inline
  def apply(antecedent: FlowNode, flags: FlowFlags): AfterFinallyFlow = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFinallyFlow]
  }
  @scala.inline
  implicit class AfterFinallyFlowOps[Self <: AfterFinallyFlow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntecedent(value: FlowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antecedent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

