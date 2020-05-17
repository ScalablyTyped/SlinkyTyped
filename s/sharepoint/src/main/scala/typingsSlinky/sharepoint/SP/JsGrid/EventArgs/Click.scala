package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import typingsSlinky.sharepoint.SP.JsGrid.ClickContext
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Click extends IEventArgs {
  var context: ClickContext = js.native
  var eventInfo: DomEvent = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

object Click {
  @scala.inline
  def apply(context: ClickContext, eventInfo: DomEvent, fieldKey: String, recordKey: Double): Click = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], eventInfo = eventInfo.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
  @scala.inline
  implicit class ClickOps[Self <: Click] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: ClickContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
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

