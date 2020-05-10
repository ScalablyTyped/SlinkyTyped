package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.AnonCompletedAsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
@js.native
class GetSmsMessageOperation ()
  extends IAsyncOperation[ISmsMessage]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  @JSName("operation")
  var operation_GetSmsMessageOperation: AnonCompletedAsyncOperationCompletedHandler = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): ISmsMessage = js.native
}

