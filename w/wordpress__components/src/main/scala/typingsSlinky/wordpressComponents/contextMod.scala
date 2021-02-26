package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.wordpressComponents.anon.Componentanyoccurrencenum
import typingsSlinky.wordpressElement.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("@wordpress/components/slot-fill/context", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  @JSImport("@wordpress/components/slot-fill/context", "Consumer")
  @js.native
  val Consumer: ReactComponentClass[ConsumerProps[SlotFillContext]] = js.native
  
  @js.native
  trait SlotFillContext extends StObject {
    
    def getFills(name: String, instance: Component[js.Object, js.Object, _]): js.Array[Componentanyoccurrencenum] = js.native
    
    def getSlot(name: String): Component[js.Object, js.Object, _] = js.native
    
    // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
    def registerFill(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
    
    def registerSlot(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
    
    // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
    def unregisterFill(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
    
    def unregisterSlot(name: String, instance: Component[js.Object, js.Object, _]): Unit = js.native
  }
  object SlotFillContext {
    
    @scala.inline
    def apply(
      getFills: (String, Component[js.Object, js.Object, _]) => js.Array[Componentanyoccurrencenum],
      getSlot: String => Component[js.Object, js.Object, _],
      registerFill: (String, Component[js.Object, js.Object, _]) => Unit,
      registerSlot: (String, Component[js.Object, js.Object, _]) => Unit,
      unregisterFill: (String, Component[js.Object, js.Object, _]) => Unit,
      unregisterSlot: (String, Component[js.Object, js.Object, _]) => Unit
    ): SlotFillContext = {
      val __obj = js.Dynamic.literal(getFills = js.Any.fromFunction2(getFills), getSlot = js.Any.fromFunction1(getSlot), registerFill = js.Any.fromFunction2(registerFill), registerSlot = js.Any.fromFunction2(registerSlot), unregisterFill = js.Any.fromFunction2(unregisterFill), unregisterSlot = js.Any.fromFunction2(unregisterSlot))
      __obj.asInstanceOf[SlotFillContext]
    }
    
    @scala.inline
    implicit class SlotFillContextMutableBuilder[Self <: SlotFillContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFills(value: (String, Component[js.Object, js.Object, _]) => js.Array[Componentanyoccurrencenum]): Self = StObject.set(x, "getFills", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSlot(value: String => Component[js.Object, js.Object, _]): Self = StObject.set(x, "getSlot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterFill(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = StObject.set(x, "registerFill", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterSlot(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = StObject.set(x, "registerSlot", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnregisterFill(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = StObject.set(x, "unregisterFill", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnregisterSlot(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = StObject.set(x, "unregisterSlot", js.Any.fromFunction2(value))
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
