package typingsSlinky.winrt.Windows.Security.Authentication.OnlineId

import typingsSlinky.winrt.AnonCompletedGetResults
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.OnlineId.SignOutUserOperation")
@js.native
class SignOutUserOperation () extends IAsyncAction {
  var operation: AnonCompletedGetResults = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](success: js.Function0[_]): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](
    success: js.Function0[_],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
}

