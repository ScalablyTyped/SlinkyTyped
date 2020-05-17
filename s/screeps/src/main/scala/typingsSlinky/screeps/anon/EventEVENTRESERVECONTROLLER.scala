package typingsSlinky.screeps.anon

import typingsSlinky.screeps.EVENT_RESERVE_CONTROLLER
import typingsSlinky.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEVENTRESERVECONTROLLER extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any = js.native
  var event: EVENT_RESERVE_CONTROLLER = js.native
  var objectId: String = js.native
}

object EventEVENTRESERVECONTROLLER {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any,
    event: EVENT_RESERVE_CONTROLLER,
    objectId: String
  ): EventEVENTRESERVECONTROLLER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTRESERVECONTROLLER]
  }
  @scala.inline
  implicit class EventEVENTRESERVECONTROLLEROps[Self <: EventEVENTRESERVECONTROLLER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: EVENT_RESERVE_CONTROLLER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

