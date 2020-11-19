package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.AsyncOperationProgressHandler
import typingsSlinky.winrtUwp.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the retrieval of messages. */
@js.native
trait GetSmsMessagesOperation extends js.Object {
  
  /** Cancels the asynchronous operations. */
  def cancel(): Unit = js.native
  
  /** Closes the asynchronous operations. */
  def close(): Unit = js.native
  
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[_], Double], asyncStatus: AsyncStatus): Unit = js.native
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[_], Double] = js.native
  
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError = js.native
  
  /**
    * Retrieves the result of the asynchronous message retrieval operation.
    * @return A reference to the SMS messages retrieved.
    */
  def getResults(): IVectorView[ISmsMessage] = js.native
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double = js.native
  
  /** Specifies the progress status of the asynchronous message operation. */
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[_], Double], progressInfo: Double): Unit = js.native
  /** Specifies the progress status of the asynchronous message operation. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[_], Double] = js.native
  
  /** Specifies the status of the asynchronous message operations. */
  var status: AsyncStatus = js.native
}
