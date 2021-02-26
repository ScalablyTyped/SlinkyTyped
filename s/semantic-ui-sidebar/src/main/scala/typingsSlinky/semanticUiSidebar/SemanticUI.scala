package typingsSlinky.semanticUiSidebar

import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings.Param
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImplBottom
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImplComputer
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImplFixed
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImplIos
import typingsSlinky.semanticUiSidebar.anon.PartialPickImplkeyofImplMethod
import typingsSlinky.semanticUiSidebar.anon.PickImplactive
import typingsSlinky.semanticUiSidebar.anon.PickImplanimating
import typingsSlinky.semanticUiSidebar.anon.PickImplbottom
import typingsSlinky.semanticUiSidebar.anon.PickImplclassName
import typingsSlinky.semanticUiSidebar.anon.PickImplclosable
import typingsSlinky.semanticUiSidebar.anon.PickImplcomputer
import typingsSlinky.semanticUiSidebar.anon.PickImplcontext
import typingsSlinky.semanticUiSidebar.anon.PickImpldebug
import typingsSlinky.semanticUiSidebar.anon.PickImpldefaultTransition
import typingsSlinky.semanticUiSidebar.anon.PickImpldelaySetup
import typingsSlinky.semanticUiSidebar.anon.PickImpldimPage
import typingsSlinky.semanticUiSidebar.anon.PickImpldimmed
import typingsSlinky.semanticUiSidebar.anon.PickImplduration
import typingsSlinky.semanticUiSidebar.anon.PickImpleasing
import typingsSlinky.semanticUiSidebar.anon.PickImplerror
import typingsSlinky.semanticUiSidebar.anon.PickImplexclusive
import typingsSlinky.semanticUiSidebar.anon.PickImplfixed
import typingsSlinky.semanticUiSidebar.anon.PickImplios
import typingsSlinky.semanticUiSidebar.anon.PickImpliosIos
import typingsSlinky.semanticUiSidebar.anon.PickImplleft
import typingsSlinky.semanticUiSidebar.anon.PickImplmethod
import typingsSlinky.semanticUiSidebar.anon.PickImplmobile
import typingsSlinky.semanticUiSidebar.anon.PickImplmobileMobile
import typingsSlinky.semanticUiSidebar.anon.PickImplmobileTransition
import typingsSlinky.semanticUiSidebar.anon.PickImplmovedSidebar
import typingsSlinky.semanticUiSidebar.anon.PickImplname
import typingsSlinky.semanticUiSidebar.anon.PickImplnamespace
import typingsSlinky.semanticUiSidebar.anon.PickImplnotFound
import typingsSlinky.semanticUiSidebar.anon.PickImplomitted
import typingsSlinky.semanticUiSidebar.anon.PickImplonChange
import typingsSlinky.semanticUiSidebar.anon.PickImplonHidden
import typingsSlinky.semanticUiSidebar.anon.PickImplonHide
import typingsSlinky.semanticUiSidebar.anon.PickImplonShow
import typingsSlinky.semanticUiSidebar.anon.PickImplonVisible
import typingsSlinky.semanticUiSidebar.anon.PickImploverlay
import typingsSlinky.semanticUiSidebar.anon.PickImplperformance
import typingsSlinky.semanticUiSidebar.anon.PickImplpushable
import typingsSlinky.semanticUiSidebar.anon.PickImplpushed
import typingsSlinky.semanticUiSidebar.anon.PickImplpusher
import typingsSlinky.semanticUiSidebar.anon.PickImplregExp
import typingsSlinky.semanticUiSidebar.anon.PickImplreturnScroll
import typingsSlinky.semanticUiSidebar.anon.PickImplright
import typingsSlinky.semanticUiSidebar.anon.PickImplscrollLock
import typingsSlinky.semanticUiSidebar.anon.PickImplselector
import typingsSlinky.semanticUiSidebar.anon.PickImplsidebar
import typingsSlinky.semanticUiSidebar.anon.PickImplsilent
import typingsSlinky.semanticUiSidebar.anon.PickImpltop
import typingsSlinky.semanticUiSidebar.anon.PickImpltransition
import typingsSlinky.semanticUiSidebar.anon.PickImpluseLegacy
import typingsSlinky.semanticUiSidebar.anon.PickImplverbose
import typingsSlinky.semanticUiSidebar.anon.PickImplvisible
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.auto
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.className
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.closable
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.context
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.debug
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.defaultTransition
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.delaySetup
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.dimPage
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.duration
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.easing
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.error
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.exclusive
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.hide
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.mobileTransition
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.name
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.namespace
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onChange
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onHidden
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onHide
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onShow
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onVisible
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.performance
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.regExp
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.returnScroll
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.scrollLock
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.selector
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.setting
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.show
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.silent
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.toggle
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.transition
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.useLegacy
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Sidebar extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Adds stylesheet to page head to trigger sidebar animations
      */
    def apply(behavior: `add body CSS`): JQuery = js.native
    /**
      * Attaches sidebar action to given selector. Default event if none specified is toggle
      */
    def apply(behavior: `attach events`, selector: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
    /**
      * Returns direction of current sidebar
      */
    def apply(behavior: `get direction`): String = js.native
    /**
      * Returns vendor prefixed transition end event
      */
    def apply(behavior: `get transition event`): String = js.native
    /**
      * Returns whether sidebar is hidden
      */
    def apply(behavior: `is hidden`): Boolean = js.native
    /**
      * Returns whether sidebar is visible
      */
    def apply(behavior: `is visible`): Boolean = js.native
    /**
      * Returns page content to original position
      */
    def apply(behavior: `pull page`): JQuery = js.native
    /**
      * Pushes page content to be visible alongside sidebar
      */
    def apply(behavior: `push page`): JQuery = js.native
    /**
      * Removes any inline stylesheets for sidebar animation
      */
    def apply(behavior: `remove body CSS`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Hides sidebar
      */
    def apply(behavior: hide): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: defaultTransition, value: js.UndefOr[scala.Nothing]): DefaultTransitionSettings = js.native
    def apply(behavior: setting, name: delaySetup, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: delaySetup, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: dimPage, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: dimPage, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: easing, value: String): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: mobileTransition, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: mobileTransition, value: String): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
    def apply(behavior: setting, name: returnScroll, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: returnScroll, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: scrollLock, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: scrollLock, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: transition, value: String): JQuery = js.native
    def apply(behavior: setting, name: useLegacy, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
    def apply(behavior: setting, name: useLegacy, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: useLegacy, value: auto): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: SidebarSettings): JQuery = js.native
    /**
      * Shows sidebar
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Toggles visibility of sidebar
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: SidebarSettings): JQuery = js.native
    
    var settings: SidebarSettings = js.native
  }
  object Sidebar {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'animating'
          */
        var animating: String = js.native
        
        /**
          * @default 'bottom'
          */
        var bottom: String = js.native
        
        /**
          * @default 'dimmed'
          */
        var dimmed: String = js.native
        
        /**
          * @default 'ios'
          */
        var ios: String = js.native
        
        /**
          * @default 'left'
          */
        var left: String = js.native
        
        /**
          * @default 'pushable'
          */
        var pushable: String = js.native
        
        /**
          * @default 'pushed'
          */
        var pushed: String = js.native
        
        /**
          * @default 'right'
          */
        var right: String = js.native
        
        /**
          * @default 'top'
          */
        var top: String = js.native
        
        /**
          * @default 'visible'
          */
        var visible: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          active: String,
          animating: String,
          bottom: String,
          dimmed: String,
          ios: String,
          left: String,
          pushable: String,
          pushed: String,
          right: String,
          top: String,
          visible: String
        ): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pushable = pushable.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPushable(value: String): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPushed(value: String): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImplanimating | PickImpldimmed | PickImplios | PickImplpushable | PickImplpushed | PickImplright | PickImpltop | PickImplleft | PickImplbottom | PickImplvisible) with PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    object DefaultTransitionSettings {
      
      object ComputerSettings {
        
        @js.native
        trait Impl extends StObject {
          
          /**
            * @default 'overlay'
            */
          var bottom: String = js.native
          
          /**
            * @default 'uncover'
            */
          var left: String = js.native
          
          /**
            * @default 'uncover'
            */
          var right: String = js.native
          
          /**
            * @default 'overlay'
            */
          var top: String = js.native
        }
        object Impl {
          
          @scala.inline
          def apply(bottom: String, left: String, right: String, top: String): typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Impl = {
            val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
            __obj.asInstanceOf[typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Impl]
          }
          
          @scala.inline
          implicit class ImplMutableBuilder[Self <: typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Impl] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
          }
        }
        
        type Param = (PickImplleft | PickImplright | PickImpltop | PickImplbottom) with PartialPickImplkeyofImplBottom
      }
      type ComputerSettings = typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
      
      @js.native
      trait Impl extends StObject {
        
        var computer: ComputerSettings = js.native
        
        var mobile: MobileSettings = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(computer: ComputerSettings, mobile: MobileSettings): Impl = {
          val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMobile(value: MobileSettings): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
        }
      }
      
      object MobileSettings {
        
        @js.native
        trait Impl extends StObject {
          
          /**
            * @default 'overlay'
            */
          var bottom: String = js.native
          
          /**
            * @default 'uncover'
            */
          var left: String = js.native
          
          /**
            * @default 'uncover'
            */
          var right: String = js.native
          
          /**
            * @default 'overlay'
            */
          var top: String = js.native
        }
        object Impl {
          
          @scala.inline
          def apply(bottom: String, left: String, right: String, top: String): typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Impl = {
            val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
            __obj.asInstanceOf[typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Impl]
          }
          
          @scala.inline
          implicit class ImplMutableBuilder[Self <: typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Impl] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
          }
        }
        
        type Param = (PickImplleft | PickImplright | PickImpltop | PickImplbottom) with PartialPickImplkeyofImplBottom
      }
      type MobileSettings = typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param
      
      type Param = (PickImplcomputer | PickImplmobile) with PartialPickImplkeyofImplComputer
    }
    type DefaultTransitionSettings = typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
        
        /**
          * @default 'Had to move sidebar. For optimal performance make sure sidebar and pusher are direct children of your body tag'
          */
        var movedSidebar: String = js.native
        
        /**
          * @default 'There were no elements that matched the specified selector'
          */
        var notFound: String = js.native
        
        /**
          * @default 'The overlay setting is no longer supported, use animation: overlay'
          */
        var overlay: String = js.native
        
        /**
          * @default 'Had to add pusher element. For optimal performance make sure body content is inside a pusher element'
          */
        var pusher: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String, movedSidebar: String, notFound: String, overlay: String, pusher: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], movedSidebar = movedSidebar.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMovedSidebar(value: String): Self = StObject.set(x, "movedSidebar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplmethod | PickImplpusher | PickImplmovedSidebar | PickImploverlay | PickImplnotFound) with PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings.Param
    
    object RegExpSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default /(iPad|iPhone|iPod)/g
          */
        var ios: js.RegExp = js.native
        
        /**
          * @default /Mobile|iP(hone|od|ad)|Android|BlackBerry|IEMobile|Kindle|NetFront|Silk-Accelerated|(hpw|web)OS|Fennec|Minimo|Opera M(obi|ini)|Blazer|Dolfin|Dolphin|Skyfire|Zune/g
          */
        var mobile: js.RegExp = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(ios: js.RegExp, mobile: js.RegExp): Impl = {
          val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIos(value: js.RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMobile(value: js.RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpliosIos | PickImplmobileMobile) with PartialPickImplkeyofImplIos
    }
    type RegExpSettings = typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings.Param
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.fixed'
          */
        var fixed: String = js.native
        
        /**
          * @default 'script, link, style, .ui.modal, .ui.dimmer, .ui.nag, .ui.fixed'
          */
        var omitted: String = js.native
        
        /**
          * @default '.pusher'
          */
        var pusher: String = js.native
        
        /**
          * @default '.ui.sidebar'
          */
        var sidebar: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(fixed: String, omitted: String, pusher: String, sidebar: String): Impl = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], omitted = omitted.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOmitted(value: String): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplfixed | PickImplomitted | PickImplpusher | PickImplsidebar) with PartialPickImplkeyofImplFixed
    }
    type SelectorSettings = typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings.Param
  }
  
  object SidebarSettings {
    
    @js.native
    trait Impl extends StObject {
      
      // endregion
      // region DOM Settings
      var className: ClassNameSettings = js.native
      
      /**
        * Whether sidebar can be closed by clicking on page
        *
        * @default true
        */
      var closable: Boolean = js.native
      
      // region Behavior
      /**
        * Context which sidebar will appear inside
        *
        * @default 'body'
        */
      var context: String | JQuery = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * Default transitions for each direction and screen size, used with transition: auto
        */
      var defaultTransition: DefaultTransitionSettings = js.native
      
      /**
        * When sidebar is initialized without the proper HTML, using this option will defer creation of DOM to use requestAnimationFrame.
        *
        * @default false
        */
      var delaySetup: Boolean = js.native
      
      /**
        * Whether to dim page contents when sidebar is visible
        *
        * @default true
        */
      var dimPage: Boolean = js.native
      
      /**
        * Duration of sidebar animation when using legacy Javascript animation
        *
        * @default 500
        */
      var duration: Double = js.native
      
      /**
        * Easing to use when using legacy Javascript animation
        *
        * @default 'easeInOutQuint'
        */
      var easing: String = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Whether multiple sidebars can be open at once
        *
        * @default false
        */
      var exclusive: Boolean = js.native
      
      /**
        * Named transition to use when animating when detecting mobile device. Defaults to 'auto' which selects transition from defaultTransition based on direction.
        *
        * @default 'auto'
        */
      var mobileTransition: String = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      /**
        * Is called when a sidebar begins to hide or show
        */
      def onChange(): Unit = js.native
      
      /**
        * Is called after a sidebar has finished animating out.
        */
      def onHidden(): Unit = js.native
      
      /**
        * Is called before a sidebar begins to animate out.
        */
      def onHide(): Unit = js.native
      
      /**
        * Is called when a sidebar has finished animating in.
        */
      def onShow(): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Is called when a sidebar begins animating in.
        */
      def onVisible(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      var regExp: RegExpSettings = js.native
      
      /**
        * Whether to return to original scroll position when sidebar is hidden, automatically occurs with transition: scale
        *
        * @default false
        */
      var returnScroll: Boolean = js.native
      
      /**
        * Whether to lock page scroll when sidebar is visible
        *
        * @default false
        */
      var scrollLock: Boolean = js.native
      
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      // endregion
      // region Animation
      /**
        * Named transition to use when animating sidebar. Defaults to 'auto' which selects transition from defaultTransition based on direction.
        *
        * @default 'auto'
        */
      var transition: String = js.native
      
      /**
        * Whether Javascript animations should be used. Defaults to false. Setting to auto will use legacy animations only for browsers that do not support CSS transforms
        *
        * @default false
        */
      var useLegacy: auto | Boolean = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        className: ClassNameSettings,
        closable: Boolean,
        context: String | JQuery,
        debug: Boolean,
        defaultTransition: DefaultTransitionSettings,
        delaySetup: Boolean,
        dimPage: Boolean,
        duration: Double,
        easing: String,
        error: ErrorSettings,
        exclusive: Boolean,
        mobileTransition: String,
        name: String,
        namespace: String,
        onChange: () => Unit,
        onHidden: () => Unit,
        onHide: () => Unit,
        onShow: () => Unit,
        onVisible: () => Unit,
        performance: Boolean,
        regExp: RegExpSettings,
        returnScroll: Boolean,
        scrollLock: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        transition: String,
        useLegacy: auto | Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultTransition = defaultTransition.asInstanceOf[js.Any], delaySetup = delaySetup.asInstanceOf[js.Any], dimPage = dimPage.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], mobileTransition = mobileTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHidden = js.Any.fromFunction0(onHidden), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), onVisible = js.Any.fromFunction0(onVisible), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], returnScroll = returnScroll.asInstanceOf[js.Any], scrollLock = scrollLock.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLegacy = useLegacy.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultTransition(value: DefaultTransitionSettings): Self = StObject.set(x, "defaultTransition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelaySetup(value: Boolean): Self = StObject.set(x, "delaySetup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimPage(value: Boolean): Self = StObject.set(x, "dimPage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMobileTransition(value: String): Self = StObject.set(x, "mobileTransition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnHidden(value: () => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnVisible(value: () => Unit): Self = StObject.set(x, "onVisible", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnScroll(value: Boolean): Self = StObject.set(x, "returnScroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseLegacy(value: auto | Boolean): Self = StObject.set(x, "useLegacy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplcontext | PickImplexclusive | PickImplclosable | PickImpldimPage | PickImplscrollLock | PickImplreturnScroll | PickImpldelaySetup | PickImpltransition | PickImplmobileTransition | PickImpldefaultTransition | PickImpluseLegacy | PickImplduration | PickImpleasing | PickImplonVisible | PickImplonShow | PickImplonChange | PickImplonHide | PickImplonHidden | PickImplclassName | PickImplregExp | PickImplselector | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/sidebar.html#/settings}
    */
  type SidebarSettings = typingsSlinky.semanticUiSidebar.SemanticUI.SidebarSettings.Param
}
