package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTaskLogUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: Double = js.native
  var lines: js.Array[String] = js.native
  var timelineRecordId: String = js.native
}

object ReleaseTaskLogUpdatedEvent {
  @scala.inline
  def apply(
    environmentId: Double,
    lines: js.Array[String],
    projectId: String,
    releaseId: Double,
    timelineRecordId: String
  ): ReleaseTaskLogUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTaskLogUpdatedEvent]
  }
  @scala.inline
  implicit class ReleaseTaskLogUpdatedEventOps[Self <: ReleaseTaskLogUpdatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
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

