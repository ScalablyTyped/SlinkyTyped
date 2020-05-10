package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTask extends js.Object {
  var agentName: String = js.native
  var dateEnded: js.Date = js.native
  var dateStarted: js.Date = js.native
  var finishTime: js.Date = js.native
  var id: Double = js.native
  var issues: js.Array[Issue] = js.native
  var lineCount: Double = js.native
  var logUrl: String = js.native
  var name: String = js.native
  var percentComplete: Double = js.native
  var rank: Double = js.native
  var startTime: js.Date = js.native
  var status: TaskStatus = js.native
  var task: WorkflowTaskReference = js.native
  var timelineRecordId: String = js.native
}

object ReleaseTask {
  @scala.inline
  def apply(
    agentName: String,
    dateEnded: js.Date,
    dateStarted: js.Date,
    finishTime: js.Date,
    id: Double,
    issues: js.Array[Issue],
    lineCount: Double,
    logUrl: String,
    name: String,
    percentComplete: Double,
    rank: Double,
    startTime: js.Date,
    status: TaskStatus,
    task: WorkflowTaskReference,
    timelineRecordId: String
  ): ReleaseTask = {
    val __obj = js.Dynamic.literal(agentName = agentName.asInstanceOf[js.Any], dateEnded = dateEnded.asInstanceOf[js.Any], dateStarted = dateStarted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], logUrl = logUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTask]
  }
  @scala.inline
  implicit class ReleaseTaskOps[Self <: ReleaseTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateEnded(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateEnded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateStarted(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: js.Array[Issue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: TaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: WorkflowTaskReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
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

