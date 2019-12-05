package typingsSlinky.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingOperation extends js.Object {
  var deadline: js.Date
  def getDeferral(): SuspendingDeferral
}

object ISuspendingOperation {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => SuspendingDeferral): ISuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[ISuspendingOperation]
  }
}

