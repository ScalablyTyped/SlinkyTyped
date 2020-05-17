package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridErrorStateChanged extends IEventArgs {
  var bAnyErrors: Boolean = js.native
}

object GridErrorStateChanged {
  @scala.inline
  def apply(bAnyErrors: Boolean): GridErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAnyErrors = bAnyErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridErrorStateChanged]
  }
  @scala.inline
  implicit class GridErrorStateChangedOps[Self <: GridErrorStateChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAnyErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAnyErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

