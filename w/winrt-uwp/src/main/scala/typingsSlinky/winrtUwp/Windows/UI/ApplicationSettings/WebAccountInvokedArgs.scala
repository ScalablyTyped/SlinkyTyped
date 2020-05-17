package typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the WebAccountCommandInvokedHandler delegate. */
@js.native
trait WebAccountInvokedArgs extends js.Object {
  /** Gets the action for the web account in the accounts pane. */
  var action: WebAccountAction = js.native
}

object WebAccountInvokedArgs {
  @scala.inline
  def apply(action: WebAccountAction): WebAccountInvokedArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountInvokedArgs]
  }
  @scala.inline
  implicit class WebAccountInvokedArgsOps[Self <: WebAccountInvokedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: WebAccountAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

