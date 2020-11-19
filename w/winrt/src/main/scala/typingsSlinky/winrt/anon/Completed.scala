package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completed[TResult, TProgress] extends js.Object {
  
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.native
  
  def getResults(): TResult = js.native
  
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress] = js.native
}
