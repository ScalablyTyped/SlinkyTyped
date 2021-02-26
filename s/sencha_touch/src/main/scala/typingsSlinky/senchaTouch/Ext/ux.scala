package typingsSlinky.senchaTouch.Ext

import typingsSlinky.senchaTouch.Ext.ux.device.analytics.IAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ux {
  
  @js.native
  trait IActionOverFlowMenuButton extends IMenuButton {
    
    /** [Property] () */
    var menuItems: js.UndefOr[js.Any] = js.native
  }
  object IActionOverFlowMenuButton {
    
    @scala.inline
    def apply(): IActionOverFlowMenuButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionOverFlowMenuButton]
    }
    
    @scala.inline
    implicit class IActionOverFlowMenuButtonMutableBuilder[Self <: IActionOverFlowMenuButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuItems(value: js.Any): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  @js.native
  trait IApplicationMenu extends IMenu
  object IApplicationMenu {
    
    @scala.inline
    def apply(): IApplicationMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationMenu]
    }
  }
  
  type IContextMenu = IMenu
  
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
    implicit class IMenuButtonMutableBuilder[Self <: IMenuButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMenuItems(value: () => Array): Self = StObject.set(x, "getMenuItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMenuItemsUndefined: Self = StObject.set(x, "getMenuItems", js.undefined)
      
      @scala.inline
      def setSetMenuItems(value: /* menuItems */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setMenuItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMenuItemsUndefined: Self = StObject.set(x, "setMenuItems", js.undefined)
    }
  }
  
  @js.native
  trait ITabMenuButton extends IMenuButton {
    
    /** [Property] () */
    var menuItems: js.UndefOr[js.Any] = js.native
  }
  object ITabMenuButton {
    
    @scala.inline
    def apply(): ITabMenuButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabMenuButton]
    }
    
    @scala.inline
    implicit class ITabMenuButtonMutableBuilder[Self <: ITabMenuButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuItems(value: js.Any): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  object device {
    
    @js.native
    trait Analytics_ extends StObject
    
    @js.native
    trait IAnalytics extends IAbstract
    object IAnalytics {
      
      @scala.inline
      def apply(): IAnalytics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAnalytics]
      }
    }
    
    @js.native
    trait ITwitter
      extends typingsSlinky.senchaTouch.Ext.ux.device.twitter.IAbstract
    object ITwitter {
      
      @scala.inline
      def apply(): ITwitter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITwitter]
      }
    }
    
    @js.native
    trait Twitter_ extends StObject
    
    object analytics {
      
      @js.native
      trait IAbstract extends IBase {
        
        /** [Method] Returns the value of accountID
          * @returns Object
          */
        var getAccountID: js.UndefOr[js.Function0[_]] = js.native
        
        /** [Method] Registers yur Google Analytics account
          * @param accountID String Your Google Analytics account ID
          */
        var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[java.lang.String], Unit]] = js.native
        
        /** [Method] Sets the value of accountID
          * @param accountID Object The new value.
          */
        var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[js.Any], Unit]] = js.native
        
        /** [Method] Track an event in your application
          * @param config Object
          */
        var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
        
        /** [Method] Track an pageview in your application
          * @param config String The page you want to track (must start with a slash).
          */
        var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[java.lang.String], Unit]] = js.native
      }
      object IAbstract {
        
        @scala.inline
        def apply(): IAbstract = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IAbstract]
        }
        
        @scala.inline
        implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGetAccountID(value: () => _): Self = StObject.set(x, "getAccountID", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGetAccountIDUndefined: Self = StObject.set(x, "getAccountID", js.undefined)
          
          @scala.inline
          def setRegisterAccount(value: /* accountID */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "registerAccount", js.Any.fromFunction1(value))
          
          @scala.inline
          def setRegisterAccountUndefined: Self = StObject.set(x, "registerAccount", js.undefined)
          
          @scala.inline
          def setSetAccountID(value: /* accountID */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAccountID", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSetAccountIDUndefined: Self = StObject.set(x, "setAccountID", js.undefined)
          
          @scala.inline
          def setTrackEvent(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "trackEvent", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTrackEventUndefined: Self = StObject.set(x, "trackEvent", js.undefined)
          
          @scala.inline
          def setTrackPageview(value: /* config */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "trackPageview", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTrackPageviewUndefined: Self = StObject.set(x, "trackPageview", js.undefined)
        }
      }
      
      @js.native
      trait ICordova extends IAbstract {
        
        /** [Method] Track an pageview in your application
          * @param page Object
          */
        @JSName("trackPageview")
        var trackPageview_ICordova: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.native
      }
      object ICordova {
        
        @scala.inline
        def apply(): ICordova = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ICordova]
        }
        
        @scala.inline
        implicit class ICordovaMutableBuilder[Self <: ICordova] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setTrackPageview(value: /* page */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "trackPageview", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTrackPageviewUndefined: Self = StObject.set(x, "trackPageview", js.undefined)
        }
      }
    }
    
    object twitter {
      
      @js.native
      trait IAbstract extends IBase {
        
        /** [Method] Pops up a Twitter compose sheet view with your specified tweet
          * @param config Object An object which contains the following config options:
          */
        var compose: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
        
        /** [Method] Gets Tweets from Twitter Mentions
          * @param config Object An object which contains the following config options:
          */
        var getMentions: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
        
        /** [Method] Gets Tweets from Twitter Timeline
          * @param config Object An object which contains the following config options:
          */
        var getPublicTimeline: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
        
        /** [Method] Gets a specific Twitter user info
          * @param config Object An object which contains the following config options:
          */
        var getTwitterRequest: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
        
        /** [Method] Gets a specific Twitter user info
          * @param config Object An object which contains the following config options:
          */
        var getTwitterUsername: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
      }
      object IAbstract {
        
        @scala.inline
        def apply(): typingsSlinky.senchaTouch.Ext.ux.device.twitter.IAbstract = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsSlinky.senchaTouch.Ext.ux.device.twitter.IAbstract]
        }
        
        @scala.inline
        implicit class IAbstractMutableBuilder[Self <: typingsSlinky.senchaTouch.Ext.ux.device.twitter.IAbstract] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCompose(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
          
          @scala.inline
          def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
          
          @scala.inline
          def setGetMentions(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getMentions", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetMentionsUndefined: Self = StObject.set(x, "getMentions", js.undefined)
          
          @scala.inline
          def setGetPublicTimeline(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getPublicTimeline", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetPublicTimelineUndefined: Self = StObject.set(x, "getPublicTimeline", js.undefined)
          
          @scala.inline
          def setGetTwitterRequest(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getTwitterRequest", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetTwitterRequestUndefined: Self = StObject.set(x, "getTwitterRequest", js.undefined)
          
          @scala.inline
          def setGetTwitterUsername(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getTwitterUsername", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetTwitterUsernameUndefined: Self = StObject.set(x, "getTwitterUsername", js.undefined)
        }
      }
      
      type ICordova = IBase
    }
  }
}
