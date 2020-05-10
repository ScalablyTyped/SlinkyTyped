package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleLogEvent extends RealtimeBuildEvent {
  var lines: js.Array[String] = js.native
  var timelineId: String = js.native
  var timelineRecordId: String = js.native
}

object ConsoleLogEvent {
  @scala.inline
  def apply(buildId: Double, lines: js.Array[String], timelineId: String, timelineRecordId: String): ConsoleLogEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleLogEvent]
  }
  @scala.inline
  implicit class ConsoleLogEventOps[Self <: ConsoleLogEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineRecordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineRecordId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

