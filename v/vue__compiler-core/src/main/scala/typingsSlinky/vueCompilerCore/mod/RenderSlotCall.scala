package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`14`
import typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.LeftcurlybracketRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType because Already inherited */ @js.native
trait RenderSlotCall
  extends CallExpression
     with BlockCodegenNode {
  
  @JSName("arguments")
  var arguments_RenderSlotCall: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
    String, 
    String | ExpressionNode, 
    PropsExpression | LeftcurlybracketRightcurlybracket, 
    js.Array[TemplateChildNode]
  ]) = js.native
  
  @JSName("callee")
  var callee_RenderSlotCall: js.Symbol = js.native
}
object RenderSlotCall {
  
  @scala.inline
  def apply(
    arguments: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
      String, 
      String | ExpressionNode, 
      PropsExpression | LeftcurlybracketRightcurlybracket, 
      js.Array[TemplateChildNode]
    ]),
    callee: js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): RenderSlotCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSlotCall]
  }
  
  @scala.inline
  implicit class RenderSlotCallMutableBuilder[Self <: RenderSlotCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(
      value: (js.Tuple2[String, String | ExpressionNode]) | (js.Tuple3[String, String | ExpressionNode, PropsExpression]) | (js.Tuple4[
          String, 
          String | ExpressionNode, 
          PropsExpression | LeftcurlybracketRightcurlybracket, 
          js.Array[TemplateChildNode]
        ])
    ): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
