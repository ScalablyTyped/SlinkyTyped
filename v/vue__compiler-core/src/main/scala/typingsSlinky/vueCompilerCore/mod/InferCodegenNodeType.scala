package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`14`
import typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.LeftcurlybracketRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueCompilerCore.mod.CallExpression
  - typingsSlinky.vueCompilerCore.mod.RenderSlotCall
*/
trait InferCodegenNodeType[T] extends StObject
object InferCodegenNodeType {
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): typingsSlinky.vueCompilerCore.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.CallExpression]
  }
  
  @scala.inline
  def RenderSlotCall(
    arguments: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
      String, 
      String | ExpressionNode, 
      PropsExpression | LeftcurlybracketRightcurlybracket, 
      js.Array[TemplateChildNode]
    ]),
    callee: js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): typingsSlinky.vueCompilerCore.mod.RenderSlotCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.RenderSlotCall]
  }
}
