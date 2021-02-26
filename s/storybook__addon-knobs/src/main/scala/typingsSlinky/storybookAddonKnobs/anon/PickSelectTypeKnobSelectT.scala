package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.std.PropertyKey
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.SelectTypeKnob<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>, 'value' | 'options'> & {  selectV2 :true} */
@js.native
trait PickSelectTypeKnobSelectT extends StObject {
  
  var options: SelectTypeOptionsProp[SelectTypeKnobValue] = js.native
  
  var selectV2: `true` = js.native
  
  var value: SelectTypeKnobValue = js.native
}
object PickSelectTypeKnobSelectT {
  
  @scala.inline
  def apply(options: SelectTypeOptionsProp[SelectTypeKnobValue], selectV2: `true`): PickSelectTypeKnobSelectT = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], selectV2 = selectV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSelectTypeKnobSelectT]
  }
  
  @scala.inline
  implicit class PickSelectTypeKnobSelectTMutableBuilder[Self <: PickSelectTypeKnobSelectT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: SelectTypeOptionsProp[SelectTypeKnobValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: SelectTypeKnobValue*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSelectV2(value: `true`): Self = StObject.set(x, "selectV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SelectTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: PropertyKey*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
