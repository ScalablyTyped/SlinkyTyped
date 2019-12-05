package typingsSlinky.atStorybookAddonDashA11y.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType
import typingsSlinky.atStorybookAddonDashA11y.distComponentsReportItemMod.ItemProps
import typingsSlinky.axeDashCore.axeDashCoreMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atStorybookAddonDashA11y.distComponentsReportItemMod.Item] {
  @JSImport("@storybook/addon-a11y/dist/components/Report/Item", "Item")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(item: Result, `type`: RuleType, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atStorybookAddonDashA11y.distComponentsReportItemMod.Item] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ItemProps
}

