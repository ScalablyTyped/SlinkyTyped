package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBeginUndoDataUpdateChange extends IEventArgs {
  var changeKey: IChangeKey = js.native
}

object OnBeginUndoDataUpdateChange {
  @scala.inline
  def apply(changeKey: IChangeKey): OnBeginUndoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginUndoDataUpdateChange]
  }
  @scala.inline
  implicit class OnBeginUndoDataUpdateChangeOps[Self <: OnBeginUndoDataUpdateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeKey(value: IChangeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

