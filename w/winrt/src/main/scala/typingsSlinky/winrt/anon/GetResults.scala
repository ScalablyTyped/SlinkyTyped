package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResults[TResult] extends js.Object {
  
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult] = js.native
  
  def getResults(): TResult = js.native
}
