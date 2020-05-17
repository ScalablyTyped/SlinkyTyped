package typingsSlinky.winrt.Windows.Foundation

import typingsSlinky.winrt.anon.Completed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperationWithProgress[TResult, TProgress] extends IPromise[TResult] {
  var operation: Completed[TResult, TProgress] = js.native
}

