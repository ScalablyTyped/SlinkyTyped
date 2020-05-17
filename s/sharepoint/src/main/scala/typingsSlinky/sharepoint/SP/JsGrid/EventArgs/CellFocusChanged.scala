package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellFocusChanged extends IEventArgs {
  var newFieldKey: String = js.native
  var newRecordKey: Double = js.native
  var oldFieldKey: String = js.native
  var oldRecordKey: Double = js.native
}

object CellFocusChanged {
  @scala.inline
  def apply(newFieldKey: String, newRecordKey: Double, oldFieldKey: String, oldRecordKey: Double): CellFocusChanged = {
    val __obj = js.Dynamic.literal(newFieldKey = newFieldKey.asInstanceOf[js.Any], newRecordKey = newRecordKey.asInstanceOf[js.Any], oldFieldKey = oldFieldKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusChanged]
  }
  @scala.inline
  implicit class CellFocusChangedOps[Self <: CellFocusChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFieldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRecordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFieldKey")(value.asInstanceOf[js.Any])
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

