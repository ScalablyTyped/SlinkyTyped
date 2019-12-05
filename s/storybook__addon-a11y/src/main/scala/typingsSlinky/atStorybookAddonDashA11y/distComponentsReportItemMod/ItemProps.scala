package typingsSlinky.atStorybookAddonDashA11y.distComponentsReportItemMod

import typingsSlinky.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType
import typingsSlinky.axeDashCore.axeDashCoreMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps extends js.Object {
  var item: Result
  var `type`: RuleType
}

object ItemProps {
  @scala.inline
  def apply(item: Result, `type`: RuleType): ItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

