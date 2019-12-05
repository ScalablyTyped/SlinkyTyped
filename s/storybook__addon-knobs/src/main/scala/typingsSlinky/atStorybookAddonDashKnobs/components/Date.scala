package typingsSlinky.atStorybookAddonDashKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesDateMod.DateTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesDateMod.DateTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesDateMod.default
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Date
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    knob: KnobControlConfig[DateTypeKnobValue],
    onChange: DateTypeKnobValue => DateTypeKnobValue,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DateTypeProps
}

