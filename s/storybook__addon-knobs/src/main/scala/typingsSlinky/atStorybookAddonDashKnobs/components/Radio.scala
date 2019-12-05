package typingsSlinky.atStorybookAddonDashKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.RadiosTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.RadiosTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.RadiosTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Radio", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isInline: Boolean,
    knob: RadiosTypeKnob,
    onChange: RadiosTypeKnobValue => RadiosTypeKnobValue,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RadiosTypeProps
}

