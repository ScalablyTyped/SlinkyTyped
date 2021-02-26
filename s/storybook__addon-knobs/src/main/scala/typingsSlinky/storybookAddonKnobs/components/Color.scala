package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.colorMod.ColorTypeKnobValue
import typingsSlinky.storybookAddonKnobs.typesMod.default.color
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Color {
  
  @scala.inline
  def apply(knob: KnobControlConfig[ColorTypeKnobValue], onChange: ColorTypeKnobValue => ColorTypeKnobValue): Default[tag.type, color] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, color](js.Array(this.component, __props.asInstanceOf[KnobControlProps[ColorTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.color")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: KnobControlProps[ColorTypeKnobValue]): Default[tag.type, color] = new Default[tag.type, color](js.Array(this.component, p.asInstanceOf[js.Any]))
}
