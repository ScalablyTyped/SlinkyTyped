package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.dateMod.DateTypeKnobValue
import typingsSlinky.storybookAddonKnobs.dateMod.default
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: KnobControlProps[DateTypeKnobValue]): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(knob: KnobControlConfig[DateTypeKnobValue], onChange: DateTypeKnobValue => DateTypeKnobValue): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[KnobControlProps[DateTypeKnobValue]]))
  }
}
