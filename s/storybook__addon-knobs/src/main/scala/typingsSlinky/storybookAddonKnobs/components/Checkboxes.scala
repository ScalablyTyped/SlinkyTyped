package typingsSlinky.storybookAddonKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnob
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue
import typingsSlinky.storybookAddonKnobs.checkboxesMod.CheckboxesTypeProps
import typingsSlinky.storybookAddonKnobs.checkboxesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkboxes
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isInline: Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckboxesTypeProps
}

