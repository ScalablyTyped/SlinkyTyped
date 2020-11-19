package typingsSlinky.signalsJs

import typingsSlinky.signalsJs.islotMod.ISlot
import typingsSlinky.signalsJs.signalMod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signals.js/lib/org/osflash/signals/PrioritySignal", JSImport.Namespace)
@js.native
object prioritySignalMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.signalsJs.ioncesignalMod.IOnceSignal because Already inherited
  - typingsSlinky.signalsJs.isignalMod.ISignal because Already inherited
  - typingsSlinky.signalsJs.iprioritysignalMod.IPrioritySignal because var conflicts: numListeners, valueClasses. Inlined addWithPriority, addOnceWithPriority */ @js.native
  class PrioritySignal protected () extends Signal {
    def this(valueClasses: js.Any*) = this()
    
    /**
      * @inheritDoc
      * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
      * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
      */
    def addOnceWithPriority(listener: js.Function): ISlot = js.native
    /**
      * Subscribes a one-time listener for this signal.
      * The signal will remove the listener automatically the first time it is called,
      * after the dispatch to all listeners is complete.
      * @param    listener A function with an argument
      * that matches the type of event dispatched by the signal.
      * If eventClass is not specified, the listener and dispatch() can be called without an argument.
      * @param    priority The priority level of the event listener.
      * The priority is designated by a signed 32-bit integer.
      * The higher the number, the higher the priority.
      * All listeners with priority n are processed before listeners of priority n-1.
      * @return a ISlot, which contains the Function passed as the parameter
      * @see ISlot
      */
    def addOnceWithPriority(listener: js.Function, priority: Double): ISlot = js.native
    
    /**
      * @inheritDoc
      * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
      * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
      */
    def addWithPriority(listener: js.Function): ISlot = js.native
    /**
      * Subscribes a listener for the signal.
      * After you successfully register an event listener,
      * you cannot change its priority through additional calls to add().
      * To change a listener's priority, you must first call remove().
      * Then you can register the listener again with the new priority level.
      * @param    listener A function with an argument
      * that matches the type of event dispatched by the signal.
      * If eventClass is not specified, the listener and dispatch() can be called without an argument.
      * @return a ISlot, which contains the Function passed as the parameter
      * @see ISlot
      */
    def addWithPriority(listener: js.Function, priority: Double): ISlot = js.native
    
    /* protected */ def registerListenerWithPriority(listener: js.Function): ISlot = js.native
    /* protected */ def registerListenerWithPriority(listener: js.Function, once: js.UndefOr[scala.Nothing], priority: Double): ISlot = js.native
    /* protected */ def registerListenerWithPriority(listener: js.Function, once: Boolean): ISlot = js.native
    /* protected */ def registerListenerWithPriority(listener: js.Function, once: Boolean, priority: Double): ISlot = js.native
  }
}
