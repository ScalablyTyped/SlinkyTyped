package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Anon7
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataWriterStoreOperation")
@js.native
class DataWriterStoreOperation ()
  extends IAsyncOperation[Double]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  @JSName("operation")
  var operation_DataWriterStoreOperation: Anon7 = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): Double = js.native
}

