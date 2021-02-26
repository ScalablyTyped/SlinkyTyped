package typingsSlinky.zeroclipboard

import typingsSlinky.zeroclipboard.ZC.Dictionary
import typingsSlinky.zeroclipboard.ZC.EventListenerOrEventListenerObject
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardAfterCopyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardBeforeCopyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardCopyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardDestroyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardErrorEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardReadyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Aftercopy extends StObject {
    
    var aftercopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.native
    
    var beforecopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.native
    
    var copy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.native
    
    var destroy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.native
    
    var error: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.native
    
    var ready: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.native
  }
  object Aftercopy {
    
    @scala.inline
    def apply(): Aftercopy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aftercopy]
    }
    
    @scala.inline
    implicit class AftercopyMutableBuilder[Self <: Aftercopy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAftercopy(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]): Self = StObject.set(x, "aftercopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAftercopyFunction1(value: ZeroClipboardAfterCopyEvent => Unit): Self = StObject.set(x, "aftercopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAftercopyUndefined: Self = StObject.set(x, "aftercopy", js.undefined)
      
      @scala.inline
      def setBeforecopy(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]): Self = StObject.set(x, "beforecopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforecopyFunction1(value: ZeroClipboardBeforeCopyEvent => Unit): Self = StObject.set(x, "beforecopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforecopyUndefined: Self = StObject.set(x, "beforecopy", js.undefined)
      
      @scala.inline
      def setCopy(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyFunction1(value: ZeroClipboardCopyEvent => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDestroy(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyFunction1(value: ZeroClipboardDestroyEvent => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setError(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction1(value: ZeroClipboardErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setReady(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyFunction1(value: ZeroClipboardReadyEvent => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  @js.native
  trait Beforecopy extends StObject {
    
    var aftercopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]] = js.native
    
    var beforecopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]] = js.native
    
    var copy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]] = js.native
    
    var destroy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]] = js.native
    
    var error: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]] = js.native
    
    var ready: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]] = js.native
  }
  object Beforecopy {
    
    @scala.inline
    def apply(): Beforecopy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Beforecopy]
    }
    
    @scala.inline
    implicit class BeforecopyMutableBuilder[Self <: Beforecopy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAftercopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]): Self = StObject.set(x, "aftercopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAftercopyUndefined: Self = StObject.set(x, "aftercopy", js.undefined)
      
      @scala.inline
      def setAftercopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]*): Self = StObject.set(x, "aftercopy", js.Array(value :_*))
      
      @scala.inline
      def setBeforecopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]): Self = StObject.set(x, "beforecopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforecopyUndefined: Self = StObject.set(x, "beforecopy", js.undefined)
      
      @scala.inline
      def setBeforecopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]*): Self = StObject.set(x, "beforecopy", js.Array(value :_*))
      
      @scala.inline
      def setCopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setCopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]*): Self = StObject.set(x, "copy", js.Array(value :_*))
      
      @scala.inline
      def setDestroy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDestroyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]*): Self = StObject.set(x, "destroy", js.Array(value :_*))
      
      @scala.inline
      def setError(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrorVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setReady(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      @scala.inline
      def setReadyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]*): Self = StObject.set(x, "ready", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ClearData extends StObject {
    
    def clearData(): Unit = js.native
    def clearData(mimeType: String): Unit = js.native
    
    def setData(data: Dictionary[String]): Unit = js.native
    def setData(format: String, data: String): Unit = js.native
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, `type`: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
