package typingsSlinky.winrt.Windows.Foundation

import typingsSlinky.winrt.Anon_Completed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperationWithProgress[TResult, TProgress] extends IPromise[TResult] {
  var operation: Anon_Completed[TResult, TProgress] = js.native
}

