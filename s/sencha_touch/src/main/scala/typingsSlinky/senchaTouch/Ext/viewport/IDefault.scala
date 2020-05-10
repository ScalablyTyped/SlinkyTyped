package typingsSlinky.senchaTouch.Ext.viewport

import typingsSlinky.senchaTouch.Ext.IContainer
import typingsSlinky.senchaTouch.Ext.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefault extends IContainer {
  /** [Config Option] (Boolean) */
  var autoMaximize: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoMaximize
  		* @returns Boolean
  		*/
  var getAutoMaximize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current orientation
  		* @returns String portrait or landscape
  		*/
  var getOrientation: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of preventPanning
  		* @returns Boolean
  		*/
  var getPreventPanning: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of preventZooming
  		* @returns Boolean
  		*/
  var getPreventZooming: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useBodyElement
  		* @returns Boolean
  		*/
  var getUseBodyElement: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Retrieves the document height
  		* @returns Number height in pixels.
  		*/
  var getWindowHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Retrieves the document width
  		* @returns Number width in pixels.
  		*/
  var getWindowWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Hides all visible menus
  		* @param animation Object
  		*/
  var hideAllMenus: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Hides a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var hideMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Hides all menus except for the side specified
  		* @param side String Side(s) not to hide
  		* @param animation String Animation to hide with
  		*/
  var hideOtherMenus: js.UndefOr[
    js.Function2[/* side */ js.UndefOr[String], /* animation */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Property] (Boolean) */
  var isReady: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preventPanning: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preventZooming: js.UndefOr[Boolean] = js.native
  /** [Method] Removes a menu from a specified side
  		* @param side String The side to remove the menu from
  		*/
  var removeMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of autoMaximize
  		* @param autoMaximize Boolean The new value.
  		*/
  var setAutoMaximize: js.UndefOr[js.Function1[/* autoMaximize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a menu for a given side of the Viewport
  		* @param menu Ext.Menu The menu to assign to the viewport
  		* @param config Object The configuration for the menu.
  		*/
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the value of preventPanning
  		* @param preventPanning Boolean The new value.
  		*/
  var setPreventPanning: js.UndefOr[js.Function1[/* preventPanning */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of preventZooming
  		* @param preventZooming Boolean The new value.
  		*/
  var setPreventZooming: js.UndefOr[js.Function1[/* preventZooming */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useBodyElement
  		* @param useBodyElement Boolean The new value.
  		*/
  var setUseBodyElement: js.UndefOr[js.Function1[/* useBodyElement */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Shows a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var showMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Toggles the menu specified by side
  		* @param side String The side which the menu is placed.
  		*/
  var toggleMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
}

object IDefault {
  @scala.inline
  def apply(): IDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefault]
  }
  @scala.inline
  implicit class IDefaultOps[Self <: IDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMaximize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMaximize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoMaximize(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoMaximize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayout(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOrientation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreventPanning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventPanning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreventPanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventPanning")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreventZooming(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventZooming")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreventZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseBodyElement(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseBodyElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseBodyElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseBodyElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWindowHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWindowWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAllMenus(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAllMenus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHideAllMenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAllMenus")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMenu(value: /* side */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHideMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOtherMenus(value: (/* side */ js.UndefOr[String], /* animation */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOtherMenus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHideOtherMenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOtherMenus")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventPanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventPanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPanning")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMenu(value: /* side */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoMaximize(value: /* autoMaximize */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoMaximize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMenu(value: (/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPreventPanning(value: /* preventPanning */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventPanning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPreventPanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventPanning")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPreventZooming(value: /* preventZooming */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventZooming")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPreventZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseBodyElement(value: /* useBodyElement */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseBodyElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseBodyElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseBodyElement")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMenu(value: /* side */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShowMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleMenu(value: /* side */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMenu")(js.undefined)
        ret
    }
  }
  
}

