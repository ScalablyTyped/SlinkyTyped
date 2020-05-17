package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnob
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeProps
import typingsSlinky.storybookAddonKnobs.checkboxesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkboxes {
  @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CheckboxesTypeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    isInline: scala.Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[CheckboxesTypeProps]))
  }
}

