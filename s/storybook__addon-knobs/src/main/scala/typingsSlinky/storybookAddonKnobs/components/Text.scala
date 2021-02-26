package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.textMod.TextTypeKnobValue
import typingsSlinky.storybookAddonKnobs.typesMod.default.text
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @scala.inline
  def apply(knob: KnobControlConfig[TextTypeKnobValue], onChange: TextTypeKnobValue => TextTypeKnobValue): Default[tag.type, text] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, text](js.Array(this.component, __props.asInstanceOf[KnobControlProps[TextTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.text")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: KnobControlProps[TextTypeKnobValue]): Default[tag.type, text] = new Default[tag.type, text](js.Array(this.component, p.asInstanceOf[js.Any]))
}
