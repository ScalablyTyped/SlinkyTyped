package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class FlowAssignmentMutableBuilder[Self <: FlowAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Expression | VariableDeclaration | BindingElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
