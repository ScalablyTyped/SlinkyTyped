package typingsSlinky.winrt

import typingsSlinky.winrt.Windows.Devices.Sms.ISmsMessage
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompletedAsyncOperationCompletedHandler extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): ISmsMessage = js.native
}

