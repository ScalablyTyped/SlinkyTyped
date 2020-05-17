package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SelectionRequested event. */
@js.native
trait CoreTextSelectionRequestedEventArgs extends js.Object {
  /** Gets information about a SelectionRequested event. */
  var request: CoreTextSelectionRequest = js.native
}

object CoreTextSelectionRequestedEventArgs {
  @scala.inline
  def apply(request: CoreTextSelectionRequest): CoreTextSelectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionRequestedEventArgs]
  }
  @scala.inline
  implicit class CoreTextSelectionRequestedEventArgsOps[Self <: CoreTextSelectionRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: CoreTextSelectionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

