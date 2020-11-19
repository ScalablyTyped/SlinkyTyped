package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.anon.CompletedAsyncOperationCompletedHandlerGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSmsDeviceOperation
  extends IAsyncOperation[SmsDevice]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  
  def getResults(): SmsDevice = js.native
  
  @JSName("operation")
  var operation_GetSmsDeviceOperation: CompletedAsyncOperationCompletedHandlerGetResults = js.native
}
