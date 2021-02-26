package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonKnobs.dateMod.DateTypeKnobValue
import typingsSlinky.storybookAddonKnobs.typesMod.default.date
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  @scala.inline
  def apply(knob: KnobControlConfig[DateTypeKnobValue], onChange: DateTypeKnobValue => DateTypeKnobValue): Default[tag.type, date] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, date](js.Array(this.component, __props.asInstanceOf[KnobControlProps[DateTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.date")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: KnobControlProps[DateTypeKnobValue]): Default[tag.type, date] = new Default[tag.type, date](js.Array(this.component, p.asInstanceOf[js.Any]))
}
