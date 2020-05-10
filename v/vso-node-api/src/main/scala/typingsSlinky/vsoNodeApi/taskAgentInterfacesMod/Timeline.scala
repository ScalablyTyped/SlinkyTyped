package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeline extends TimelineReference {
  var lastChangedBy: String = js.native
  var lastChangedOn: js.Date = js.native
  var records: js.Array[TimelineRecord] = js.native
}

object Timeline {
  @scala.inline
  def apply(
    changeId: Double,
    id: String,
    lastChangedBy: String,
    lastChangedOn: js.Date,
    location: String,
    records: js.Array[TimelineRecord]
  ): Timeline = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
  @scala.inline
  implicit class TimelineOps[Self <: Timeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastChangedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChangedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: js.Array[TimelineRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

