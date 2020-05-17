package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[ButtonTypeProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[ButtonTypeProps]]))
  }
}

