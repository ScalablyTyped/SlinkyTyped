package typingsSlinky.semanticUiShape

import typingsSlinky.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typingsSlinky.semanticUiShape.SemanticUI.Shape.ClassNameSettings.Param
import typingsSlinky.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typingsSlinky.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typingsSlinky.semanticUiShape.SemanticUI.Shape.Translation
import typingsSlinky.semanticUiShape.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiShape.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiShape.anon.PartialPickImplkeyofImplMethod
import typingsSlinky.semanticUiShape.anon.PartialPickImplkeyofImplSide
import typingsSlinky.semanticUiShape.anon.PickImplactive
import typingsSlinky.semanticUiShape.anon.PickImplanimating
import typingsSlinky.semanticUiShape.anon.PickImplbeforeChange
import typingsSlinky.semanticUiShape.anon.PickImplclassName
import typingsSlinky.semanticUiShape.anon.PickImpldebug
import typingsSlinky.semanticUiShape.anon.PickImplduration
import typingsSlinky.semanticUiShape.anon.PickImplerror
import typingsSlinky.semanticUiShape.anon.PickImplheight
import typingsSlinky.semanticUiShape.anon.PickImplhidden
import typingsSlinky.semanticUiShape.anon.PickImplloading
import typingsSlinky.semanticUiShape.anon.PickImplmethod
import typingsSlinky.semanticUiShape.anon.PickImplname
import typingsSlinky.semanticUiShape.anon.PickImplnamespace
import typingsSlinky.semanticUiShape.anon.PickImplonChange
import typingsSlinky.semanticUiShape.anon.PickImplperformance
import typingsSlinky.semanticUiShape.anon.PickImplselector
import typingsSlinky.semanticUiShape.anon.PickImplside
import typingsSlinky.semanticUiShape.anon.PickImplsides
import typingsSlinky.semanticUiShape.anon.PickImplsilent
import typingsSlinky.semanticUiShape.anon.PickImplverbose
import typingsSlinky.semanticUiShape.anon.PickImplwidth
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip back`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip down`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip left`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip over`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip right`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip up`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`is animating`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`set default side`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`set next side`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.beforeChange
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.className
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.debug
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.destroy
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.duration
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.error
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.height
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.initial
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.name
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.namespace
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.next
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.onChange
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.performance
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.queue
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.refresh
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.repaint
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.reset
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.selector
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.setting
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.silent
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.verbose
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Shape extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Flips the shape over counter-clockwise
      */
    def apply(behavior: `flip back`): JQuery = js.native
    /**
      * Flips the shape downward
      */
    def apply(behavior: `flip down`): JQuery = js.native
    /**
      * Flips the shape left
      */
    def apply(behavior: `flip left`): JQuery = js.native
    /**
      * Flips the shape over clock-wise
      */
    def apply(behavior: `flip over`): JQuery = js.native
    /**
      * Flips the shape right
      */
    def apply(behavior: `flip right`): JQuery = js.native
    /**
      * Flips the shape upward
      */
    def apply(behavior: `flip up`): JQuery = js.native
    /**
      * Returns translation for next side staged below
      */
    def apply(behavior: `get transform down`): Translation = js.native
    /**
      * Returns translation for next side staged left
      */
    def apply(behavior: `get transform left`): Translation = js.native
    /**
      * Returns translation for next side staged right
      */
    def apply(behavior: `get transform right`): Translation = js.native
    /**
      * Returns translation for next side staged up
      */
    def apply(behavior: `get transform up`): Translation = js.native
    /**
      * Returns whether shape is currently animating
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Set the next side to next sibling to active element
      */
    def apply(behavior: `set default side`): JQuery = js.native
    /**
      * Set the next side to a specific selector
      */
    def apply(behavior: `set next side`, selector: String): JQuery = js.native
    def apply(behavior: `set next side`, selector: JQuery): JQuery = js.native
    /**
      * Sets shape to the content size of the next side
      */
    def apply(behavior: `set stage size`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Queues an animation until after current animation
      */
    def apply(behavior: queue, animation: String): JQuery = js.native
    /**
      * Refreshes the selector cache for element sides
      */
    def apply(behavior: refresh): JQuery = js.native
    /**
      * Forces a reflow on element
      */
    def apply(behavior: repaint): JQuery = js.native
    /**
      * Removes all inline styles
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, name: beforeChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: height, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
    def apply(behavior: setting, name: height, value: Double): JQuery = js.native
    def apply(behavior: setting, name: height, value: initial): JQuery = js.native
    def apply(behavior: setting, name: height, value: next): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: width, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
    def apply(behavior: setting, name: width, value: Double): JQuery = js.native
    def apply(behavior: setting, name: width, value: initial): JQuery = js.native
    def apply(behavior: setting, name: width, value: next): JQuery = js.native
    def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
    def apply(settings: ShapeSettings): JQuery = js.native
    
    var settings: ShapeSettings = js.native
  }
  object Shape {
    
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
          * @default 'hidden'
          */
        var hidden: String = js.native
        
        /**
          * @default 'loading'
          */
        var loading: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(active: String, animating: String, hidden: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplanimating | PickImplhidden | PickImplloading | PickImplactive) with PartialPickImplkeyofImplActive
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
          * @default 'You tried to switch to a side that does not exist.'
          */
        var side: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String, side: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplside | PickImplmethod) with PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typingsSlinky.semanticUiShape.SemanticUI.Shape.ErrorSettings.Param
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.side'
          */
        var side: String = js.native
        
        /**
          * @default '.sides'
          */
        var sides: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(side: String, sides: String): Impl = {
          val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSides(value: String): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplsides | PickImplside) with PartialPickImplkeyofImplSide
    }
    type SelectorSettings = typingsSlinky.semanticUiShape.SemanticUI.Shape.SelectorSettings.Param
    
    @js.native
    trait Translation extends StObject {
      
      var transform: String = js.native
    }
    object Translation {
      
      @scala.inline
      def apply(transform: String): Translation = {
        val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
        __obj.asInstanceOf[Translation]
      }
      
      @scala.inline
      implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object ShapeSettings {
    
    @js.native
    trait Impl extends StObject {
      
      // endregion
      // region Callbacks
      /**
        * Is called before side change
        */
      def beforeChange(): Unit = js.native
      
      var className: ClassNameSettings = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      // region Shape Settings
      /**
        * Duration of side change animation
        *
        * @default 700
        */
      var duration: Double = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * When set to next will use the height of the next side during the shape's animation.
        * When set to initial it will use the height of the shape at initialization.
        * When set to a specific pixel height, will force the height to that height.
        *
        * @default 'initial'
        * @since 2.2
        */
      var height: next | initial | Double = js.native
      
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
        * Is called after visible side change
        */
      def onChange(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // endregion
      // region DOM Settings
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
      
      /**
        * When set to next will use the width of the next side during the shape's animation.
        * When set to initial it will use the width of the shape at initialization.
        * When set to a specific pixel height, will force the width to that height.
        *
        * @default 'initial'
        * @since 2.2
        */
      var width: next | initial | Double = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        beforeChange: () => Unit,
        className: ClassNameSettings,
        debug: Boolean,
        duration: Double,
        error: ErrorSettings,
        height: next | initial | Double,
        name: String,
        namespace: String,
        onChange: () => Unit,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean,
        width: next | initial | Double
      ): Impl = {
        val __obj = js.Dynamic.literal(beforeChange = js.Any.fromFunction0(beforeChange), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBeforeChange(value: () => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: next | initial | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: next | initial | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplduration | PickImplwidth | PickImplheight | PickImplbeforeChange | PickImplonChange | PickImplselector | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/shape.html#/settings}
    */
  type ShapeSettings = typingsSlinky.semanticUiShape.SemanticUI.ShapeSettings.Param
}
