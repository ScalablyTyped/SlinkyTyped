package typingsSlinky.signalsJs.iprioritysignalMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.signalsJs.isignalMod.ISignal
import typingsSlinky.signalsJs.islotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrioritySignal extends ISignal {
  
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
}
@JSImport("signals.js/lib/org/osflash/signals/IPrioritySignal", "IPrioritySignal")
@js.native
object IPrioritySignal
  extends TopLevel[js.Symbol]
