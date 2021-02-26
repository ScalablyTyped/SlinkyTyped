package typingsSlinky.senchaTouch.Ext

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.senchaTouch.Ext.mixin.IIdentifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  type IController = IBase
  
  @js.native
  trait IDispatcher extends IBase {
    
    /** [Method] Returns the value of publishers
      * @returns Object
      */
    var getPublishers: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of publishers
      * @param publishers Object The new value.
      */
    var setPublishers: js.UndefOr[js.Function1[/* publishers */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IDispatcher {
    
    @scala.inline
    def apply(): IDispatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDispatcher]
    }
    
    @scala.inline
    implicit class IDispatcherMutableBuilder[Self <: IDispatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPublishers(value: () => _): Self = StObject.set(x, "getPublishers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPublishersUndefined: Self = StObject.set(x, "getPublishers", js.undefined)
      
      @scala.inline
      def setSetPublishers(value: /* publishers */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPublishers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPublishersUndefined: Self = StObject.set(x, "setPublishers", js.undefined)
    }
  }
  
  @js.native
  trait IDom extends StObject {
    
    /** [Property] (Number) */
    var distance: js.UndefOr[Double] = js.native
    
    /** [Method] Gets the x coordinate of the event
      * @returns Number
      */
    var getPageX: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Gets the y coordinate of the event
      * @returns Number
      */
    var getPageY: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Gets the target for the event
      * @param selector String A simple selector to filter the target or look for an ancestor of the target
      * @param maxDepth Number/Mixed The max depth to search as a number or element (defaults to 10 || document.body)
      * @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
      * @returns HTMLElement
      */
    var getTarget: js.UndefOr[
        js.Function3[
          /* selector */ js.UndefOr[java.lang.String], 
          /* maxDepth */ js.UndefOr[js.Any], 
          /* returnEl */ js.UndefOr[Boolean], 
          HTMLElement
        ]
      ] = js.native
    
    /** [Method] Returns the time of the event
      * @returns Date
      */
    var getTime: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Gets the X and Y coordinates of the event
      * @returns Array
      */
    var getXY: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Property] (Number) */
    var pageX: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var pageY: js.UndefOr[Double] = js.native
    
    /** [Method] Prevents the browsers default handling of the event  */
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (HTMLElement) */
    var target: js.UndefOr[HTMLElement] = js.native
  }
  object IDom {
    
    @scala.inline
    def apply(): IDom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDom]
    }
    
    @scala.inline
    implicit class IDomMutableBuilder[Self <: IDom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setGetPageX(value: () => Double): Self = StObject.set(x, "getPageX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageXUndefined: Self = StObject.set(x, "getPageX", js.undefined)
      
      @scala.inline
      def setGetPageY(value: () => Double): Self = StObject.set(x, "getPageY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageYUndefined: Self = StObject.set(x, "getPageY", js.undefined)
      
      @scala.inline
      def setGetTarget(
        value: (/* selector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
      ): Self = StObject.set(x, "getTarget", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
      
      @scala.inline
      def setGetTime(value: () => _): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimeUndefined: Self = StObject.set(x, "getTime", js.undefined)
      
      @scala.inline
      def setGetXY(value: () => Array): Self = StObject.set(x, "getXY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait IEvent
    extends IBase
       with IDom {
    
    /** [Property] (Number) */
    var angle: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var direction: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var duration: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var rotation: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var scale: js.UndefOr[Double] = js.native
    
    /** [Method] Stop the event preventDefault and stopPropagation
      * @returns Ext.event.Event this
      */
    var stopEvent: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Cancels bubbling of the event
      * @returns Ext.event.Event this
      */
    var stopPropagation: js.UndefOr[js.Function0[this.type]] = js.native
  }
  object IEvent {
    
    @scala.inline
    def apply(): IEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setStopEvent(value: () => IEvent): Self = StObject.set(x, "stopEvent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: () => IEvent): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
  
  type IListenerStack = IBase
  
  type ITouch = IDom
  
  object publisher {
    
    type IComponentDelegation = IPublisher
    
    type IComponentPaint = IPublisher
    
    type IComponentSize = IPublisher
    
    type IDom = IPublisher
    
    type IElementPaint = IPublisher
    
    type IElementSize = IPublisher
    
    type IPublisher = IBase
    
    @js.native
    trait ITouchGesture extends IBase {
      
      /** [Method] Returns the value of moveThrottle
        * @returns Number
        */
      var getMoveThrottle: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Returns the value of recognizers
        * @returns Object
        */
      var getRecognizers: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Sets the value of moveThrottle
        * @param moveThrottle Number The new value.
        */
      var setMoveThrottle: js.UndefOr[js.Function1[/* moveThrottle */ js.UndefOr[Double], Unit]] = js.native
      
      /** [Method] Sets the value of recognizers
        * @param recognizers Object The new value.
        */
      var setRecognizers: js.UndefOr[js.Function1[/* recognizers */ js.UndefOr[js.Any], Unit]] = js.native
    }
    object ITouchGesture {
      
      @scala.inline
      def apply(): ITouchGesture = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITouchGesture]
      }
      
      @scala.inline
      implicit class ITouchGestureMutableBuilder[Self <: ITouchGesture] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetMoveThrottle(value: () => Double): Self = StObject.set(x, "getMoveThrottle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMoveThrottleUndefined: Self = StObject.set(x, "getMoveThrottle", js.undefined)
        
        @scala.inline
        def setGetRecognizers(value: () => _): Self = StObject.set(x, "getRecognizers", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetRecognizersUndefined: Self = StObject.set(x, "getRecognizers", js.undefined)
        
        @scala.inline
        def setSetMoveThrottle(value: /* moveThrottle */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMoveThrottle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMoveThrottleUndefined: Self = StObject.set(x, "setMoveThrottle", js.undefined)
        
        @scala.inline
        def setSetRecognizers(value: /* recognizers */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setRecognizers", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetRecognizersUndefined: Self = StObject.set(x, "setRecognizers", js.undefined)
      }
    }
  }
  
  object recognizer {
    
    @js.native
    trait IDoubleTap extends IRecognizer {
      
      /** [Method] Returns the value of maxDuration
        * @returns Number
        */
      var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Sets the value of maxDuration
        * @param maxDuration Number The new value.
        */
      var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.native
    }
    object IDoubleTap {
      
      @scala.inline
      def apply(): IDoubleTap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDoubleTap]
      }
      
      @scala.inline
      implicit class IDoubleTapMutableBuilder[Self <: IDoubleTap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetMaxDuration(value: () => Double): Self = StObject.set(x, "getMaxDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMaxDurationUndefined: Self = StObject.set(x, "getMaxDuration", js.undefined)
        
        @scala.inline
        def setSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMaxDurationUndefined: Self = StObject.set(x, "setMaxDuration", js.undefined)
      }
    }
    
    @js.native
    trait IDrag extends IRecognizer {
      
      /** [Method] Returns the value of minDistance
        * @returns Number
        */
      var getMinDistance: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Config Option] (Number) */
      var minDistance: js.UndefOr[Double] = js.native
      
      /** [Method] Sets the value of minDistance
        * @param minDistance Number The new value.
        */
      var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.native
    }
    object IDrag {
      
      @scala.inline
      def apply(): IDrag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDrag]
      }
      
      @scala.inline
      implicit class IDragMutableBuilder[Self <: IDrag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetMinDistance(value: () => Double): Self = StObject.set(x, "getMinDistance", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMinDistanceUndefined: Self = StObject.set(x, "getMinDistance", js.undefined)
        
        @scala.inline
        def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
        
        @scala.inline
        def setSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinDistance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMinDistanceUndefined: Self = StObject.set(x, "setMinDistance", js.undefined)
      }
    }
    
    @js.native
    trait IEdgeSwipe extends ISwipe
    object IEdgeSwipe {
      
      @scala.inline
      def apply(): IEdgeSwipe = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IEdgeSwipe]
      }
    }
    
    type IHorizontalSwipe = ISwipe
    
    @js.native
    trait ILongPress extends IRecognizer {
      
      /** [Method] Returns the value of minDuration
        * @returns Number
        */
      var getMinDuration: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Sets the value of minDuration
        * @param minDuration Number The new value.
        */
      var setMinDuration: js.UndefOr[js.Function1[/* minDuration */ js.UndefOr[Double], Unit]] = js.native
    }
    object ILongPress {
      
      @scala.inline
      def apply(): ILongPress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILongPress]
      }
      
      @scala.inline
      implicit class ILongPressMutableBuilder[Self <: ILongPress] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetMinDuration(value: () => Double): Self = StObject.set(x, "getMinDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMinDurationUndefined: Self = StObject.set(x, "getMinDuration", js.undefined)
        
        @scala.inline
        def setSetMinDuration(value: /* minDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMinDurationUndefined: Self = StObject.set(x, "setMinDuration", js.undefined)
      }
    }
    
    type IMultiTouch = typingsSlinky.senchaTouch.Ext.event.recognizer.ITouch
    
    type IPinch = IMultiTouch
    
    @js.native
    trait IRecognizer extends IIdentifiable {
      
      /** [Method] Returns the value of callbackScope
        * @returns Object
        */
      var getCallbackScope: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Retrieves the id of this component
        * @returns String id
        */
      @JSName("getId")
      var getId_IRecognizer: js.UndefOr[js.Function0[java.lang.String]] = js.native
      
      /** [Method] Returns the value of onFailed
        * @returns Object
        */
      var getOnFailed: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of onRecognized
        * @returns Object
        */
      var getOnRecognized: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Sets the value of callbackScope
        * @param callbackScope Object The new value.
        */
      var setCallbackScope: js.UndefOr[js.Function1[/* callbackScope */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of onFailed
        * @param onFailed Object The new value.
        */
      var setOnFailed: js.UndefOr[js.Function1[/* onFailed */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of onRecognized
        * @param onRecognized Object The new value.
        */
      var setOnRecognized: js.UndefOr[js.Function1[/* onRecognized */ js.UndefOr[js.Any], Unit]] = js.native
    }
    object IRecognizer {
      
      @scala.inline
      def apply(): IRecognizer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRecognizer]
      }
      
      @scala.inline
      implicit class IRecognizerMutableBuilder[Self <: IRecognizer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCallbackScope(value: () => _): Self = StObject.set(x, "getCallbackScope", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetCallbackScopeUndefined: Self = StObject.set(x, "getCallbackScope", js.undefined)
        
        @scala.inline
        def setGetId(value: () => java.lang.String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
        
        @scala.inline
        def setGetOnFailed(value: () => _): Self = StObject.set(x, "getOnFailed", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetOnFailedUndefined: Self = StObject.set(x, "getOnFailed", js.undefined)
        
        @scala.inline
        def setGetOnRecognized(value: () => _): Self = StObject.set(x, "getOnRecognized", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetOnRecognizedUndefined: Self = StObject.set(x, "getOnRecognized", js.undefined)
        
        @scala.inline
        def setSetCallbackScope(value: /* callbackScope */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCallbackScope", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetCallbackScopeUndefined: Self = StObject.set(x, "setCallbackScope", js.undefined)
        
        @scala.inline
        def setSetOnFailed(value: /* onFailed */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnFailed", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetOnFailedUndefined: Self = StObject.set(x, "setOnFailed", js.undefined)
        
        @scala.inline
        def setSetOnRecognized(value: /* onRecognized */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnRecognized", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetOnRecognizedUndefined: Self = StObject.set(x, "setOnRecognized", js.undefined)
      }
    }
    
    type IRotate = IMultiTouch
    
    type ISingleTouch = typingsSlinky.senchaTouch.Ext.event.recognizer.ITouch
    
    @js.native
    trait ISwipe extends IRecognizer {
      
      /** [Method] Returns the value of maxDuration
        * @returns Number
        */
      var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Returns the value of maxOffset
        * @returns Number
        */
      var getMaxOffset: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Returns the value of minDistance
        * @returns Number
        */
      var getMinDistance: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Sets the value of maxDuration
        * @param maxDuration Number The new value.
        */
      var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.native
      
      /** [Method] Sets the value of maxOffset
        * @param maxOffset Number The new value.
        */
      var setMaxOffset: js.UndefOr[js.Function1[/* maxOffset */ js.UndefOr[Double], Unit]] = js.native
      
      /** [Method] Sets the value of minDistance
        * @param minDistance Number The new value.
        */
      var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.native
    }
    object ISwipe {
      
      @scala.inline
      def apply(): ISwipe = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISwipe]
      }
      
      @scala.inline
      implicit class ISwipeMutableBuilder[Self <: ISwipe] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetMaxDuration(value: () => Double): Self = StObject.set(x, "getMaxDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMaxDurationUndefined: Self = StObject.set(x, "getMaxDuration", js.undefined)
        
        @scala.inline
        def setGetMaxOffset(value: () => Double): Self = StObject.set(x, "getMaxOffset", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMaxOffsetUndefined: Self = StObject.set(x, "getMaxOffset", js.undefined)
        
        @scala.inline
        def setGetMinDistance(value: () => Double): Self = StObject.set(x, "getMinDistance", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMinDistanceUndefined: Self = StObject.set(x, "getMinDistance", js.undefined)
        
        @scala.inline
        def setSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMaxDurationUndefined: Self = StObject.set(x, "setMaxDuration", js.undefined)
        
        @scala.inline
        def setSetMaxOffset(value: /* maxOffset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxOffset", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMaxOffsetUndefined: Self = StObject.set(x, "setMaxOffset", js.undefined)
        
        @scala.inline
        def setSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinDistance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMinDistanceUndefined: Self = StObject.set(x, "setMinDistance", js.undefined)
      }
    }
    
    @js.native
    trait ITap extends IRecognizer {
      
      /** [Method] Returns the value of moveDistance
        * @returns Number
        */
      var getMoveDistance: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Config Option] (Number) */
      var moveDistance: js.UndefOr[Double] = js.native
      
      /** [Method] Sets the value of moveDistance
        * @param moveDistance Number The new value.
        */
      var setMoveDistance: js.UndefOr[js.Function1[/* moveDistance */ js.UndefOr[Double], Unit]] = js.native
    }
    object ITap {
      
      @scala.inline
      def apply(): ITap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITap]
      }
      
      @scala.inline
      implicit class ITapMutableBuilder[Self <: ITap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetMoveDistance(value: () => Double): Self = StObject.set(x, "getMoveDistance", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMoveDistanceUndefined: Self = StObject.set(x, "getMoveDistance", js.undefined)
        
        @scala.inline
        def setMoveDistance(value: Double): Self = StObject.set(x, "moveDistance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMoveDistanceUndefined: Self = StObject.set(x, "moveDistance", js.undefined)
        
        @scala.inline
        def setSetMoveDistance(value: /* moveDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMoveDistance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMoveDistanceUndefined: Self = StObject.set(x, "setMoveDistance", js.undefined)
      }
    }
    
    type ITouch = IRecognizer
    
    type IVerticalSwipe = ISwipe
  }
}
