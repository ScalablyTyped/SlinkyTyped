package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnob
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnobValue
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeProps
import typingsSlinky.storybookAddonKnobs.numberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: NumberTypeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[NumberTypeProps]))
  }
}
