package typingsSlinky.scrollBehavior

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.scrollBehavior.anon.Read
import typingsSlinky.scrollBehavior.scrollBehaviorStrings.PUSH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-behavior", JSImport.Default)
  @js.native
  class default[TLocation /* <: LocationBase */, TContext] protected () extends ScrollBehavior[TLocation, TContext] {
    def this(options: ScrollBehaviorOptions[TLocation, TContext]) = this()
  }
  
  @js.native
  trait LocationBase extends StObject {
    
    var action: PUSH | String = js.native
    
    var hash: js.UndefOr[String] = js.native
  }
  object LocationBase {
    
    @scala.inline
    def apply(action: PUSH | String): LocationBase = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationBase]
    }
    
    @scala.inline
    implicit class LocationBaseMutableBuilder[Self <: LocationBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: PUSH | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
  
  @js.native
  trait ScrollBehavior[TLocation /* <: LocationBase */, TContext] extends StObject {
    
    def registerElement(key: String, element: HTMLElement, shouldUpdateScroll: Null, context: TContext): Unit = js.native
    def registerElement(
      key: String,
      element: HTMLElement,
      shouldUpdateScroll: ShouldUpdateScroll[TContext],
      context: TContext
    ): Unit = js.native
    
    def scrollToTarget(element: HTMLElement, target: String): Unit = js.native
    def scrollToTarget(element: HTMLElement, target: ScrollPosition): Unit = js.native
    
    def startIgnoringScrollEvents(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def stopIgnoringScrollEvents(): Unit = js.native
    
    def unregisterElement(key: String): Unit = js.native
    
    def updateScroll(prevContext: TContext, context: TContext): Unit = js.native
    def updateScroll(prevContext: Null, context: TContext): Unit = js.native
  }
  
  @js.native
  trait ScrollBehaviorOptions[TLocation /* <: LocationBase */, TContext] extends StObject {
    
    def addTransitionHook(hook: TransitionHook): js.Function0[Unit] = js.native
    
    def getCurrentLocation(): TLocation = js.native
    
    var shouldUpdateScroll: js.UndefOr[ShouldUpdateScroll[TContext]] = js.native
    
    var stateStorage: Read[TLocation] = js.native
  }
  object ScrollBehaviorOptions {
    
    @scala.inline
    def apply[TLocation /* <: LocationBase */, TContext](
      addTransitionHook: TransitionHook => js.Function0[Unit],
      getCurrentLocation: () => TLocation,
      stateStorage: Read[TLocation]
    ): ScrollBehaviorOptions[TLocation, TContext] = {
      val __obj = js.Dynamic.literal(addTransitionHook = js.Any.fromFunction1(addTransitionHook), getCurrentLocation = js.Any.fromFunction0(getCurrentLocation), stateStorage = stateStorage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBehaviorOptions[TLocation, TContext]]
    }
    
    @scala.inline
    implicit class ScrollBehaviorOptionsMutableBuilder[Self <: ScrollBehaviorOptions[_, _], TLocation /* <: LocationBase */, TContext] (val x: Self with (ScrollBehaviorOptions[TLocation, TContext])) extends AnyVal {
      
      @scala.inline
      def setAddTransitionHook(value: TransitionHook => js.Function0[Unit]): Self = StObject.set(x, "addTransitionHook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentLocation(value: () => TLocation): Self = StObject.set(x, "getCurrentLocation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldUpdateScroll(value: (/* prevContext */ TContext | Null, TContext) => ScrollTarget): Self = StObject.set(x, "shouldUpdateScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldUpdateScrollUndefined: Self = StObject.set(x, "shouldUpdateScroll", js.undefined)
      
      @scala.inline
      def setStateStorage(value: Read[TLocation]): Self = StObject.set(x, "stateStorage", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollPosition = js.Tuple2[Double, Double]
  
  type ScrollTarget = js.UndefOr[ScrollPosition | String | Boolean | Null]
  
  type ShouldUpdateScroll[TContext] = js.Function2[/* prevContext */ TContext | Null, /* context */ TContext, ScrollTarget]
  
  type TransitionHook = js.Function0[Unit]
}
