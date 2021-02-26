package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`16`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSlotFnProperty extends Property {
  
  @JSName("value")
  var value_DynamicSlotFnProperty: SlotFunctionExpression = js.native
}
object DynamicSlotFnProperty {
  
  @scala.inline
  def apply(key: ExpressionNode, loc: SourceLocation, `type`: `16`, value: SlotFunctionExpression): DynamicSlotFnProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSlotFnProperty]
  }
  
  @scala.inline
  implicit class DynamicSlotFnPropertyMutableBuilder[Self <: DynamicSlotFnProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SlotFunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
