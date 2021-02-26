package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineRecord extends StObject {
  
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
  implicit class TimelineRecordMutableBuilder[Self <: TimelineRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentOperation(value: String): Self = StObject.set(x, "currentOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: TimelineReference): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: js.Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: BuildLogReference): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TimelineRecordState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: TaskReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerName(value: String): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
