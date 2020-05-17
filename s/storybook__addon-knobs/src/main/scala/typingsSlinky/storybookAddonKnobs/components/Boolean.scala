package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Boolean {
  @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[BooleanTypeProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => BooleanTypeKnobValue): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[BooleanTypeProps]]))
  }
}

