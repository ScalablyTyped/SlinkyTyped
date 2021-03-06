package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnob
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @scala.inline
  def apply(knob: SelectTypeKnob[SelectTypeKnobValue], onChange: SelectTypeKnobValue => SelectTypeKnobValue): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
