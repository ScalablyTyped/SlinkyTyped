package typingsSlinky.winrt

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompletedGetResults extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[_] = js.native
  def completed(asyncInfo: IAsyncOperation[_], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): js.Any = js.native
}

