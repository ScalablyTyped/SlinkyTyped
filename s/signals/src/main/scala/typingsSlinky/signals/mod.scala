package typingsSlinky.signals

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("signals", JSImport.Namespace)
  @js.native
  val ^ : SignalWrapper[js.Any] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("signals", "Signal")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  class SignalCls ()
    extends Signal[js.Any]
  
  @js.native
  trait Signal[T]
    extends /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  Instantiable0[Signal[T]] {
    
    /**
      * Signals Version Number
      */
    var VERSION: String = js.native
    
    /**
      * If Signal is active and should broadcast events.
      */
    var active: Boolean = js.native
    
    /**
      * Add a listener to the signal.
      *
      * @param listener Signal handler function.
      * @param listenercontext Context on which listener will be executed (object that should represent the `this` variable inside listener function).
      * @param priority The priority level of the event listener.
      *        Listeners with higher priority will be executed before listeners with lower priority.
      *        Listeners with same priority level will be executed at the same order as they were added. (default = 0)
      */
    def add(listener: js.Function1[/* repeated */ T, Unit]): SignalBinding[T] = js.native
    def add(
      listener: js.Function1[/* repeated */ T, Unit],
      listenerContext: js.UndefOr[scala.Nothing],
      priority: Number
    ): SignalBinding[T] = js.native
    def add(listener: js.Function1[/* repeated */ T, Unit], listenerContext: js.Any): SignalBinding[T] = js.native
    def add(listener: js.Function1[/* repeated */ T, Unit], listenerContext: js.Any, priority: Number): SignalBinding[T] = js.native
    
    /**
      * Add listener to the signal that should be removed after first execution (will be executed only once).
      *
      * @param listener Signal handler function.
      * @param listenercontext Context on which listener will be executed (object that should represent the `this` variable inside listener function).
      * @param priority The priority level of the event listener.
      *                 Listeners with higher priority will be executed before listeners with lower priority.
      *                 Listeners with same priority level will be executed at the same order as they were added. (default = 0)
      */
    def addOnce(listener: js.Function1[/* repeated */ T, Unit]): SignalBinding[T] = js.native
    def addOnce(
      listener: js.Function1[/* repeated */ T, Unit],
      listenerContext: js.UndefOr[scala.Nothing],
      priority: Number
    ): SignalBinding[T] = js.native
    def addOnce(listener: js.Function1[/* repeated */ T, Unit], listenerContext: js.Any): SignalBinding[T] = js.native
    def addOnce(listener: js.Function1[/* repeated */ T, Unit], listenerContext: js.Any, priority: Number): SignalBinding[T] = js.native
    
    /**
      * Dispatch/Broadcast Signal to all listeners added to the queue.
      *
      * @param params Parameters that should be passed to each handler.
      */
    def dispatch(params: T*): Unit = js.native
    
    /**
      * Remove all bindings from signal and destroy any reference to external objects (destroy Signal object).
      */
    def dispose(): Unit = js.native
    
    /**
      * Forget memorized arguments.
      */
    def forget(): Unit = js.native
    
    /**
      * Returns a number of listeners attached to the Signal.
      */
    def getNumListeners(): Double = js.native
    
    /**
      * Stop propagation of the event, blocking the dispatch to next listeners on the queue.
      */
    def halt(): Unit = js.native
    
    /**
      * Check if listener was attached to Signal.
      */
    def has(listener: js.Function1[/* repeated */ T, Unit]): Boolean = js.native
    def has(listener: js.Function1[/* repeated */ T, Unit], context: js.Any): Boolean = js.native
    
    /**
      * If Signal should keep record of previously dispatched parameters and automatically
      * execute listener during add()/addOnce() if Signal was already dispatched before.
      */
    var memorize: Boolean = js.native
    
    /**
      * Remove a single listener from the dispatch queue.
      */
    def remove(listener: js.Function1[/* repeated */ T, Unit]): js.Function = js.native
    def remove(listener: js.Function1[/* repeated */ T, Unit], context: js.Any): js.Function = js.native
    
    def removeAll(): Unit = js.native
  }
  
  @js.native
  trait SignalBinding[T] extends StObject {
    
    var active: Boolean = js.native
    
    var context: js.Any = js.native
    
    def detach(): js.Function = js.native
    
    def execute(): js.Any = js.native
    def execute(paramsArr: js.Array[_]): js.Any = js.native
    
    def getListener(): js.Function1[/* repeated */ T, Unit] = js.native
    
    def getSignal(): Signal[T] = js.native
    
    def isBound(): Boolean = js.native
    
    def isOnce(): Boolean = js.native
    
    var params: js.Any = js.native
  }
  
  @js.native
  trait SignalWrapper[T] extends StObject {
    
    var Signal: typingsSlinky.signals.mod.Signal[T] = js.native
  }
  object SignalWrapper {
    
    @scala.inline
    def apply[T](Signal: Signal[T]): SignalWrapper[T] = {
      val __obj = js.Dynamic.literal(Signal = Signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalWrapper[T]]
    }
    
    @scala.inline
    implicit class SignalWrapperMutableBuilder[Self <: SignalWrapper[_], T] (val x: Self with SignalWrapper[T]) extends AnyVal {
      
      @scala.inline
      def setSignal(value: Signal[T]): Self = StObject.set(x, "Signal", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SignalWrapper[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SignalWrapper[js.Any] = ^
}
