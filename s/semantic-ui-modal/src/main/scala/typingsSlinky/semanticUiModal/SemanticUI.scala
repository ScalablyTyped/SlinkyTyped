package typingsSlinky.semanticUiModal

import typingsSlinky.semanticUiDimmer.SemanticUI.DimmerSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ClassNameSettings.Param
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typingsSlinky.semanticUiModal.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiModal.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiModal.anon.PartialPickImplkeyofImplApprove
import typingsSlinky.semanticUiModal.anon.PickImplactive
import typingsSlinky.semanticUiModal.anon.PickImplallowMultiple
import typingsSlinky.semanticUiModal.anon.PickImplapprove
import typingsSlinky.semanticUiModal.anon.PickImplautofocus
import typingsSlinky.semanticUiModal.anon.PickImplclassName
import typingsSlinky.semanticUiModal.anon.PickImplclosable
import typingsSlinky.semanticUiModal.anon.PickImplclose
import typingsSlinky.semanticUiModal.anon.PickImplcontext
import typingsSlinky.semanticUiModal.anon.PickImpldebug
import typingsSlinky.semanticUiModal.anon.PickImpldeny
import typingsSlinky.semanticUiModal.anon.PickImpldetachable
import typingsSlinky.semanticUiModal.anon.PickImpldimmerSettings
import typingsSlinky.semanticUiModal.anon.PickImplduration
import typingsSlinky.semanticUiModal.anon.PickImplerror
import typingsSlinky.semanticUiModal.anon.PickImplkeyboardShortcuts
import typingsSlinky.semanticUiModal.anon.PickImplname
import typingsSlinky.semanticUiModal.anon.PickImplnamespace
import typingsSlinky.semanticUiModal.anon.PickImplobserveChanges
import typingsSlinky.semanticUiModal.anon.PickImploffset
import typingsSlinky.semanticUiModal.anon.PickImplonApprove
import typingsSlinky.semanticUiModal.anon.PickImplonDeny
import typingsSlinky.semanticUiModal.anon.PickImplonHidden
import typingsSlinky.semanticUiModal.anon.PickImplonHide
import typingsSlinky.semanticUiModal.anon.PickImplonShow
import typingsSlinky.semanticUiModal.anon.PickImplonVisible
import typingsSlinky.semanticUiModal.anon.PickImplperformance
import typingsSlinky.semanticUiModal.anon.PickImplqueue
import typingsSlinky.semanticUiModal.anon.PickImplscrolling
import typingsSlinky.semanticUiModal.anon.PickImplselector
import typingsSlinky.semanticUiModal.anon.PickImplsilent
import typingsSlinky.semanticUiModal.anon.PickImpltransition
import typingsSlinky.semanticUiModal.anon.PickImplverbose
import typingsSlinky.semanticUiModal.semanticUiModalBooleans.`false`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`attach events`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`can fit`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`hide all`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`hide others`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`is active`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`set active`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.allowMultiple
import typingsSlinky.semanticUiModal.semanticUiModalStrings.autofocus
import typingsSlinky.semanticUiModal.semanticUiModalStrings.className
import typingsSlinky.semanticUiModal.semanticUiModalStrings.closable
import typingsSlinky.semanticUiModal.semanticUiModalStrings.context
import typingsSlinky.semanticUiModal.semanticUiModalStrings.debug
import typingsSlinky.semanticUiModal.semanticUiModalStrings.destroy
import typingsSlinky.semanticUiModal.semanticUiModalStrings.detachable
import typingsSlinky.semanticUiModal.semanticUiModalStrings.dimmerSettings
import typingsSlinky.semanticUiModal.semanticUiModalStrings.duration
import typingsSlinky.semanticUiModal.semanticUiModalStrings.error
import typingsSlinky.semanticUiModal.semanticUiModalStrings.hide
import typingsSlinky.semanticUiModal.semanticUiModalStrings.keyboardShortcuts
import typingsSlinky.semanticUiModal.semanticUiModalStrings.name
import typingsSlinky.semanticUiModal.semanticUiModalStrings.namespace
import typingsSlinky.semanticUiModal.semanticUiModalStrings.observeChanges
import typingsSlinky.semanticUiModal.semanticUiModalStrings.offset
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onApprove
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onDeny
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onHidden
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onHide
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onShow
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onVisible
import typingsSlinky.semanticUiModal.semanticUiModalStrings.performance
import typingsSlinky.semanticUiModal.semanticUiModalStrings.queue
import typingsSlinky.semanticUiModal.semanticUiModalStrings.refresh
import typingsSlinky.semanticUiModal.semanticUiModalStrings.selector
import typingsSlinky.semanticUiModal.semanticUiModalStrings.setting
import typingsSlinky.semanticUiModal.semanticUiModalStrings.show
import typingsSlinky.semanticUiModal.semanticUiModalStrings.silent
import typingsSlinky.semanticUiModal.semanticUiModalStrings.toggle
import typingsSlinky.semanticUiModal.semanticUiModalStrings.transition
import typingsSlinky.semanticUiModal.semanticUiModalStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Modal extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: `attach events`, selector: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
    /**
      * Caches current modal size
      */
    def apply(behavior: `cache sizes`): JQuery = js.native
    /**
      * Returns whether the modal can fit on the page
      */
    def apply(behavior: `can fit`): Boolean = js.native
    /**
      * Hides all visible modals in the same dimmer
      */
    def apply(behavior: `hide all`): JQuery = js.native
    /**
      * Hides associated page dimmer
      */
    def apply(behavior: `hide dimmer`): JQuery = js.native
    /**
      * Hides all modals not selected modal in a dimmer
      */
    def apply(behavior: `hide others`): JQuery = js.native
    /**
      * Returns whether the modal is active
      */
    def apply(behavior: `is active`): Boolean = js.native
    /**
      * Sets modal to active
      */
    def apply(behavior: `set active`): JQuery = js.native
    /**
      * Shows associated page dimmer
      */
    def apply(behavior: `show dimmer`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Hides the modal
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Refreshes centering of modal on page
      */
    def apply(behavior: refresh): JQuery = js.native
    def apply(behavior: setting, name: allowMultiple, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: allowMultiple, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: autofocus, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: autofocus, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: detachable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: dimmerSettings, value: DimmerSettings): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: keyboardShortcuts, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
    def apply(behavior: setting, name: onApprove, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onApprove,
      value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onDeny, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onDeny,
      value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onHide,
      value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: queue, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: queue, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: transition, value: String): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: ModalSettings): JQuery = js.native
    /**
      * Shows the modal
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Toggles the modal
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: ModalSettings): JQuery = js.native
    
    var settings: ModalSettings = js.native
  }
  object Modal {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'scrolling'
          */
        var scrolling: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(active: String, scrolling: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImplscrolling) with PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-modal.SemanticUI.Modal.ErrorSettings.Param */
    @js.native
    trait ErrorSettings extends StObject {
      
      var method: String with js.UndefOr[String] = js.native
    }
    object ErrorSettings {
      
      @scala.inline
      def apply(method: String with js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      @scala.inline
      implicit class ErrorSettingsMutableBuilder[Self <: ErrorSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var method: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(method: String with js.UndefOr[String]): typingsSlinky.semanticUiModal.SemanticUI.Modal.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsSlinky.semanticUiModal.SemanticUI.Modal.ErrorSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiModal.SemanticUI.Modal.ErrorSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.actions .positive, .actions .approve, .actions .ok'
          */
        var approve: String = js.native
        
        /**
          * @default '.close, .actions .button'
          */
        var close: String = js.native
        
        /**
          * @default '.actions .negative, .actions .deny, .actions .cancel'
          */
        var deny: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(approve: String, close: String, deny: String): Impl = {
          val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], deny = deny.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplclose | PickImplapprove | PickImpldeny) with PartialPickImplkeyofImplApprove
    }
    type SelectorSettings = typingsSlinky.semanticUiModal.SemanticUI.Modal.SelectorSettings.Param
  }
  
  object ModalSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * If set to true will not close other visible modals when opening a new one
        *
        * @default false
        */
      var allowMultiple: Boolean = js.native
      
      /**
        * When true, the first form input inside the modal will receive focus when shown. Set this to false to prevent this behavior.
        *
        * @default true
        */
      var autofocus: Boolean = js.native
      
      var className: ClassNameSettings = js.native
      
      /**
        * Setting to false will not allow you to close the modal by clicking on the dimmer
        *
        * @default true
        */
      var closable: Boolean = js.native
      
      /**
        * Selector or jquery object specifying the area to dim
        *
        * @default 'body'
        */
      var context: String | JQuery = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      // region Modal Settings
      /**
        * If set to false will prevent the modal from being moved to inside the dimmer
        *
        * @default true
        */
      var detachable: Boolean = js.native
      
      /**
        * You can specify custom settings to extend UI dimmer
        *
        * @see {@link http://semantic-ui.com/modules/dimmer.html}
        */
      var dimmerSettings: DimmerSettings = js.native
      
      /**
        * Duration of animation
        *
        * @default 400
        */
      var duration: Double = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Whether to automatically bind keyboard shortcuts
        *
        * @default true
        */
      var keyboardShortcuts: Boolean = js.native
      
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
        * Whether any change in modal DOM should automatically refresh cached positions
        *
        * @default false
        */
      var observeChanges: Boolean = js.native
      
      /**
        * A vertical offset to allow for content outside of modal, for example a close button, to be centered.
        *
        * @default 0
        */
      var offset: Double = js.native
      
      /**
        * Is called after a positive, approve or ok button is pressed. If the function returns false, the modal will not hide.
        */
      def onApprove($element: JQuery): `false` | Unit = js.native
      
      /**
        * Is called after a negative, deny or cancel button is pressed. If the function returns false the modal will not hide.
        */
      def onDeny($element: JQuery): `false` | Unit = js.native
      
      /**
        * Is called after a modal has finished hiding animation.
        */
      def onHidden(): Unit = js.native
      
      /**
        * Is called after a modal starts to hide. If the function returns false, the modal will not hide.
        */
      def onHide($element: JQuery): `false` | Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Is called when a modal starts to show.
        */
      def onShow(): Unit = js.native
      
      /**
        * Is called after a modal has finished showing animating.
        */
      def onVisible(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      /**
        * Whether additional animations should queue
        *
        * @default false
        */
      var queue: Boolean = js.native
      
      // endregion
      // region DOM Settings
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * Named transition to use when animating menu in and out, full list can be found in ui transitions docs.
        *
        * @default 'scale'
        * @see {@link http://semantic-ui.com/modules/transition.html}
        */
      var transition: String = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        allowMultiple: Boolean,
        autofocus: Boolean,
        className: ClassNameSettings,
        closable: Boolean,
        context: String | JQuery,
        debug: Boolean,
        detachable: Boolean,
        dimmerSettings: DimmerSettings,
        duration: Double,
        error: ErrorSettings,
        keyboardShortcuts: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        onApprove: JQuery => `false` | Unit,
        onDeny: JQuery => `false` | Unit,
        onHidden: () => Unit,
        onHide: JQuery => `false` | Unit,
        onShow: () => Unit,
        onVisible: () => Unit,
        performance: Boolean,
        queue: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        transition: String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], dimmerSettings = dimmerSettings.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onApprove = js.Any.fromFunction1(onApprove), onDeny = js.Any.fromFunction1(onDeny), onHidden = js.Any.fromFunction0(onHidden), onHide = js.Any.fromFunction1(onHide), onShow = js.Any.fromFunction0(onShow), onVisible = js.Any.fromFunction0(onVisible), performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimmerSettings(value: DimmerSettings): Self = StObject.set(x, "dimmerSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnApprove(value: JQuery => `false` | Unit): Self = StObject.set(x, "onApprove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDeny(value: JQuery => `false` | Unit): Self = StObject.set(x, "onDeny", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnHidden(value: () => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnHide(value: JQuery => `false` | Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnVisible(value: () => Unit): Self = StObject.set(x, "onVisible", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImpldetachable | PickImplautofocus | PickImplobserveChanges | PickImplallowMultiple | PickImplkeyboardShortcuts | PickImploffset | PickImplcontext | PickImplclosable | PickImpldimmerSettings | PickImpltransition | PickImplduration | PickImplqueue | PickImplonShow | PickImplonVisible | PickImplonHide | PickImplonHidden | PickImplonApprove | PickImplonDeny | PickImplselector | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/modal.html#/settings}
    */
  type ModalSettings = typingsSlinky.semanticUiModal.SemanticUI.ModalSettings.Param
}
