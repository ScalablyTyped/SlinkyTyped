package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Options {
  @JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[OptionsTypeProps[js.Any]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[js.Any], onChange: js.Any => js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[OptionsTypeProps[js.Any]]]))
  }
}

