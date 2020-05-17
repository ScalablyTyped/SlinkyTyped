package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordInserted extends IEventArgs {
  var afterRecordKey: Double = js.native
  var changeKey: IChangeKey = js.native
  var recordIdx: Double = js.native
  var recordKey: Double = js.native
}

object RecordInserted {
  @scala.inline
  def apply(afterRecordKey: Double, changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordInserted = {
    val __obj = js.Dynamic.literal(afterRecordKey = afterRecordKey.asInstanceOf[js.Any], changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordInserted]
  }
  @scala.inline
  implicit class RecordInsertedOps[Self <: RecordInserted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRecordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeKey(value: IChangeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIdx")(value.asInstanceOf[js.Any])
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

