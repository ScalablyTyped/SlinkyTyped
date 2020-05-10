package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButton extends IComponent {
  /** [Config Option] (String) */
  var autoEvent: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var badge: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var badgeCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var badgeText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of autoEvent
  		* @returns String
  		*/
  var getAutoEvent: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of badgeCls
  		* @returns String
  		*/
  var getBadgeCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of badgeText
  		* @returns String
  		*/
  var getBadgeText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of handler
  		* @returns Function
  		*/
  var getHandler: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of icon
  		* @returns String
  		*/
  var getIcon: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of iconAlign
  		* @returns String
  		*/
  var getIconAlign: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of iconCls
  		* @returns String
  		*/
  var getIconCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of labelCls
  		* @returns String
  		*/
  var getLabelCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of pressedDelay
  		* @returns Number/Boolean
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of text
  		* @returns String
  		*/
  var getText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  @JSName("html")
  var html_IButton: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number/Boolean) */
  var pressedDelay: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of autoEvent
  		* @param autoEvent String The new value.
  		*/
  var setAutoEvent: js.UndefOr[js.Function1[/* autoEvent */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Updates the badge text
  		* @param text String
  		*/
  var setBadge: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of badgeCls
  		* @param badgeCls String The new value.
  		*/
  var setBadgeCls: js.UndefOr[js.Function1[/* badgeCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of badgeText
  		* @param badgeText String The new value.
  		*/
  var setBadgeText: js.UndefOr[js.Function1[/* badgeText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of handler
  		* @param handler Function The new value.
  		*/
  var setHandler: js.UndefOr[js.Function1[/* handler */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of icon
  		* @param icon String The new value.
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of iconAlign
  		* @param iconAlign String The new value.
  		*/
  var setIconAlign: js.UndefOr[js.Function1[/* iconAlign */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Updates the icon class
  		* @param iconClass String
  		*/
  var setIconClass: js.UndefOr[js.Function1[/* iconClass */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of labelCls
  		* @param labelCls String The new value.
  		*/
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number/Boolean The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of text
  		* @param text String The new value.
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
}

object IButton {
  @scala.inline
  def apply(): IButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButton]
  }
  @scala.inline
  implicit class IButtonOps[Self <: IButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoEvent(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoEvent(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBadgeCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBadgeCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBadgeText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBadgeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHandler(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIcon(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIconAlign(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconAlign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIconAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIconCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressedCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressedDelay(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedDelay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressedDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.undefined)
        ret
    }
    @scala.inline
    def withGetText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: java.lang.String): Self = {
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
    def withIconAlign(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedDelay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoEvent(value: /* autoEvent */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBadge(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBadgeCls(value: /* badgeCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBadgeCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBadgeText(value: /* badgeText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBadgeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHandler(value: /* handler */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconAlign(value: /* iconAlign */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconAlign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconClass(value: /* iconClass */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelCls(value: /* labelCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressedDelay(value: /* pressedDelay */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressedDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

