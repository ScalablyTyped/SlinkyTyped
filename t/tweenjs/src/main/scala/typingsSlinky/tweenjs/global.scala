package typingsSlinky.tweenjs

import typingsSlinky.createjsLib.createjs.Event
import typingsSlinky.tweenjs.createjs.TimelineProps
import typingsSlinky.tweenjs.createjs.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object createjs extends js.Object {
    @js.native
    class AbstractTween ()
      extends typingsSlinky.tweenjs.createjs.AbstractTween {
      def this(props: TweenProps) = this()
    }
    
    @js.native
    class Ease ()
      extends typingsSlinky.tweenjs.createjs.Ease
    
    @js.native
    class MotionGuidePlugin ()
      extends typingsSlinky.tweenjs.createjs.MotionGuidePlugin
    
    @js.native
    class Timeline ()
      extends typingsSlinky.tweenjs.createjs.Timeline {
      def this(props: TimelineProps) = this()
    }
    
    @js.native
    class Tween protected ()
      extends typingsSlinky.tweenjs.createjs.Tween {
      def this(target: js.Any) = this()
      def this(target: js.Any, props: TweenProps) = this()
    }
    
    @js.native
    class TweenAction protected ()
      extends typingsSlinky.tweenjs.createjs.TweenAction {
      def this(
        prev: typingsSlinky.tweenjs.createjs.TweenAction,
        t: Double,
        scope: js.Any,
        funct: js.Function,
        params: js.Array[_]
      ) = this()
      /* CompleteClass */
      override var d: Double = js.native
      /* CompleteClass */
      override var funct: js.Function = js.native
      /* CompleteClass */
      override var next: typingsSlinky.tweenjs.createjs.TweenAction = js.native
      /* CompleteClass */
      override var params: js.Array[_] = js.native
      /* CompleteClass */
      override var prev: typingsSlinky.tweenjs.createjs.TweenAction = js.native
      /* CompleteClass */
      override var scope: js.Any = js.native
      /* CompleteClass */
      override var t: Double = js.native
    }
    
    @js.native
    class TweenJS ()
      extends typingsSlinky.tweenjs.createjs.TweenJS
    
    @js.native
    class TweenStep protected ()
      extends typingsSlinky.tweenjs.createjs.TweenStep {
      def this(
        prev: typingsSlinky.tweenjs.createjs.TweenStep,
        t: Double,
        d: Double,
        props: TweenProps,
        ease: js.Function,
        passive: Boolean
      ) = this()
      /* CompleteClass */
      override var d: Double = js.native
      /* CompleteClass */
      override var ease: js.Function = js.native
      /* CompleteClass */
      override var index: Double = js.native
      /* CompleteClass */
      override var next: typingsSlinky.tweenjs.createjs.TweenStep = js.native
      /* CompleteClass */
      override var passive: Boolean = js.native
      /* CompleteClass */
      override var prev: typingsSlinky.tweenjs.createjs.TweenStep = js.native
      /* CompleteClass */
      override var props: TweenProps = js.native
      /* CompleteClass */
      override var t: Double = js.native
    }
    
    /* static members */
    @js.native
    object Ease extends js.Object {
      // methods
      def backIn(amount: Double): Double = js.native
      def backInOut(amount: Double): Double = js.native
      def backOut(amount: Double): Double = js.native
      def bounceIn(amount: Double): Double = js.native
      def bounceInOut(amount: Double): Double = js.native
      def bounceOut(amount: Double): Double = js.native
      def circIn(amount: Double): Double = js.native
      def circInOut(amount: Double): Double = js.native
      def circOut(amount: Double): Double = js.native
      def cubicIn(amount: Double): Double = js.native
      def cubicInOut(amount: Double): Double = js.native
      def cubicOut(amount: Double): Double = js.native
      def elasticIn(amount: Double): Double = js.native
      def elasticInOut(amount: Double): Double = js.native
      def elasticOut(amount: Double): Double = js.native
      def get(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getBackIn(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getBackInOut(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getBackOut(amount: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getElasticIn(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getElasticInOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getElasticOut(amplitude: Double, period: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getPowIn(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getPowInOut(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      def getPowOut(pow: Double): js.Function1[/* amount */ Double, Double] = js.native
      def linear(amount: Double): Double = js.native
      def none(amount: Double): Double = js.native
          // same as linear
      def quadIn(amount: Double): Double = js.native
      def quadInOut(amount: Double): Double = js.native
      def quadOut(amount: Double): Double = js.native
      def quartIn(amount: Double): Double = js.native
      def quartInOut(amount: Double): Double = js.native
      def quartOut(amount: Double): Double = js.native
      def quintIn(amount: Double): Double = js.native
      def quintInOut(amount: Double): Double = js.native
      def quintOut(amount: Double): Double = js.native
      def sineIn(amount: Double): Double = js.native
      def sineInOut(amount: Double): Double = js.native
      def sineOut(amount: Double): Double = js.native
    }
    
    /* static members */
    @js.native
    object MotionGuidePlugin extends js.Object {
      var ID: String = js.native
      //properties
      var priority: Double = js.native
      def change(
        tween: typingsSlinky.tweenjs.createjs.Tween,
        step: typingsSlinky.tweenjs.createjs.TweenStep,
        prop: String,
        value: js.Any,
        ratio: Double,
        end: Boolean
      ): Unit = js.native
      def debug(guideData: js.Any, ctx: js.Any, higlight: js.Array[Double]): Unit = js.native
      def init(tween: typingsSlinky.tweenjs.createjs.Tween, prop: String, value: js.Any): Unit = js.native
      //methods
      def install(): js.Object = js.native
      def step(
        tween: typingsSlinky.tweenjs.createjs.Tween,
        step: typingsSlinky.tweenjs.createjs.TweenStep,
        props: TweenProps
      ): Unit = js.native
    }
    
    /* static members */
    @js.native
    object Tween extends js.Object {
      var IGNORE: js.Any = js.native
      // methods
      def get(target: js.Any): typingsSlinky.tweenjs.createjs.Tween = js.native
      def get(target: js.Any, props: TweenProps): typingsSlinky.tweenjs.createjs.Tween = js.native
      def handleEvent(e: Event): Unit = js.native
      def hasActiveTweens(target: js.Any): Boolean = js.native
      def removeAllTweens(): Unit = js.native
      def removeTweens(target: js.Any): Unit = js.native
      def tick(delta: Double, paused: Boolean): Unit = js.native
    }
    
    /* static members */
    @js.native
    object TweenJS extends js.Object {
      // properties
      var buildDate: String = js.native
      var version: String = js.native
    }
    
  }
  
}

