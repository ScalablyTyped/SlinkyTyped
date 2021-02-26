package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`2`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`5`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueCompilerCore.mod.TextNode
  - typingsSlinky.vueCompilerCore.mod.InterpolationNode
  - typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode
*/
trait TemplateTextChildNode extends StObject
object TemplateTextChildNode {
  
  @scala.inline
  def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation,
    `type`: `8`
  ): typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode]
  }
  
  @scala.inline
  def InterpolationNode(content: ExpressionNode, loc: SourceLocation, `type`: `5`): typingsSlinky.vueCompilerCore.mod.InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.InterpolationNode]
  }
  
  @scala.inline
  def TextNode(content: String, loc: SourceLocation, `type`: `2`): typingsSlinky.vueCompilerCore.mod.TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.TextNode]
  }
}
