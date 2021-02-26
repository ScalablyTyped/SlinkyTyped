package typingsSlinky.sipJs

import typingsSlinky.sipJs.anon.Once
import typingsSlinky.sipJs.coreExceptionsMod.TransportError
import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.logMod.Logger
import typingsSlinky.sipJs.transactionStateMod.TransactionState
import typingsSlinky.sipJs.transactionUserMod.TransactionUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("sip.js/lib/core/transactions/transaction", "Transaction")
  @js.native
  abstract class Transaction protected () extends StObject {
    protected def this(
      _transport: Transport,
      _user: TransactionUser,
      _id: String,
      _state: TransactionState,
      loggerCategory: String
    ) = this()
    
    var _id: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _transport: js.Any = js.native
    
    var _user: js.Any = js.native
    
    /**
      * Sets up a function that will be called whenever the transaction state changes.
      * @param listener - Callback function.
      * @param options - An options object that specifies characteristics about the listener.
      *                  If once true, indicates that the listener should be invoked at most once after being added.
      *                  If once true, the listener would be automatically removed when invoked.
      */
    def addStateChangeListener(listener: js.Function0[Unit]): Unit = js.native
    def addStateChangeListener(listener: js.Function0[Unit], options: Once): Unit = js.native
    
    /**
      * Destructor.
      * Once the transaction is in the "terminated" state, it is destroyed
      * immediately and there is no need to call `dispose`. However, if a
      * transaction needs to be ended prematurely, the transaction user may
      * do so by calling this method (for example, perhaps the UA is shutting down).
      * No state transition will occur upon calling this method, all outstanding
      * transmission timers will be cancelled, and use of the transaction after
      * calling `dispose` is undefined.
      */
    def dispose(): Unit = js.native
    
    /** Transaction id. */
    def id: String = js.native
    
    /** Transaction kind. Deprecated. */
    def kind: String = js.native
    
    var listeners: js.Any = js.native
    
    /* protected */ def logTransportError(error: TransportError, message: String): Unit = js.native
    
    var logger: Logger = js.native
    
    /**
      * This is currently public so tests may spy on it.
      * @internal
      */
    def notifyStateChangeListeners(): Unit = js.native
    
    /* protected */ def onTransportError(error: TransportError): Unit = js.native
    
    /**
      * Removes a listener previously registered with addStateListener.
      * @param listener - Callback function.
      */
    def removeStateChangeListener(listener: js.Function0[Unit]): Unit = js.native
    
    /**
      * Pass message to transport for transmission. If transport fails,
      * the transaction user is notified by callback to onTransportError().
      * @returns
      * Rejects with `TransportError` if transport fails.
      */
    /* protected */ def send(message: String): js.Promise[Unit] = js.native
    
    /* protected */ def setState(state: TransactionState): Unit = js.native
    
    /** Transaction state. */
    def state: TransactionState = js.native
    
    /** Transaction transport. */
    def transport: Transport = js.native
    
    /* protected */ def typeToString(): String = js.native
  }
}
