package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.FlowStart
  - typingsSlinky.typescript.mod.FlowLabel
  - typingsSlinky.typescript.mod.FlowAssignment
  - typingsSlinky.typescript.mod.FlowCall
  - typingsSlinky.typescript.mod.FlowCondition
  - typingsSlinky.typescript.mod.FlowSwitchClause
  - typingsSlinky.typescript.mod.FlowArrayMutation
  - typingsSlinky.typescript.mod.FlowReduceLabel
*/
trait FlowNode extends StObject
object FlowNode {
  
  @scala.inline
  def FlowArrayMutation(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): typingsSlinky.typescript.mod.FlowArrayMutation = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowArrayMutation]
  }
  
  @scala.inline
  def FlowAssignment(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): typingsSlinky.typescript.mod.FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowAssignment]
  }
  
  @scala.inline
  def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression): typingsSlinky.typescript.mod.FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowCall]
  }
  
  @scala.inline
  def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression): typingsSlinky.typescript.mod.FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowCondition]
  }
  
  @scala.inline
  def FlowLabel(flags: FlowFlags): typingsSlinky.typescript.mod.FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowLabel]
  }
  
  @scala.inline
  def FlowReduceLabel(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): typingsSlinky.typescript.mod.FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowReduceLabel]
  }
  
  @scala.inline
  def FlowStart(flags: FlowFlags): typingsSlinky.typescript.mod.FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowStart]
  }
  
  @scala.inline
  def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): typingsSlinky.typescript.mod.FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.FlowSwitchClause]
  }
}
