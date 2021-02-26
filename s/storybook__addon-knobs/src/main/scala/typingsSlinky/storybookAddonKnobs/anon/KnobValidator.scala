package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnobValidator extends StObject {
  
  var knob: Validator[NumberTypeKnob] = js.native
  
  var onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]] = js.native
}
object KnobValidator {
  
  @scala.inline
  def apply(
    knob: Validator[NumberTypeKnob],
    onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
  ): KnobValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobValidator]
  }
  
  @scala.inline
  implicit class KnobValidatorMutableBuilder[Self <: KnobValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[NumberTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ Double | Null, Double | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
