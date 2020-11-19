package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataReaderLoadOperation
  extends IAsyncOperation[Double]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  
  def getResults(): Double = js.native
  
  @JSName("operation")
  var operation_DataReaderLoadOperation: `7` = js.native
}
