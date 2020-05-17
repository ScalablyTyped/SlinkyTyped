package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEntryRecordCommitted extends IEventArgs {
  var changeKey: IChangeKey = js.native
  var originalRecordKey: Double = js.native
  var recordKey: Double = js.native
}

object OnEntryRecordCommitted {
  @scala.inline
  def apply(changeKey: IChangeKey, originalRecordKey: Double, recordKey: Double): OnEntryRecordCommitted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], originalRecordKey = originalRecordKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordCommitted]
  }
  @scala.inline
  implicit class OnEntryRecordCommittedOps[Self <: OnEntryRecordCommitted] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOriginalRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRecordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

