package typingsSlinky.senchaTouch.Ext.ux

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuButton extends IButton {
  /** [Method] Returns the value of menuItems
  		* @returns Array
  		*/
  var getMenuItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sets the value of menuItems
  		* @param menuItems Array The new value.
  		*/
  var setMenuItems: js.UndefOr[js.Function1[/* menuItems */ js.UndefOr[Array], Unit]] = js.native
}

object IMenuButton {
  @scala.inline
  def apply(): IMenuButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuButton]
  }
  @scala.inline
  implicit class IMenuButtonOps[Self <: IMenuButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMenuItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMenuItems(value: /* menuItems */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMenuItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMenuItems")(js.undefined)
        ret
    }
  }
  
}

