package typingsSlinky.storybookAddonKnobs.components

import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnob
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeProps
import typingsSlinky.storybookAddonKnobs.typesMod.default.radios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radios {
  
  @scala.inline
  def apply(
    isInline: scala.Boolean,
    knob: RadiosTypeKnob,
    onChange: RadiosTypeKnobValue => RadiosTypeKnobValue
  ): SharedBuilder_RadiosTypeProps113737180[radios] = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_RadiosTypeProps113737180[radios](js.Array(this.component, __props.asInstanceOf[RadiosTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.radios")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadiosTypeProps): SharedBuilder_RadiosTypeProps113737180[radios] = new SharedBuilder_RadiosTypeProps113737180[radios](js.Array(this.component, p.asInstanceOf[js.Any]))
}
