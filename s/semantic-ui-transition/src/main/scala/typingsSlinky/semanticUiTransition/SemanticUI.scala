package typingsSlinky.semanticUiTransition

import typingsSlinky.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typingsSlinky.semanticUiTransition.SemanticUI.Transition.ClassNameSettings.Param
import typingsSlinky.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typingsSlinky.semanticUiTransition.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiTransition.anon.PartialPickImplkeyofImplAnimating
import typingsSlinky.semanticUiTransition.anon.PartialPickImplkeyofImplMethod
import typingsSlinky.semanticUiTransition.anon.PickImplallowRepeats
import typingsSlinky.semanticUiTransition.anon.PickImplanimating
import typingsSlinky.semanticUiTransition.anon.PickImplanimation
import typingsSlinky.semanticUiTransition.anon.PickImplclassName
import typingsSlinky.semanticUiTransition.anon.PickImpldebug
import typingsSlinky.semanticUiTransition.anon.PickImpldisabled
import typingsSlinky.semanticUiTransition.anon.PickImpldisplayType
import typingsSlinky.semanticUiTransition.anon.PickImplduration
import typingsSlinky.semanticUiTransition.anon.PickImplerror
import typingsSlinky.semanticUiTransition.anon.PickImplhidden
import typingsSlinky.semanticUiTransition.anon.PickImplinterval
import typingsSlinky.semanticUiTransition.anon.PickImplinward
import typingsSlinky.semanticUiTransition.anon.PickImplloading
import typingsSlinky.semanticUiTransition.anon.PickImpllooping
import typingsSlinky.semanticUiTransition.anon.PickImplmethod
import typingsSlinky.semanticUiTransition.anon.PickImplname
import typingsSlinky.semanticUiTransition.anon.PickImplnamespace
import typingsSlinky.semanticUiTransition.anon.PickImplnoAnimation
import typingsSlinky.semanticUiTransition.anon.PickImplonComplete
import typingsSlinky.semanticUiTransition.anon.PickImplonHide
import typingsSlinky.semanticUiTransition.anon.PickImplonShow
import typingsSlinky.semanticUiTransition.anon.PickImplonStart
import typingsSlinky.semanticUiTransition.anon.PickImploutward
import typingsSlinky.semanticUiTransition.anon.PickImplperformance
import typingsSlinky.semanticUiTransition.anon.PickImplqueue
import typingsSlinky.semanticUiTransition.anon.PickImplreverse
import typingsSlinky.semanticUiTransition.anon.PickImplsilent
import typingsSlinky.semanticUiTransition.anon.PickImpltransition
import typingsSlinky.semanticUiTransition.anon.PickImpluseFailSafe
import typingsSlinky.semanticUiTransition.anon.PickImplverbose
import typingsSlinky.semanticUiTransition.anon.PickImplvisible
import typingsSlinky.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`clear queue`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`force repaint`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`get animation event`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`get animation name`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`is animating`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`is looping`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`is supported`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`is visible`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`remove looping`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`restore conditions`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`save conditions`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`set duration`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.`stop all`
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.allowRepeats
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.animation
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.auto
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.className
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.debug
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.destroy
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.disable
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.displayType
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.duration
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.enable
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.error
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.hide
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.interval
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.looping
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.name
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.namespace
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.onComplete
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.onHide
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.onShow
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.onStart
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.performance
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.queue
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.repaint
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.reset
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.reverse
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.setting
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.show
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.silent
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.stop
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.toggle
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.useFailSafe
import typingsSlinky.semanticUiTransition.semanticUiTransitionStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Transition extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears all queued animations
      */
    def apply(behavior: `clear queue`): JQuery = js.native
    /**
      * Forces reflow using a more expensive but stable method
      */
    def apply(behavior: `force repaint`): JQuery = js.native
    /**
      * Returns vendor prefixed animation property for animationend
      */
    def apply(behavior: `get animation event`): String = js.native
    /**
      * Returns vendor prefixed animation property for animationname
      */
    def apply(behavior: `get animation name`): String = js.native
    /**
      * Returns whether transition is currently occurring
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Returns whether animation looping is set
      */
    def apply(behavior: `is looping`): Boolean = js.native
    /**
      * Returns whether animations are supported
      */
    def apply(behavior: `is supported`): Boolean = js.native
    /**
      * Returns whether element is currently visible
      */
    def apply(behavior: `is visible`): Boolean = js.native
    /**
      * Removes looping state from element
      */
    def apply(behavior: `remove looping`): JQuery = js.native
    /**
      * Adds back cached names and styles to element
      */
    def apply(behavior: `restore conditions`): JQuery = js.native
    /**
      * Saves all class names and styles to cache to be retrieved after animation
      */
    def apply(behavior: `save conditions`): JQuery = js.native
    /**
      * Modifies element animation duration
      */
    def apply(behavior: `set duration`, duration: Double): JQuery = js.native
    /**
      * Stop current animation and queued animations
      */
    def apply(behavior: `stop all`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Adds disabled state (stops ability to animate)
      */
    def apply(behavior: disable): JQuery = js.native
    /**
      * Removes disabled state
      */
    def apply(behavior: enable): JQuery = js.native
    /**
      * Stop current animation and hide element
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Enables animation looping
      */
    def apply(behavior: looping): JQuery = js.native
    /**
      * Triggers reflow on element
      */
    def apply(behavior: repaint): JQuery = js.native
    /**
      * Resets all conditions changes during transition
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, name: allowRepeats, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: allowRepeats, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: animation, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: animation, value: String): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: displayType, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
    def apply(behavior: setting, name: displayType, value: String): JQuery = js.native
    def apply(behavior: setting, name: displayType, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: interval, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: interval, value: Double): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onComplete, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onComplete, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onStart, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onStart, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: queue, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: queue, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: reverse, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
    def apply(behavior: setting, name: reverse, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: reverse, value: auto): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: useFailSafe, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: useFailSafe, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: TransitionSettings): JQuery = js.native
    /**
      * Stop current animation and show element
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Stop current animation and preserve queue
      */
    def apply(behavior: stop): JQuery = js.native
    /**
      * Toggles between hide and show
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: TransitionSettings): JQuery = js.native
    def apply(transition: String): JQuery = js.native
    
    var settings: TransitionSettings = js.native
  }
  object Transition {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'animating'
          */
        var animating: String = js.native
        
        /**
          * @default 'disabled'
          */
        var disabled: String = js.native
        
        /**
          * @default 'hidden'
          */
        var hidden: String = js.native
        
        /**
          * @default 'in'
          */
        var inward: String = js.native
        
        /**
          * @default 'loading'
          */
        var loading: String = js.native
        
        /**
          * @default 'looping'
          */
        var looping: String = js.native
        
        /**
          * @default 'out'
          */
        var outward: String = js.native
        
        /**
          * @default 'transition'
          */
        var transition: String = js.native
        
        /**
          * @default 'visible'
          */
        var visible: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          animating: String,
          disabled: String,
          hidden: String,
          inward: String,
          loading: String,
          looping: String,
          outward: String,
          transition: String,
          visible: String
        ): Impl = {
          val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inward = inward.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], outward = outward.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInward(value: String): Self = StObject.set(x, "inward", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLooping(value: String): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOutward(value: String): Self = StObject.set(x, "outward", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplanimating | PickImpldisabled | PickImplhidden | PickImplinward | PickImplloading | PickImpllooping | PickImploutward | PickImpltransition | PickImplvisible) with PartialPickImplkeyofImplAnimating
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String = js.native
        
        /**
          * @default 'There is no CSS animation matching the one you specified.'
          */
        var noAnimation: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String, noAnimation: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noAnimation = noAnimation.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplnoAnimation | PickImplmethod) with PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typingsSlinky.semanticUiTransition.SemanticUI.Transition.ErrorSettings.Param
  }
  
  object TransitionSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * If enabled will allow same animation to be queued while it is already occurring
        */
      var allowRepeats: Boolean = js.native
      
      // region Transition Settings
      /**
        * Named animation event to used. Must be defined in CSS.
        *
        * @default 'fade'
        */
      var animation: String = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
        *
        * @default false
        */
      var displayType: `false` | String = js.native
      
      /**
        * Duration of the CSS transition animation
        *
        * @default 500
        */
      var duration: Double = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Interval in MS between each elements transition
        *
        * @default 0
        */
      var interval: Double = js.native
      
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
        * Callback on each transition complete
        */
      def onComplete(): Unit = js.native
      
      /**
        * Callback on each transition that changes visibility to hidden
        */
      def onHide(): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback on each transition that changes visibility to shown
        */
      def onShow(): Unit = js.native
      
      /**
        * Callback on animation start, useful for queued animations
        */
      def onStart(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      /**
        * Whether to automatically queue animation if another is occurring
        */
      var queue: Boolean = js.native
      
      /**
        * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
        *
        * @default 'auto'
        */
      var reverse: auto | Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
        */
      var useFailSafe: Boolean = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        allowRepeats: Boolean,
        animation: String,
        className: ClassNameSettings,
        debug: Boolean,
        displayType: `false` | String,
        duration: Double,
        error: ErrorSettings,
        interval: Double,
        name: String,
        namespace: String,
        onComplete: () => Unit,
        onHide: () => Unit,
        onShow: () => Unit,
        onStart: () => Unit,
        performance: Boolean,
        queue: Boolean,
        reverse: auto | Boolean,
        silent: Boolean,
        useFailSafe: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onComplete = js.Any.fromFunction0(onComplete), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), onStart = js.Any.fromFunction0(onStart), performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], useFailSafe = useFailSafe.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowRepeats(value: Boolean): Self = StObject.set(x, "allowRepeats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayType(value: `false` | String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReverse(value: auto | Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseFailSafe(value: Boolean): Self = StObject.set(x, "useFailSafe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplanimation | PickImplinterval | PickImplreverse | PickImpldisplayType | PickImplduration | PickImpluseFailSafe | PickImplallowRepeats | PickImplqueue | PickImplonShow | PickImplonHide | PickImplonStart | PickImplonComplete | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/transition.html#/settings}
    */
  type TransitionSettings = typingsSlinky.semanticUiTransition.SemanticUI.TransitionSettings.Param
}
