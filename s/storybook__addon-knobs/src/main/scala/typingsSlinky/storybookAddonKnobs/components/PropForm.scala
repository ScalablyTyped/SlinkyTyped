package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import typingsSlinky.storybookAddonKnobs.propFormMod.PropFormProps
import typingsSlinky.storybookAddonKnobs.propFormMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PropForm {
  
  @scala.inline
  def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Unit,
    onFieldClick: KnobStoreKnob => Unit
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction1(onFieldChange), onFieldClick = js.Any.fromFunction1(onFieldClick))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PropFormProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/PropForm", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropFormProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
