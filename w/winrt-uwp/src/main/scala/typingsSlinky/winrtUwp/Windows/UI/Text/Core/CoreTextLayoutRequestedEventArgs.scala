package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the LayoutRequested event. */
@js.native
trait CoreTextLayoutRequestedEventArgs extends js.Object {
  /** Gets information about a LayoutRequested event. */
  var request: CoreTextLayoutRequest = js.native
}

object CoreTextLayoutRequestedEventArgs {
  @scala.inline
  def apply(request: CoreTextLayoutRequest): CoreTextLayoutRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutRequestedEventArgs]
  }
  @scala.inline
  implicit class CoreTextLayoutRequestedEventArgsOps[Self <: CoreTextLayoutRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: CoreTextLayoutRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

