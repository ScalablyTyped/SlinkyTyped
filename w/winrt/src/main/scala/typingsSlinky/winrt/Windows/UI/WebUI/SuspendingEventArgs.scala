package typingsSlinky.winrt.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.ISuspendingEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspendingEventArgs extends ISuspendingEventArgs

object SuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: typingsSlinky.winrt.Windows.ApplicationModel.SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
}

