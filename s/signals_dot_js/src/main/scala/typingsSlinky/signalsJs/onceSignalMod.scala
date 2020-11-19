package typingsSlinky.signalsJs

import typingsSlinky.signalsJs.ioncesignalMod.IOnceSignal
import typingsSlinky.signalsJs.islotMod.ISlot
import typingsSlinky.signalsJs.slotListMod.SlotList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signals.js/lib/org/osflash/signals/OnceSignal", JSImport.Namespace)
@js.native
object onceSignalMod extends js.Object {
  
  @js.native
  class OnceSignal protected () extends IOnceSignal {
    /**
      * Creates a Signal instance to dispatch value objects.
      * @param    valueClasses Any number of class references that enable type checks in dispatch().
      * For example, new Signal(String, uint)
      * would allow: signal.dispatch("the Answer", 42)
      * but not: signal.dispatch(true, 42.5)
      * nor: signal.dispatch()
      *
      * NOTE: In AS3, subclasses cannot call super.apply(null, valueClasses),
      * but this constructor has logic to support super(valueClasses).
      */
    def this(valueClasses: js.Any*) = this()
    
    var _valueClasses: js.Array[_] = js.native
    
    /* protected */ def registerListener(listener: js.Function): ISlot = js.native
    /* protected */ def registerListener(listener: js.Function, once: Boolean): ISlot = js.native
    
    /* protected */ def registrationPossible(listener: js.Function, once: Boolean): Boolean = js.native
    
    var slots: SlotList = js.native
  }
}
