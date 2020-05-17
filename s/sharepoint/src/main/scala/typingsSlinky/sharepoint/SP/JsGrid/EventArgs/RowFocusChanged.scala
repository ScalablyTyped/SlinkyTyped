package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowFocusChanged extends IEventArgs {
  var newRecordKey: Double = js.native
  var oldRecordKey: Double = js.native
}

object RowFocusChanged {
  @scala.inline
  def apply(newRecordKey: Double, oldRecordKey: Double): RowFocusChanged = {
    val __obj = js.Dynamic.literal(newRecordKey = newRecordKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFocusChanged]
  }
  @scala.inline
  implicit class RowFocusChangedOps[Self <: RowFocusChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRecordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRecordKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

