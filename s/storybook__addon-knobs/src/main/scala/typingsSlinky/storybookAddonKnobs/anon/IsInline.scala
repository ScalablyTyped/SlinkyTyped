package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnob
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInline extends StObject {
  
  var isInline: Validator[Boolean] = js.native
  
  var knob: Validator[CheckboxesTypeKnob] = js.native
  
  var onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]] = js.native
}
object IsInline {
  
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[CheckboxesTypeKnob],
    onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]
  ): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
  
  @scala.inline
  implicit class IsInlineMutableBuilder[Self <: IsInline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsInline(value: Validator[Boolean]): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnob(value: Validator[CheckboxesTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
