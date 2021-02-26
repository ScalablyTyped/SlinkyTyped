package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Devices.Sms.ISmsMessage
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedAsyncOperationCompletedHandler extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  
  def getResults(): ISmsMessage = js.native
}
