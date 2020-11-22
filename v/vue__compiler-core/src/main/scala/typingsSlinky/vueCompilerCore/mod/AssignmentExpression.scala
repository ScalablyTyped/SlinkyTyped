package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`24`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression
  extends JSChildNode
     with Node2
     with SSRCodegenNode {
  
  var left: SimpleExpressionNode = js.native
  
  var right: JSChildNode = js.native
  
  @JSName("type")
  var type_AssignmentExpression: `24` = js.native
}
object AssignmentExpression {
  
  @scala.inline
  def apply(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode, `type`: `24`): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
  
  @scala.inline
  implicit class AssignmentExpressionOps[Self <: AssignmentExpression] (val x: Self) extends AnyVal {
    
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
    def setLeft(value: SimpleExpressionNode): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: JSChildNode): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `24`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
