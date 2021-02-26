package typingsSlinky.semanticUiReactEventStack

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import typingsSlinky.semanticUiReactEventStack.anon.Called
import typingsSlinky.std.EventListener
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type CallableEventListener = EventListener with Called
  
  type EventListeners = js.Array[CallableEventListener]
  
  type GenericMap[T] = Map[String, T]
  
  type InputEventListener = EventListener | js.Array[EventListener]
  
  type InputTargetElement = Boolean | String | TargetElement | ReactRef[TargetElement]
  
  @js.native
  trait Options extends StObject {
    
    var pool: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[InputTargetElement] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setTarget(value: InputTargetElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDocument(value: Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefObject(value: ReactRef[TargetElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetWindow(value: Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetElement = Document | HTMLElement | Window
}
