package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineRecord extends StObject {
  
  var changeId: Double = js.native
  
  var currentOperation: String = js.native
  
  var details: TimelineReference = js.native
  
  var errorCount: Double = js.native
  
  var finishTime: js.Date = js.native
  
  var id: String = js.native
  
  var issues: js.Array[Issue] = js.native
  
  var lastModified: js.Date = js.native
  
  var location: String = js.native
  
  var log: TaskLogReference = js.native
  
  var name: String = js.native
  
  var order: Double = js.native
  
  var parentId: String = js.native
  
  var percentComplete: Double = js.native
  
  var result: TaskResult = js.native
  
  var resultCode: String = js.native
  
  var startTime: js.Date = js.native
  
  var state: TimelineRecordState = js.native
  
  var task: TaskReference = js.native
  
  var `type`: String = js.native
  
  var warningCount: Double = js.native
  
  var workerName: String = js.native
}
object TimelineRecord {
  
  @scala.inline
  def apply(
    changeId: Double,
    currentOperation: String,
    details: TimelineReference,
    errorCount: Double,
    finishTime: js.Date,
    id: String,
    issues: js.Array[Issue],
    lastModified: js.Date,
    location: String,
    log: TaskLogReference,
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
    warningCount: Double,
    workerName: String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], currentOperation = currentOperation.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any], workerName = workerName.asInstanceOf[js.Any])
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
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: TaskLogReference): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
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
    def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerName(value: String): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
  }
}
