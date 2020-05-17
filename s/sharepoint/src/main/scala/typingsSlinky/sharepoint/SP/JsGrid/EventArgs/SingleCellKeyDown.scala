package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleCellKeyDown extends IEventArgs {
  var eventInfo: DomEvent = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

object SingleCellKeyDown {
  @scala.inline
  def apply(eventInfo: DomEvent, fieldKey: String, recordKey: Double): SingleCellKeyDown = {
    val __obj = js.Dynamic.literal(eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleCellKeyDown]
  }
  @scala.inline
  implicit class SingleCellKeyDownOps[Self <: SingleCellKeyDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventInfo(value: DomEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
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

