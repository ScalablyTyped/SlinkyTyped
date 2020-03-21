package typingsSlinky.storybookAddonKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddonKnobs.colorMod.ColorTypeKnobValue
import typingsSlinky.storybookAddonKnobs.colorMod.ColorTypeProps
import typingsSlinky.storybookAddonKnobs.colorMod.default
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Color
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    knob: KnobControlConfig[ColorTypeKnobValue],
    onChange: ColorTypeKnobValue => ColorTypeKnobValue,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColorTypeProps
}

