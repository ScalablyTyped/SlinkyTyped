package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayExpression
  extends JSChildNode
     with Node2 {
  
  var elements: js.Array[String | JSChildNode] = js.native
  
  @JSName("type")
  var type_ArrayExpression: `17` = js.native
}
object ArrayExpression {
  
  @scala.inline
  def apply(elements: js.Array[String | JSChildNode], loc: SourceLocation, `type`: `17`): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayExpression]
  }
  
  @scala.inline
  implicit class ArrayExpressionOps[Self <: ArrayExpression] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: (String | JSChildNode)*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[String | JSChildNode]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `17`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
