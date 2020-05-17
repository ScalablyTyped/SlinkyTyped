package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Security.Authentication.OnlineId.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `6` extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
  def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): UserIdentity = js.native
}

