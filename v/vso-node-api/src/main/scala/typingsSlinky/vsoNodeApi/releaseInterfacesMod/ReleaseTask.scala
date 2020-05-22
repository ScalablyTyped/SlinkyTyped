package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTask extends js.Object {
  var agentName: String
  var dateEnded: js.Date
  var dateStarted: js.Date
  var finishTime: js.Date
  var id: Double
  var issues: js.Array[Issue]
  var lineCount: Double
  var logUrl: String
  var name: String
  var percentComplete: Double
  var rank: Double
  var startTime: js.Date
  var status: TaskStatus
  var task: WorkflowTaskReference
  var timelineRecordId: String
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
}

