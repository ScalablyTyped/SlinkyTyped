package typingsSlinky.atStorybookAddonDashKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Number
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    knob: NumberTypeKnob,
    onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NumberTypeProps
}

