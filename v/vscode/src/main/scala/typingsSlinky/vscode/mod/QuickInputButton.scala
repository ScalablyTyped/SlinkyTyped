package typingsSlinky.vscode.mod

import typingsSlinky.vscode.AnonDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickInputButton extends js.Object {
  /**
  		 * Icon for the button.
  		 */
  val iconPath: Uri | AnonDark | ThemeIcon = js.native
  /**
  		 * An optional tooltip.
  		 */
  val tooltip: js.UndefOr[String] = js.native
}

object QuickInputButton {
  @scala.inline
  def apply(iconPath: Uri | AnonDark | ThemeIcon): QuickInputButton = {
    val __obj = js.Dynamic.literal(iconPath = iconPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInputButton]
  }
  @scala.inline
  implicit class QuickInputButtonOps[Self <: QuickInputButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconPath(value: Uri | AnonDark | ThemeIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

