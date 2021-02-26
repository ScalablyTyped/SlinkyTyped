package typingsSlinky.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tab {
  
  @js.native
  trait IBar extends IToolbar {
    
    /** [Config Option] (Number/String/Ext.Component) */
    var activeTab: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of activeTab
      * @returns Number/String/Ext.Component
      */
    var getActiveTab: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of activeTab
      * @param activeTab Number/String/Ext.Component The new value.
      */
    var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IBar {
    
    @scala.inline
    def apply(): IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBar]
    }
    
    @scala.inline
    implicit class IBarMutableBuilder[Self <: IBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: js.Any): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setGetActiveTab(value: () => _): Self = StObject.set(x, "getActiveTab", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveTabUndefined: Self = StObject.set(x, "getActiveTab", js.undefined)
      
      @scala.inline
      def setSetActiveTab(value: /* activeTab */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
    }
  }
  
  @js.native
  trait IPanel extends IContainer {
    
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
    var getCls_IPanel: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
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
    var setCls_IPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
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
  object IPanel {
    
    @scala.inline
    def apply(): typingsSlinky.senchaTouch.Ext.tab.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.senchaTouch.Ext.tab.IPanel]
    }
    
    @scala.inline
    implicit class IPanelMutableBuilder[Self <: typingsSlinky.senchaTouch.Ext.tab.IPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoTabChange(value: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "doTabChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoTabChangeUndefined: Self = StObject.set(x, "doTabChange", js.undefined)
      
      @scala.inline
      def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
      
      @scala.inline
      def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      @scala.inline
      def setGetTabBar(value: () => _): Self = StObject.set(x, "getTabBar", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTabBarPosition(value: () => java.lang.String): Self = StObject.set(x, "getTabBarPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTabBarPositionUndefined: Self = StObject.set(x, "getTabBarPosition", js.undefined)
      
      @scala.inline
      def setGetTabBarUndefined: Self = StObject.set(x, "getTabBar", js.undefined)
      
      @scala.inline
      def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      @scala.inline
      def setSetTabBar(value: /* tabBar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTabBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTabBarPosition(value: /* tabBarPosition */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTabBarPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTabBarPositionUndefined: Self = StObject.set(x, "setTabBarPosition", js.undefined)
      
      @scala.inline
      def setSetTabBarUndefined: Self = StObject.set(x, "setTabBar", js.undefined)
      
      @scala.inline
      def setTabBar(value: js.Any): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarDock(value: Boolean): Self = StObject.set(x, "tabBarDock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarDockUndefined: Self = StObject.set(x, "tabBarDock", js.undefined)
      
      @scala.inline
      def setTabBarPosition(value: java.lang.String): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      @scala.inline
      def setTabBarUndefined: Self = StObject.set(x, "tabBar", js.undefined)
      
      @scala.inline
      def setUpdateUi(value: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateUi", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateUiUndefined: Self = StObject.set(x, "updateUi", js.undefined)
    }
  }
  
  @js.native
  trait ITab extends IButton {
    
    /** [Config Option] (Boolean) */
    var active: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Returns the value of active
      * @returns Boolean
      */
    var getActive: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of activeCls
      * @returns String
      */
    var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of title
      * @returns String
      */
    var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Sets the value of active
      * @param active Boolean The new value.
      */
    var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of activeCls
      * @param activeCls String The new value.
      */
    var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of title
      * @param title String The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.native
  }
  object ITab {
    
    @scala.inline
    def apply(): typingsSlinky.senchaTouch.Ext.tab.ITab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.senchaTouch.Ext.tab.ITab]
    }
    
    @scala.inline
    implicit class ITabMutableBuilder[Self <: typingsSlinky.senchaTouch.Ext.tab.ITab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveCls(value: () => java.lang.String): Self = StObject.set(x, "getActiveCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveClsUndefined: Self = StObject.set(x, "getActiveCls", js.undefined)
      
      @scala.inline
      def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
      
      @scala.inline
      def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      @scala.inline
      def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveCls(value: /* activeCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setActiveCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveClsUndefined: Self = StObject.set(x, "setActiveCls", js.undefined)
      
      @scala.inline
      def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
