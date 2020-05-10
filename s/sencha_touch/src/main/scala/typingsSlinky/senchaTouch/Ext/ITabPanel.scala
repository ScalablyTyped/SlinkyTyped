package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabPanel extends IContainer {
  /** [Method] Updates this container with the new active item
  		* @param tabBar Object
  		* @param newTab Object
  		* @returns Boolean
  		*/
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ITabPanel: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of tabBar
  		* @returns Object
  		*/
  var getTabBar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of tabBarPosition
  		* @returns String
  		*/
  var getTabBarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ITabPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of tabBar
  		* @param tabBar Object The new value.
  		*/
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of tabBarPosition
  		* @param tabBarPosition String The new value.
  		*/
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[java.lang.String] = js.native
  /** [Method] Updates the Ui for this component and the tabBar
  		* @param newUi Object
  		* @param oldUi Object
  		*/
  var updateUi: js.UndefOr[
    js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object ITabPanel {
  @scala.inline
  def apply(): ITabPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabPanel]
  }
  @scala.inline
  implicit class ITabPanelOps[Self <: ITabPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoTabChange(value: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTabChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoTabChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTabChange")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
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
    def withGetTabBar(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabBarPosition(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabBarPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTabBarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabBarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTabBar(value: /* tabBar */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTabBarPosition(value: /* tabBarPosition */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabBarPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTabBarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabBarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarDock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarDock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarDock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarDock")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarPosition(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUi(value: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUi")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUi")(js.undefined)
        ret
    }
  }
  
}

