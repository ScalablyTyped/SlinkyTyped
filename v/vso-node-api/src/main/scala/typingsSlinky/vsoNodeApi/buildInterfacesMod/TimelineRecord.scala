package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineRecord extends js.Object {
  var _links: js.Any = js.native
  /**
    * The change ID.
    */
  var changeId: Double = js.native
  /**
    * A string that indicates the current operation.
    */
  var currentOperation: String = js.native
  /**
    * A reference to a sub-timeline.
    */
  var details: TimelineReference = js.native
  /**
    * The number of errors produced by this operation.
    */
  var errorCount: Double = js.native
  /**
    * The finish time.
    */
  var finishTime: js.Date = js.native
  /**
    * The ID of the record.
    */
  var id: String = js.native
  var issues: js.Array[Issue] = js.native
  /**
    * The time the record was last modified.
    */
  var lastModified: js.Date = js.native
  /**
    * A reference to the log produced by this operation.
    */
  var log: BuildLogReference = js.native
  /**
    * The name.
    */
  var name: String = js.native
  /**
    * An ordinal value relative to other records.
    */
  var order: Double = js.native
  /**
    * The ID of the record's parent.
    */
  var parentId: String = js.native
  /**
    * The current completion percentage.
    */
  var percentComplete: Double = js.native
  /**
    * The result.
    */
  var result: TaskResult = js.native
  /**
    * The result code.
    */
  var resultCode: String = js.native
  /**
    * The start time.
    */
  var startTime: js.Date = js.native
  /**
    * The state of the record.
    */
  var state: TimelineRecordState = js.native
  /**
    * A reference to the task represented by this timeline record.
    */
  var task: TaskReference = js.native
  /**
    * The type of the record.
    */
  var `type`: String = js.native
  /**
    * The REST URL of the timeline record.
    */
  var url: String = js.native
  /**
    * The number of warnings produced by this operation.
    */
  var warningCount: Double = js.native
  /**
    * The name of the agent running the operation.
    */
  var workerName: String = js.native
}

object TimelineRecord {
  @scala.inline
  def apply(
    _links: js.Any,
    changeId: Double,
    currentOperation: String,
    details: TimelineReference,
    errorCount: Double,
    finishTime: js.Date,
    id: String,
    issues: js.Array[Issue],
    lastModified: js.Date,
    log: BuildLogReference,
    name: String,
    order: Double,
    parentId: String,
    percentComplete: Double,
    result: TaskResult,
    resultCode: String,
    startTime: js.Date,
    state: TimelineRecordState,
    task: TaskReference,
    `type`: String,
    url: String,
    warningCount: Double,
    workerName: String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], changeId = changeId.asInstanceOf[js.Any], currentOperation = currentOperation.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any], workerName = workerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRecord]
  }
  @scala.inline
  implicit class TimelineRecordOps[Self <: TimelineRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: TimelineReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: BuildLogReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TaskResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TimelineRecordState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: TaskReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

