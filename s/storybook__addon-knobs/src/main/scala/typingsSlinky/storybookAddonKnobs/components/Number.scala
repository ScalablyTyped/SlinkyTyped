package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnob
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnobValue
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeProps
import typingsSlinky.storybookAddonKnobs.typesMod.default.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  @scala.inline
  def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): Default[tag.type, number] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, number](js.Array(this.component, __props.asInstanceOf[NumberTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.number")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NumberTypeProps): Default[tag.type, number] = new Default[tag.type, number](js.Array(this.component, p.asInstanceOf[js.Any]))
}
