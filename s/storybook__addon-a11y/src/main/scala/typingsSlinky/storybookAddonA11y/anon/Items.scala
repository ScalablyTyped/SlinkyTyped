package typingsSlinky.storybookAddonA11y.anon

import slinky.core.facade.ReactElement
import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  var items: js.Array[Result] = js.native
  var label: ReactElement = js.native
  var panel: ReactElement = js.native
  var `type`: RuleType = js.native
}

object Items {
  @scala.inline
  def apply(items: js.Array[Result], label: ReactElement, panel: ReactElement, `type`: RuleType): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanel(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RuleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

