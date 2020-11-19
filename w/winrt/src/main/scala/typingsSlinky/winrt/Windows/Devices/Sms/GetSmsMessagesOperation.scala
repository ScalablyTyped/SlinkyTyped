package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.anon.Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSmsMessagesOperation
  extends IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[ISmsMessage], Double] = js.native
  
  def getResults(): IVectorView[ISmsMessage] = js.native
  
  @JSName("operation")
  var operation_GetSmsMessagesOperation: Progress = js.native
  
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double] = js.native
}
