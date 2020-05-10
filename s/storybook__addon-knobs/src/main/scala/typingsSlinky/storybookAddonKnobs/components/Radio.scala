package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnob
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeProps
import typingsSlinky.storybookAddonKnobs.radioMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio {
  @JSImport("@storybook/addon-knobs/dist/components/types/Radio", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RadiosTypeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isInline: Boolean, knob: RadiosTypeKnob, onChange: RadiosTypeKnobValue => RadiosTypeKnobValue): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[RadiosTypeProps]))
  }
}

