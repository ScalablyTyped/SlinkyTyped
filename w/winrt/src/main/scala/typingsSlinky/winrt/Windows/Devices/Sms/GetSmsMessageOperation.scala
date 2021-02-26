package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.anon.CompletedAsyncOperationCompletedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSmsMessageOperation
  extends IAsyncOperation[ISmsMessage]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  
  def getResults(): ISmsMessage = js.native
  
  @JSName("operation")
  var operation_GetSmsMessageOperation: CompletedAsyncOperationCompletedHandler = js.native
}
