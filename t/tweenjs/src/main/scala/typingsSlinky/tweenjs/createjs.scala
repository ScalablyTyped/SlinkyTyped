package typingsSlinky.tweenjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.createjsLib.createjs.Event
import typingsSlinky.createjsLib.createjs.EventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  @js.native
  trait AbstractTween extends EventDispatcher {
    
    def addLabel(label: String, position: Double): Unit = js.native
    
    // methods
    def advance(delta: Double): Unit = js.native
    def advance(delta: Double, ignoreActions: Boolean): Unit = js.native
    
    var bounce: Boolean = js.native
    
    def calculatePosition(rawPosition: Double): Unit = js.native
    
    val currentLabel: String = js.native
    
    var duration: Double = js.native
    
    def getLabels(): js.Array[String] = js.native
    
    def gotoAndPlay(positionOrLabel: String): Unit = js.native
    def gotoAndPlay(positionOrLabel: Double): Unit = js.native
    
    def gotoAndStop(positionOrLabel: String): Unit = js.native
    def gotoAndStop(positionOrLabel: Double): Unit = js.native
    
    // properties
    var ignoreGlobalPause: Boolean = js.native
    
    var loop: Double = js.native
    
    var paused: Boolean = js.native
    
    var position: Double = js.native
    
    var rawPosition: Double = js.native
    
    def resolve(positionOrLabel: String): Double = js.native
    def resolve(positionOrLabel: Double): Double = js.native
    
    var reversed: Boolean = js.native
    
    def setLabels(labels: js.Array[StringDictionary[Double]]): Unit = js.native
    
    def setPosition(rawPosition: Double): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: js.UndefOr[scala.Nothing],
      jump: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    def setPosition(rawPosition: Double, ignoreActions: js.UndefOr[scala.Nothing], jump: Boolean): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: js.UndefOr[scala.Nothing],
      jump: Boolean,
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    def setPosition(rawPosition: Double, ignoreActions: Boolean): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: Boolean,
      jump: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    def setPosition(rawPosition: Double, ignoreActions: Boolean, jump: Boolean): Unit = js.native
    def setPosition(
      rawPosition: Double,
      ignoreActions: Boolean,
      jump: Boolean,
      callback: js.Function1[/* tween */ this.type, Unit]
    ): Unit = js.native
    
    var timeScale: Double = js.native
    
    var useTicks: Boolean = js.native
  }
  
  @js.native
  trait Ease extends StObject
  
  @js.native
  trait MotionGuidePlugin extends StObject
  
  @js.native
  trait Timeline extends AbstractTween {
    
    // method
    def addTween(tween: Tween): Tween = js.native
    
    def removeTween(tween: Tween): Boolean = js.native
    
    // properties
    var tweens: js.Array[Tween] = js.native
    
    def updateDuration(): Unit = js.native
  }
  
  @js.native
  trait TimelineProps extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.native
    
    var ignoreGlobalPause: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var paused: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    var timeScale: js.UndefOr[Double] = js.native
    
    var useTicks: js.UndefOr[Boolean] = js.native
  }
  object TimelineProps {
    
    @scala.inline
    def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    @scala.inline
    implicit class TimelinePropsMutableBuilder[Self <: TimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setIgnoreGlobalPause(value: Boolean): Self = StObject.set(x, "ignoreGlobalPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreGlobalPauseUndefined: Self = StObject.set(x, "ignoreGlobalPause", js.undefined)
      
      @scala.inline
      def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* e */ Event => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      @scala.inline
      def setUseTicks(value: Boolean): Self = StObject.set(x, "useTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTicksUndefined: Self = StObject.set(x, "useTicks", js.undefined)
    }
  }
  
  @js.native
  trait Tween extends AbstractTween {
    
    def call(callback: js.Function1[/* repeated */ js.Any, Unit]): Tween = js.native
    def call(
      callback: js.Function1[/* repeated */ js.Any, Unit],
      params: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Tween = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): Tween = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_], scope: js.Any): Tween = js.native
    
    def label(name: String): Tween = js.native
    
    var passive: Boolean = js.native
    
    def pause(): Tween = js.native
    def pause(tween: Tween): Tween = js.native
    
    def play(): Tween = js.native
    def play(tween: Tween): Tween = js.native
    
    var pluginData: js.Any = js.native
    
    def set(props: js.Any): Tween = js.native
    def set(props: js.Any, target: js.Any): Tween = js.native
    
    // properties
    var target: js.Any = js.native
    
    def to(props: js.Any): Tween = js.native
    def to(props: js.Any, duration: js.UndefOr[scala.Nothing], ease: js.Function): Tween = js.native
    def to(props: js.Any, duration: Double): Tween = js.native
    def to(props: js.Any, duration: Double, ease: js.Function): Tween = js.native
    
    def wait(duration: Double): Tween = js.native
    def wait(duration: Double, passive: Boolean): Tween = js.native
  }
  
  @js.native
  trait TweenAction extends StObject {
    
    var d: Double = js.native
    
    var funct: js.Function = js.native
    
    var next: TweenAction = js.native
    
    var params: js.Array[_] = js.native
    
    var prev: TweenAction = js.native
    
    var scope: js.Any = js.native
    
    var t: Double = js.native
  }
  object TweenAction {
    
    @scala.inline
    def apply(
      d: Double,
      funct: js.Function,
      next: TweenAction,
      params: js.Array[_],
      prev: TweenAction,
      scope: js.Any,
      t: Double
    ): TweenAction = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], funct = funct.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenAction]
    }
    
    @scala.inline
    implicit class TweenActionMutableBuilder[Self <: TweenAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunct(value: js.Function): Self = StObject.set(x, "funct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: TweenAction): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setPrev(value: TweenAction): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TweenJS extends StObject
  
  @js.native
  trait TweenProps extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.native
    
    var ignoreGlobalPause: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var `override`: js.UndefOr[Boolean] = js.native
    
    var paused: js.UndefOr[Boolean] = js.native
    
    var pluginData: js.UndefOr[js.Any] = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    var timeScale: js.UndefOr[Double] = js.native
    
    var useTicks: js.UndefOr[Boolean] = js.native
  }
  object TweenProps {
    
    @scala.inline
    def apply(): TweenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TweenProps]
    }
    
    @scala.inline
    implicit class TweenPropsMutableBuilder[Self <: TweenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setIgnoreGlobalPause(value: Boolean): Self = StObject.set(x, "ignoreGlobalPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreGlobalPauseUndefined: Self = StObject.set(x, "ignoreGlobalPause", js.undefined)
      
      @scala.inline
      def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* e */ Event => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setPluginData(value: js.Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      @scala.inline
      def setUseTicks(value: Boolean): Self = StObject.set(x, "useTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTicksUndefined: Self = StObject.set(x, "useTicks", js.undefined)
    }
  }
  
  @js.native
  trait TweenStep extends StObject {
    
    var d: Double = js.native
    
    var ease: js.Function = js.native
    
    var index: Double = js.native
    
    var next: TweenStep = js.native
    
    var passive: Boolean = js.native
    
    var prev: TweenStep = js.native
    
    var props: TweenProps = js.native
    
    var t: Double = js.native
  }
  object TweenStep {
    
    @scala.inline
    def apply(
      d: Double,
      ease: js.Function,
      index: Double,
      next: TweenStep,
      passive: Boolean,
      prev: TweenStep,
      props: TweenProps,
      t: Double
    ): TweenStep = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenStep]
    }
    
    @scala.inline
    implicit class TweenStepMutableBuilder[Self <: TweenStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEase(value: js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: TweenStep): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: TweenStep): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: TweenProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
