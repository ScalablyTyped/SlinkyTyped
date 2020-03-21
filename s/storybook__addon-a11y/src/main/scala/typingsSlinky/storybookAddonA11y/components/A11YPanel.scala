package typingsSlinky.storybookAddonA11y.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanelProps
import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object A11YPanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanel] {
  @JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "A11YPanel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(active: Boolean, api: API, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanel] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = A11YPanelProps
}

