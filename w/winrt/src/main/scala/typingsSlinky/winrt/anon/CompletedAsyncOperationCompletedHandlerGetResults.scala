package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedAsyncOperationCompletedHandlerGetResults extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  
  def getResults(): SmsDevice = js.native
}
