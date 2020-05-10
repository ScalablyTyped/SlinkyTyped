package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickPickItem extends js.Object {
  /**
  		 * Always show this item.
  		 */
  var alwaysShow: js.UndefOr[Boolean] = js.native
  /**
  		 * A human-readable string which is rendered less prominent in the same line. Supports rendering of
  		 * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
  		 */
  var description: js.UndefOr[String] = js.native
  /**
  		 * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
  		 * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
  		 */
  var detail: js.UndefOr[String] = js.native
  /**
  		 * A human-readable string which is rendered prominent. Supports rendering of [theme icons](#ThemeIcon) via
  		 * the `$(<name>)`-syntax.
  		 */
  var label: String = js.native
  /**
  		 * Optional flag indicating if this item is picked initially.
  		 * (Only honored when the picker allows multiple selections.)
  		 *
  		 * @see [QuickPickOptions.canPickMany](#QuickPickOptions.canPickMany)
  		 */
  var picked: js.UndefOr[Boolean] = js.native
}

object QuickPickItem {
  @scala.inline
  def apply(label: String): QuickPickItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickItem]
  }
  @scala.inline
  implicit class QuickPickItemOps[Self <: QuickPickItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShow")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withPicked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picked")(js.undefined)
        ret
    }
  }
  
}

