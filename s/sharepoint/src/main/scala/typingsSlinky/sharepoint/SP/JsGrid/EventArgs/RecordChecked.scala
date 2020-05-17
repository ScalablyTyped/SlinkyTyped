package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import typingsSlinky.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordChecked extends IEventArgs {
  var bChecked: Boolean = js.native
  var recordKeySet: Set = js.native
}

object RecordChecked {
  @scala.inline
  def apply(bChecked: Boolean, recordKeySet: Set): RecordChecked = {
    val __obj = js.Dynamic.literal(bChecked = bChecked.asInstanceOf[js.Any], recordKeySet = recordKeySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordChecked]
  }
  @scala.inline
  implicit class RecordCheckedOps[Self <: RecordChecked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordKeySet(value: Set): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKeySet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

