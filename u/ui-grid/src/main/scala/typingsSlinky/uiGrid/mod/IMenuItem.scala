package typingsSlinky.uiGrid.mod

import typingsSlinky.angular.mod.IAngularEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuItem extends js.Object {
  /** the method to call when the menu is clicked */
  var action: js.UndefOr[js.Function1[/* $event */ IAngularEvent, Unit]] = js.native
  /** a function to evaluate to determine whether or not the item is currently selected */
  var active: js.UndefOr[js.Function0[Boolean]] = js.native
  /** context to pass to the action function, available in this.context in your handler */
  var context: js.UndefOr[js.Any] = js.native
  /** the icon shown alongside that title */
  var icon: js.UndefOr[String] = js.native
  /** if set to true, the menu should stay open after the action, defaults to false */
  var leaveOpen: js.UndefOr[Boolean] = js.native
  /** a function to evaluate to determine whether or not to show the item */
  var shown: js.UndefOr[js.Function0[Boolean]] = js.native
  /** controls the title that is displayed in the menu */
  var title: js.UndefOr[String] = js.native
}

object IMenuItem {
  @scala.inline
  def apply(): IMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItem]
  }
  @scala.inline
  implicit class IMenuItemOps[Self <: IMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: /* $event */ IAngularEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withShown(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

