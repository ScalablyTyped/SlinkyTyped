package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
@js.native
trait PartialBooleanTypeProps extends js.Object {
  
  var knob: js.UndefOr[BooleanTypeKnob] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]] = js.native
}
object PartialBooleanTypeProps {
  
  @scala.inline
  def apply(): PartialBooleanTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBooleanTypeProps]
  }
  
  @scala.inline
  implicit class PartialBooleanTypePropsOps[Self <: PartialBooleanTypeProps] (val x: Self) extends AnyVal {
    
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
    def setKnob(value: BooleanTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ BooleanTypeKnobValue => BooleanTypeKnobValue): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
}
