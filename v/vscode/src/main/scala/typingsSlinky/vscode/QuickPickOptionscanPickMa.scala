package typingsSlinky.vscode

import typingsSlinky.vscode.mod.QuickPickItem
import typingsSlinky.vscode.vscodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vscode.vscode.QuickPickOptions & {  canPickMany  :true} */
@js.native
trait QuickPickOptionscanPickMa extends js.Object {
  /**
  		 * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
  		 */
  var canPickMany: js.UndefOr[Boolean with `true`] = js.native
  /**
  		 * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional flag to include the description when filtering the picks.
  		 */
  var matchOnDescription: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional flag to include the detail when filtering the picks.
  		 */
  var matchOnDetail: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional function that is invoked whenever an item is selected.
  		 */
  var onDidSelectItem: js.UndefOr[js.Function1[/* item */ QuickPickItem | String, _]] = js.native
  /**
  		 * An optional string to show as placeholder in the input box to guide the user what to pick on.
  		 */
  var placeHolder: js.UndefOr[String] = js.native
}

object QuickPickOptionscanPickMa {
  @scala.inline
  def apply(): QuickPickOptionscanPickMa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickPickOptionscanPickMa]
  }
  @scala.inline
  implicit class QuickPickOptionscanPickMaOps[Self <: QuickPickOptionscanPickMa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanPickMany(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPickMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanPickMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPickMany")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFocusOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFocusOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchOnDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOnDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchOnDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOnDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchOnDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOnDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchOnDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOnDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidSelectItem(value: /* item */ QuickPickItem | String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidSelectItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidSelectItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidSelectItem")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
  }
  
}

