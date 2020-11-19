package typingsSlinky.winrtUwp.Windows.Security.Authentication.OnlineId

import typingsSlinky.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus
import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows users to sign out of your app. */
@js.native
trait SignOutUserOperation extends js.Object {
  
  /** Requests the cancellation of the operation. */
  def cancel(): Unit = js.native
  
  /** Requests that work associated with the operation should terminate. */
  def close(): Unit = js.native
  
  /** Gets or sets a handler that is called when the operation completes. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** Gets or sets a handler that is called when the operation completes. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  
  /** Gets the error code should the operation fail. */
  var errorCode: WinRTError = js.native
  
  /** Returns the results of the operation. For this class, there are no results to return if the operation succeeds. */
  def getResults(): Unit = js.native
  
  /** Gets a unique identifier that represents the operation. */
  var id: Double = js.native
  
  /** Gets the current status of the operation. */
  var status: AsyncStatus = js.native
}
