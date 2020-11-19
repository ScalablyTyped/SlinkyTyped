package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.textMod.TextTypeKnobValue
import typingsSlinky.storybookAddonKnobs.textMod.default
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: KnobControlProps[TextTypeKnobValue]): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(knob: KnobControlConfig[TextTypeKnobValue], onChange: TextTypeKnobValue => TextTypeKnobValue): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[KnobControlProps[TextTypeKnobValue]]))
  }
}
