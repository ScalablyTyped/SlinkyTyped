package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowAssignment
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode = js.native
  var node: Expression | VariableDeclaration | BindingElement = js.native
}

object FlowAssignment {
  @scala.inline
  def apply(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowAssignment]
  }
  @scala.inline
  implicit class FlowAssignmentOps[Self <: FlowAssignment] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNode(value: Expression | VariableDeclaration | BindingElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

