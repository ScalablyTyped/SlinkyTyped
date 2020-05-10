package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeProps
import typingsSlinky.storybookAddonKnobs.arrayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Array {
  @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ArrayTypeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => ArrayTypeKnobValue): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ArrayTypeProps]))
  }
}

