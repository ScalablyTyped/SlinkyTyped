package typingsSlinky.semanticUiSticky

import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings.Param
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typingsSlinky.semanticUiSticky.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiSticky.anon.PartialPickImplkeyofImplBottom
import typingsSlinky.semanticUiSticky.anon.PartialPickImplkeyofImplContainer
import typingsSlinky.semanticUiSticky.anon.PickImplbottom
import typingsSlinky.semanticUiSticky.anon.PickImplbottomOffset
import typingsSlinky.semanticUiSticky.anon.PickImplbound
import typingsSlinky.semanticUiSticky.anon.PickImplclassName
import typingsSlinky.semanticUiSticky.anon.PickImplcontainer
import typingsSlinky.semanticUiSticky.anon.PickImplcontext
import typingsSlinky.semanticUiSticky.anon.PickImpldebug
import typingsSlinky.semanticUiSticky.anon.PickImplelementSize
import typingsSlinky.semanticUiSticky.anon.PickImplerror
import typingsSlinky.semanticUiSticky.anon.PickImplfixed
import typingsSlinky.semanticUiSticky.anon.PickImplinvalidContext
import typingsSlinky.semanticUiSticky.anon.PickImpljitter
import typingsSlinky.semanticUiSticky.anon.PickImplmethod
import typingsSlinky.semanticUiSticky.anon.PickImplname
import typingsSlinky.semanticUiSticky.anon.PickImplnamespace
import typingsSlinky.semanticUiSticky.anon.PickImplobserveChanges
import typingsSlinky.semanticUiSticky.anon.PickImploffset
import typingsSlinky.semanticUiSticky.anon.PickImplonBottom
import typingsSlinky.semanticUiSticky.anon.PickImplonReposition
import typingsSlinky.semanticUiSticky.anon.PickImplonScroll
import typingsSlinky.semanticUiSticky.anon.PickImplonStick
import typingsSlinky.semanticUiSticky.anon.PickImplonTop
import typingsSlinky.semanticUiSticky.anon.PickImplonUnstick
import typingsSlinky.semanticUiSticky.anon.PickImplperformance
import typingsSlinky.semanticUiSticky.anon.PickImplpushing
import typingsSlinky.semanticUiSticky.anon.PickImplscrollContext
import typingsSlinky.semanticUiSticky.anon.PickImplsetSize
import typingsSlinky.semanticUiSticky.anon.PickImplsilent
import typingsSlinky.semanticUiSticky.anon.PickImplsupported
import typingsSlinky.semanticUiSticky.anon.PickImpltop
import typingsSlinky.semanticUiSticky.anon.PickImplverbose
import typingsSlinky.semanticUiSticky.anon.PickImplvisible
import typingsSlinky.semanticUiSticky.semanticUiStickyBooleans.`false`
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.bottomOffset
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.className
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.context
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.debug
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.destroy
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.error
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.jitter
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.name
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.namespace
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.observeChanges
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.offset
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onBottom
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onReposition
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onScroll
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onStick
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onTop
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onUnstick
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.performance
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.pushing
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.refresh
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.scrollContext
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.setSize
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.setting
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.silent
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Sticky extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * recalculates offsets
      */
    def apply(behavior: refresh): JQuery = js.native
    def apply(behavior: setting, name: bottomOffset, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: bottomOffset, value: Double): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: jitter, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: jitter, value: Double): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
    def apply(behavior: setting, name: onBottom, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onBottom, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onReposition, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onReposition, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onScroll, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onScroll, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onStick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onStick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onTop, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onTop, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onUnstick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onUnstick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: pushing, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: pushing, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: scrollContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: scrollContext, value: String): JQuery = js.native
    def apply(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: setSize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: setSize, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: StickySettings): JQuery = js.native
    def apply(settings: StickySettings): JQuery = js.native
    
    var settings: StickySettings = js.native
  }
  object Sticky {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'bottom'
          */
        var bottom: String = js.native
        
        /**
          * @default 'bound'
          */
        var bound: String = js.native
        
        /**
          * @default 'fixed'
          */
        var fixed: String = js.native
        
        /**
          * @default 'native'
          */
        var supported: String = js.native
        
        /**
          * @default 'top'
          */
        var top: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(bottom: String, bound: String, fixed: String, supported: String, top: String): Impl = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplbound | PickImplfixed | PickImplsupported | PickImpltop | PickImplbottom) with PartialPickImplkeyofImplBottom
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'Sticky element must be inside a relative container'
          */
        var container: String = js.native
        
        /**
          * @default 'Sticky element is larger than its container, cannot create sticky.'
          */
        var elementSize: String = js.native
        
        /**
          * @default 'Context specified does not exist'
          */
        var invalidContext: String = js.native
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
        
        /**
          * @default 'Element is hidden, you must call refresh after element becomes visible'
          */
        var visible: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(container: String, elementSize: String, invalidContext: String, method: String, visible: String): Impl = {
          val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], invalidContext = invalidContext.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setElementSize(value: String): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInvalidContext(value: String): Self = StObject.set(x, "invalidContext", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplcontainer | PickImplvisible | PickImplmethod | PickImplinvalidContext | PickImplelementSize) with PartialPickImplkeyofImplContainer
    }
    type ErrorSettings = typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ErrorSettings.Param
  }
  
  object StickySettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Offset in pixels from the bottom of the screen when fixing element to viewport
        *
        * @default 0
        */
      var bottomOffset: Double = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Context which sticky element should stick to
        *
        * @default false
        */
      var context: `false` | String | JQuery = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Sticky container height will only be set if the difference between heights of container and context is larger than this jitter value.
        *
        * @default 5
        */
      var jitter: Double = js.native
      
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
        * Whether any change in context DOM should automatically refresh cached sticky positions
        *
        * @default false
        */
      var observeChanges: Boolean = js.native
      
      /**
        * Offset in pixels from the top of the screen when fixing element to viewport
        *
        * @default 0
        */
      var offset: Double = js.native
      
      /**
        * Callback when element is bound to bottom of parent container
        */
      def onBottom(): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback when element is repositioned from layout change
        */
      def onReposition(): Unit = js.native
      
      /**
        * Callback when requestAnimationFrame fires from scroll handler.
        */
      def onScroll(): Unit = js.native
      
      /**
        * Callback when element is fixed to page
        */
      def onStick(): Unit = js.native
      
      /**
        * Callback when element is bound to top of parent container
        */
      def onTop(): Unit = js.native
      
      /**
        * Callback when element is unfixed from page
        */
      def onUnstick(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // region Sticky Settings
      /**
        * Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up
        *
        * @default false
        */
      var pushing: Boolean = js.native
      
      /**
        * Context which sticky should attach onscroll events.
        *
        * @default 'window'
        */
      var scrollContext: String | JQuery = js.native
      
      /**
        * Sets size of fixed content to match its width before fixing to screen dynamically.
        * This is used because fixed may display block or 100% width content differently than it appears before sticking.
        *
        * @default true
        * @since 2.2.11
        */
      var setSize: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        bottomOffset: Double,
        className: ClassNameSettings,
        context: `false` | String | JQuery,
        debug: Boolean,
        error: ErrorSettings,
        jitter: Double,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        onBottom: () => Unit,
        onReposition: () => Unit,
        onScroll: () => Unit,
        onStick: () => Unit,
        onTop: () => Unit,
        onUnstick: () => Unit,
        performance: Boolean,
        pushing: Boolean,
        scrollContext: String | JQuery,
        setSize: Boolean,
        silent: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onBottom = js.Any.fromFunction0(onBottom), onReposition = js.Any.fromFunction0(onReposition), onScroll = js.Any.fromFunction0(onScroll), onStick = js.Any.fromFunction0(onStick), onTop = js.Any.fromFunction0(onTop), onUnstick = js.Any.fromFunction0(onUnstick), performance = performance.asInstanceOf[js.Any], pushing = pushing.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], setSize = setSize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnBottom(value: () => Unit): Self = StObject.set(x, "onBottom", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnReposition(value: () => Unit): Self = StObject.set(x, "onReposition", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnStick(value: () => Unit): Self = StObject.set(x, "onStick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnTop(value: () => Unit): Self = StObject.set(x, "onTop", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnUnstick(value: () => Unit): Self = StObject.set(x, "onUnstick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetSize(value: Boolean): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplpushing | PickImplsetSize | PickImpljitter | PickImplobserveChanges | PickImplcontext | PickImplscrollContext | PickImploffset | PickImplbottomOffset | PickImplonReposition | PickImplonScroll | PickImplonStick | PickImplonUnstick | PickImplonTop | PickImplonBottom | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/sticky.html#/settings}
    */
  type StickySettings = typingsSlinky.semanticUiSticky.SemanticUI.StickySettings.Param
}
