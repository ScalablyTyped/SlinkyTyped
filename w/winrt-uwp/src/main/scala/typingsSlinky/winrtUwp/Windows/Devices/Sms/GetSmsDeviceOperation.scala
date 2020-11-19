package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus
import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves an SmsDevice object asynchronously. */
@js.native
trait GetSmsDeviceOperation extends js.Object {
  
  /** Cancels the asynchronous SmsDevice object retrieval. */
  def cancel(): Unit = js.native
  
  /** Closes the asynchronous SmsDevice object retrieval operation. */
  def close(): Unit = js.native
  
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  
  /** Specifies the error code for the asynchronous SmsDevice object retrieval operation */
  var errorCode: WinRTError = js.native
  
  /**
    * Gets the results of the asynchronous SmsDevice object retrieval operation.
    * @return A reference to an SmsDevice object.
    */
  def getResults(): SmsDevice = js.native
  
  /** Specifies the ID of the asynchronous SmsDevice object retrieval operation. */
  var id: Double = js.native
  
  /** Specifies the status of the asynchronous SmsDevice object retrieval operation. */
  var status: AsyncStatus = js.native
}
