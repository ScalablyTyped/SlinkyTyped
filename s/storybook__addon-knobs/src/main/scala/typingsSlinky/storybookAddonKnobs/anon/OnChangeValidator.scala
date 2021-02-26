package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeValidator extends StObject {
  
  var knob: Validator[KnobControlConfig[_]] = js.native
  
  var onChange: Validator[js.Function1[/* value */ _, _]] = js.native
}
object OnChangeValidator {
  
  @scala.inline
  def apply(knob: Validator[KnobControlConfig[_]], onChange: Validator[js.Function1[/* value */ _, _]]): OnChangeValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeValidator]
  }
  
  @scala.inline
  implicit class OnChangeValidatorMutableBuilder[Self <: OnChangeValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[KnobControlConfig[_]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ _, _]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
