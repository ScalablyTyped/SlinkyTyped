package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.AnonCompletedGetResults
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
@js.native
class SendSmsMessageOperation () extends IAsyncAction {
  var operation: AnonCompletedGetResults = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](
    success: js.Function0[_],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
}

