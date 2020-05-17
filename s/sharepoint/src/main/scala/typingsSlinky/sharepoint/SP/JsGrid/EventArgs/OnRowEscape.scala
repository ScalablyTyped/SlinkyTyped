package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRowEscape extends IEventArgs {
  var recordKey: Double = js.native
}

object OnRowEscape {
  @scala.inline
  def apply(recordKey: Double): OnRowEscape = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowEscape]
  }
  @scala.inline
  implicit class OnRowEscapeOps[Self <: OnRowEscape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

