package typingsSlinky.wixAnimations

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("wix-animations/src", "Animator")
  @js.native
  class Animator protected ()
    extends Component[AnimatorProps, js.Object, js.Any] {
    def this(props: AnimatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatorProps, context: js.Any) = this()
  }
  
  @js.native
  trait AnimatorProps extends StObject {
    
    var childClassName: js.UndefOr[String] = js.native
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataHook: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Delay] = js.native
    
    var height: js.UndefOr[Boolean | Double | (js.Function1[/* element */ js.Any, Double])] = js.native
    
    var opacity: js.UndefOr[Boolean] = js.native
    
    var scale: js.UndefOr[Boolean] = js.native
    
    var sequence: js.UndefOr[Sequence | Boolean] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var timing: js.UndefOr[Timing] = js.native
    
    var translate: js.UndefOr[Translate | Boolean | String] = js.native
    
    var width: js.UndefOr[Boolean | Double | (js.Function1[/* element */ js.Any, Double])] = js.native
  }
  object AnimatorProps {
    
    @scala.inline
    def apply(): AnimatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatorProps]
    }
    
    @scala.inline
    implicit class AnimatorPropsMutableBuilder[Self <: AnimatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildClassName(value: String): Self = StObject.set(x, "childClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildClassNameUndefined: Self = StObject.set(x, "childClassName", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHeight(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightFunction1(value: /* element */ js.Any => Double): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSequence(value: Sequence | Boolean): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      @scala.inline
      def setTranslate(value: Translate | Boolean | String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setWidth(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthFunction1(value: /* element */ js.Any => Double): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Delay extends StObject {
    
    var enter: js.UndefOr[Double] = js.native
    
    var exit: js.UndefOr[Double] = js.native
  }
  object Delay {
    
    @scala.inline
    def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wixAnimations.wixAnimationsStrings.top
    - typingsSlinky.wixAnimations.wixAnimationsStrings.bottom
    - typingsSlinky.wixAnimations.wixAnimationsStrings.left
    - typingsSlinky.wixAnimations.wixAnimationsStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def bottom: typingsSlinky.wixAnimations.wixAnimationsStrings.bottom = "bottom".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.wixAnimations.wixAnimationsStrings.left = "left".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.left]
    
    @scala.inline
    def right: typingsSlinky.wixAnimations.wixAnimationsStrings.right = "right".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.right]
    
    @scala.inline
    def top: typingsSlinky.wixAnimations.wixAnimationsStrings.top = "top".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.top]
  }
  
  @js.native
  trait Segment extends StObject {
    
    var direction: js.UndefOr[Direction] = js.native
    
    var size: js.UndefOr[String] = js.native
  }
  object Segment {
    
    @scala.inline
    def apply(): Segment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Segment]
    }
    
    @scala.inline
    implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wixAnimations.wixAnimationsStrings.default
    - typingsSlinky.wixAnimations.wixAnimationsStrings.flip
    - typingsSlinky.wixAnimations.wixAnimationsStrings.reverse
    - typingsSlinky.wixAnimations.wixAnimationsStrings.`reverse-flip`
  */
  trait Sequence extends StObject
  object Sequence {
    
    @scala.inline
    def default: typingsSlinky.wixAnimations.wixAnimationsStrings.default = "default".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.default]
    
    @scala.inline
    def flip: typingsSlinky.wixAnimations.wixAnimationsStrings.flip = "flip".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.flip]
    
    @scala.inline
    def reverse: typingsSlinky.wixAnimations.wixAnimationsStrings.reverse = "reverse".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.reverse]
    
    @scala.inline
    def `reverse-flip`: typingsSlinky.wixAnimations.wixAnimationsStrings.`reverse-flip` = "reverse-flip".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.`reverse-flip`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wixAnimations.wixAnimationsStrings.micro
    - typingsSlinky.wixAnimations.wixAnimationsStrings.small
    - typingsSlinky.wixAnimations.wixAnimationsStrings.medium
    - typingsSlinky.wixAnimations.wixAnimationsStrings.large
  */
  trait Timing extends StObject
  object Timing {
    
    @scala.inline
    def large: typingsSlinky.wixAnimations.wixAnimationsStrings.large = "large".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.large]
    
    @scala.inline
    def medium: typingsSlinky.wixAnimations.wixAnimationsStrings.medium = "medium".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.medium]
    
    @scala.inline
    def micro: typingsSlinky.wixAnimations.wixAnimationsStrings.micro = "micro".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.micro]
    
    @scala.inline
    def small: typingsSlinky.wixAnimations.wixAnimationsStrings.small = "small".asInstanceOf[typingsSlinky.wixAnimations.wixAnimationsStrings.small]
  }
  
  @js.native
  trait Translate extends StObject {
    
    var enter: js.UndefOr[Direction | Segment] = js.native
    
    var exit: js.UndefOr[Direction | Segment] = js.native
  }
  object Translate {
    
    @scala.inline
    def apply(): Translate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translate]
    }
    
    @scala.inline
    implicit class TranslateMutableBuilder[Self <: Translate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: Direction | Segment): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Direction | Segment): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
}
