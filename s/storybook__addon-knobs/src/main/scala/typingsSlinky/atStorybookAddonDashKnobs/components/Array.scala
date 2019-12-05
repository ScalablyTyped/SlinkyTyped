package typingsSlinky.atStorybookAddonDashKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Array
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    knob: ArrayTypeKnob,
    onChange: ArrayTypeKnobValue => ArrayTypeKnobValue,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ArrayTypeProps
}

