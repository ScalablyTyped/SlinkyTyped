package typingsSlinky.subscribeUiEvent

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.subscribeUiEvent.anon.AxisIntention
import typingsSlinky.subscribeUiEvent.anon.Delta
import typingsSlinky.subscribeUiEvent.anon.Height
import typingsSlinky.subscribeUiEvent.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subscribe-ui-event", "listen")
  @js.native
  def listen(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Remove = js.native
  @JSImport("subscribe-ui-event", "listen")
  @js.native
  def listen(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Remove = js.native
  
  @JSImport("subscribe-ui-event", "subscribe")
  @js.native
  def subscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Subscription = js.native
  @JSImport("subscribe-ui-event", "subscribe")
  @js.native
  def subscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T], options: SubscribeOptions): Subscription = js.native
  @JSImport("subscribe-ui-event", "subscribe")
  @js.native
  def subscribe_T_TouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T]): Subscription = js.native
  @JSImport("subscribe-ui-event", "subscribe")
  @js.native
  def subscribe_T_TouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T], options: SubscribeOptions): Subscription = js.native
  
  @JSImport("subscribe-ui-event", "unsubscribe")
  @js.native
  def unsubscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Unit = js.native
  @JSImport("subscribe-ui-event", "unsubscribe")
  @js.native
  def unsubscribe_T_TouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T]): Unit = js.native
  
  @js.native
  trait ArgmentedEvent[T /* <: EventType */] extends StObject {
    
    var mainType: String = js.native
    
    var resize: Height = js.native
    
    var scroll: Delta = js.native
    
    var subType: String = js.native
    
    var touch: AxisIntention = js.native
    
    var `type`: T = js.native
  }
  object ArgmentedEvent {
    
    @scala.inline
    def apply[T /* <: EventType */](mainType: String, resize: Height, scroll: Delta, subType: String, touch: AxisIntention, `type`: T): ArgmentedEvent[T] = {
      val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmentedEvent[T]]
    }
    
    @scala.inline
    implicit class ArgmentedEventMutableBuilder[Self <: ArgmentedEvent[_], T /* <: EventType */] (val x: Self with ArgmentedEvent[T]) extends AnyVal {
      
      @scala.inline
      def setMainType(value: String): Self = StObject.set(x, "mainType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResize(value: Height): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroll(value: Delta): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouch(value: AxisIntention): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resize
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeStart
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scroll
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollStart
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchend
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmove
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchstart
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def resize: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resize = "resize".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resize]
    
    @scala.inline
    def resizeEnd: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = "resizeEnd".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeEnd]
    
    @scala.inline
    def resizeStart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeStart = "resizeStart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeStart]
    
    @scala.inline
    def scroll: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scroll = "scroll".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scroll]
    
    @scala.inline
    def scrollEnd: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = "scrollEnd".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollEnd]
    
    @scala.inline
    def scrollStart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollStart = "scrollStart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollStart]
    
    @scala.inline
    def touchend: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchend = "touchend".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchend]
    
    @scala.inline
    def touchmove: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmove = "touchmove".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmove]
    
    @scala.inline
    def touchmoveEnd: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = "touchmoveEnd".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd]
    
    @scala.inline
    def touchmoveStart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = "touchmoveStart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart]
    
    @scala.inline
    def touchstart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchstart = "touchstart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchstart]
    
    @scala.inline
    def visibilitychange: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = "visibilitychange".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.visibilitychange]
  }
  
  @js.native
  trait SubscribeOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var enableResizeInfo: js.UndefOr[Boolean] = js.native
    
    var enableScrollInfo: js.UndefOr[Boolean] = js.native
    
    var enableTouchInfo: js.UndefOr[Boolean] = js.native
    
    var eventOptions: js.UndefOr[AddEventListenerOptions] = js.native
    
    var throttleRate: js.UndefOr[Double] = js.native
    
    var useRAF: js.UndefOr[Boolean] = js.native
  }
  object SubscribeOptions {
    
    @scala.inline
    def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    @scala.inline
    implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEnableResizeInfo(value: Boolean): Self = StObject.set(x, "enableResizeInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeInfoUndefined: Self = StObject.set(x, "enableResizeInfo", js.undefined)
      
      @scala.inline
      def setEnableScrollInfo(value: Boolean): Self = StObject.set(x, "enableScrollInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableScrollInfoUndefined: Self = StObject.set(x, "enableScrollInfo", js.undefined)
      
      @scala.inline
      def setEnableTouchInfo(value: Boolean): Self = StObject.set(x, "enableTouchInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTouchInfoUndefined: Self = StObject.set(x, "enableTouchInfo", js.undefined)
      
      @scala.inline
      def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventOptionsUndefined: Self = StObject.set(x, "eventOptions", js.undefined)
      
      @scala.inline
      def setThrottleRate(value: Double): Self = StObject.set(x, "throttleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleRateUndefined: Self = StObject.set(x, "throttleRate", js.undefined)
      
      @scala.inline
      def setUseRAF(value: Boolean): Self = StObject.set(x, "useRAF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRAFUndefined: Self = StObject.set(x, "useRAF", js.undefined)
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ TouchEvent, /* payload */ ArgmentedEvent[T], js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchend
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmove
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchstart
  */
  trait TouchEventType extends StObject
  object TouchEventType {
    
    @scala.inline
    def touchend: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchend = "touchend".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchend]
    
    @scala.inline
    def touchmove: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmove = "touchmove".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmove]
    
    @scala.inline
    def touchmoveEnd: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = "touchmoveEnd".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd]
    
    @scala.inline
    def touchmoveStart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = "touchmoveStart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart]
    
    @scala.inline
    def touchstart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchstart = "touchstart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.touchstart]
  }
  
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ UIEvent, /* payload */ ArgmentedEvent[T], js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resize
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeStart
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scroll
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollStart
    - typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
  */
  trait UIEventType extends StObject
  object UIEventType {
    
    @scala.inline
    def resize: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resize = "resize".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resize]
    
    @scala.inline
    def resizeEnd: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = "resizeEnd".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeEnd]
    
    @scala.inline
    def resizeStart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeStart = "resizeStart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.resizeStart]
    
    @scala.inline
    def scroll: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scroll = "scroll".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scroll]
    
    @scala.inline
    def scrollEnd: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = "scrollEnd".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollEnd]
    
    @scala.inline
    def scrollStart: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollStart = "scrollStart".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.scrollStart]
    
    @scala.inline
    def visibilitychange: typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = "visibilitychange".asInstanceOf[typingsSlinky.subscribeUiEvent.subscribeUiEventStrings.visibilitychange]
  }
}
