package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`14`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallExpression
  extends JSChildNode
     with Node2
     with InferCodegenNodeType[js.Any]
     with PropsExpression {
  
  var arguments: js.Array[
    String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
  ] = js.native
  
  var callee: String | js.Symbol = js.native
  
  @JSName("type")
  var type_CallExpression: `14` = js.native
}
object CallExpression {
  
  @scala.inline
  def apply(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression]
  }
  
  @scala.inline
  implicit class CallExpressionOps[Self <: CallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentsVarargs(
      value: (String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode])*
    ): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(
      value: js.Array[
          String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
        ]
    ): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: String | js.Symbol): Self = this.set("callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `14`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
