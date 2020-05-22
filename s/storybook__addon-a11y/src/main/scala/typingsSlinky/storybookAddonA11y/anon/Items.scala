package typingsSlinky.storybookAddonA11y.anon

import slinky.core.facade.ReactElement
import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var items: js.Array[Result]
  var label: ReactElement
  var panel: ReactElement
  var `type`: RuleType
}

object Items {
  @scala.inline
  def apply(items: js.Array[Result], label: ReactElement, panel: ReactElement, `type`: RuleType): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

