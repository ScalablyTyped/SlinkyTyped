package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeProps
import typingsSlinky.storybookAddonKnobs.typesMod.default.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Array {
  
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => ArrayTypeKnobValue): Default[tag.type, array] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, array](js.Array(this.component, __props.asInstanceOf[ArrayTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.array")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArrayTypeProps): Default[tag.type, array] = new Default[tag.type, array](js.Array(this.component, p.asInstanceOf[js.Any]))
}
