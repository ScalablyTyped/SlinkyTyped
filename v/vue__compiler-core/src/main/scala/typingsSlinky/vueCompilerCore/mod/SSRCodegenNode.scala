package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`21`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`22`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`23`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`24`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`25`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`26`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueCompilerCore.mod.BlockStatement
  - typingsSlinky.vueCompilerCore.mod.TemplateLiteral
  - typingsSlinky.vueCompilerCore.mod.IfStatement
  - typingsSlinky.vueCompilerCore.mod.AssignmentExpression
  - typingsSlinky.vueCompilerCore.mod.ReturnStatement
  - typingsSlinky.vueCompilerCore.mod.SequenceExpression
*/
trait SSRCodegenNode extends CodegenNode
object SSRCodegenNode {
  
  @scala.inline
  def AssignmentExpression(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode, `type`: `24`): typingsSlinky.vueCompilerCore.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.AssignmentExpression]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[JSChildNode | IfStatement], loc: SourceLocation, `type`: `21`): typingsSlinky.vueCompilerCore.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.BlockStatement]
  }
  
  @scala.inline
  def IfStatement(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode, `type`: `23`): typingsSlinky.vueCompilerCore.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.IfStatement]
  }
  
  @scala.inline
  def ReturnStatement(
    loc: SourceLocation,
    returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode,
    `type`: `26`
  ): typingsSlinky.vueCompilerCore.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.ReturnStatement]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[JSChildNode], loc: SourceLocation, `type`: `25`): typingsSlinky.vueCompilerCore.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.SequenceExpression]
  }
  
  @scala.inline
  def TemplateLiteral(elements: js.Array[String | JSChildNode], loc: SourceLocation, `type`: `22`): typingsSlinky.vueCompilerCore.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.TemplateLiteral]
  }
}
