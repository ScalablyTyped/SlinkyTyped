package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeValidator extends js.Object {
  
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
  implicit class OnChangeValidatorOps[Self <: OnChangeValidator] (val x: Self) extends AnyVal {
    
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
    def setKnob(value: Validator[KnobControlConfig[_]]): Self = this.set("knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ _, _]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
  }
}
