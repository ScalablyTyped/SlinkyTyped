package typingsSlinky.storybookAddonKnobs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddonKnobs.objectMod.ObjectTypeProps
import typingsSlinky.storybookAddonKnobs.objectMod.default
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Object
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](knob: KnobControlConfig[T], onChange: T => T, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.storybookAddonKnobs.objectMod.default[js.Any]]]
  }
  type Props = ObjectTypeProps[js.Any]
}

