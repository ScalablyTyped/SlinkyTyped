package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`16`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotsObjectProperty extends Property {
  
  @JSName("value")
  var value_SlotsObjectProperty: SlotFunctionExpression = js.native
}
object SlotsObjectProperty {
  
  @scala.inline
  def apply(key: ExpressionNode, loc: SourceLocation, `type`: `16`, value: SlotFunctionExpression): SlotsObjectProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotsObjectProperty]
  }
  
  @scala.inline
  implicit class SlotsObjectPropertyOps[Self <: SlotsObjectProperty] (val x: Self) extends AnyVal {
    
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
    def setValue(value: SlotFunctionExpression): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
