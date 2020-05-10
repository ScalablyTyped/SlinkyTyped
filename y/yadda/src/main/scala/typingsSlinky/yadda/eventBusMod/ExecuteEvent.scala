package typingsSlinky.yadda.eventBusMod

import typingsSlinky.yadda.yaddaStrings.__ON_EXECUTE__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteEvent extends js.Object {
  var data: ExecuteEventData = js.native
  var name: __ON_EXECUTE__ = js.native
}

object ExecuteEvent {
  @scala.inline
  def apply(data: ExecuteEventData, name: __ON_EXECUTE__): ExecuteEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteEvent]
  }
  @scala.inline
  implicit class ExecuteEventOps[Self <: ExecuteEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ExecuteEventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: __ON_EXECUTE__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

