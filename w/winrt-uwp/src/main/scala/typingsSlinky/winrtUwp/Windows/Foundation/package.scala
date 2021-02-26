package typingsSlinky.winrtUwp.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Foundation {
  
  /** Represents a method that handles the completed event of an asynchronous action. */
  type AsyncActionCompletedHandler = js.Function2[
    /* asyncInfo */ typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction, 
    /* asyncStatus */ typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles progress update events of an asynchronous action that provides progress updates. */
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ typingsSlinky.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of an asynchronous action that provides progress updates. */
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ typingsSlinky.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of an asynchronous operation. */
  type AsyncOperationCompletedHandler[TResult] = js.Function2[
    /* asyncInfo */ typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperation[TResult], 
    /* asyncStatus */ typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles progress update events of an asynchronous operation that provides progress updates. */
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of an asynchronous operation that provides progress updates. */
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of a deferred action. */
  type DeferralCompletedHandler = js.Function0[scala.Unit]
  
  /** Represents a method that handles general events. */
  type EventHandler[T] = js.Function1[/* ev */ T with typingsSlinky.winrtUwp.Windows.WinRTEvent[_], scala.Unit]
  
  type IPromiseWithIAsyncAction = typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithOperation[scala.Unit, typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction]
  
  type IPromiseWithIAsyncActionWithProgress[TProgress] = typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithOperation[
    scala.Unit, 
    typingsSlinky.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress]
  ]
  
  type IPromiseWithIAsyncOperation[TResult] = typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithOperation[TResult, typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperation[TResult]]
  
  type IPromiseWithIAsyncOperationWithProgress[TResult, TProgress] = typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithOperation[
    TResult, 
    typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress]
  ]
  
  /** Represents a method that handles general events. */
  type TypedEventHandler[TSender, TResult] = js.Function1[
    /* ev */ TResult with typingsSlinky.winrtUwp.Windows.WinRTEvent[TSender], 
    scala.Unit
  ]
}
