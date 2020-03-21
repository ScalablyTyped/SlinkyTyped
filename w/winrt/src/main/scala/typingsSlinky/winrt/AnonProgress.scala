package typingsSlinky.winrt

import typingsSlinky.winrt.Windows.Devices.Sms.ISmsMessage
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProgress extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[IVectorView[ISmsMessage]] = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double] = js.native
  def completed(asyncInfo: IAsyncOperation[IVectorView[ISmsMessage]], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): IVectorView[ISmsMessage] = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit = js.native
}

