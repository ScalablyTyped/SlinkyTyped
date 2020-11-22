package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`14`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`15`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`4`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueCompilerCore.mod.ObjectExpression
  - typingsSlinky.vueCompilerCore.mod.CallExpression
  - typingsSlinky.vueCompilerCore.mod.ExpressionNode
*/
trait PropsExpression extends js.Object
object PropsExpression {
  
  @scala.inline
  def ObjectExpression(loc: SourceLocation, properties: js.Array[Property], `type`: `15`): PropsExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsExpression]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): PropsExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsExpression]
  }
  
  @scala.inline
  def SimpleExpressionNode(content: String, isConstant: Boolean, isStatic: Boolean, loc: SourceLocation, `type`: `4`): PropsExpression = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isConstant = isConstant.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsExpression]
  }
  
  @scala.inline
  def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation,
    `type`: `8`
  ): PropsExpression = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsExpression]
  }
}
