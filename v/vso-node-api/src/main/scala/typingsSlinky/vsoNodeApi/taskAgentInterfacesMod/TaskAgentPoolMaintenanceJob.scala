package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceJob extends js.Object {
  /**
    * The maintenance definition for the maintenance job
    */
  var definitionId: Double = js.native
  /**
    * The total error counts during the maintenance job
    */
  var errorCount: Double = js.native
  /**
    * Time that the maintenance job was completed
    */
  var finishTime: js.Date = js.native
  /**
    * Id of the maintenance job
    */
  var jobId: Double = js.native
  /**
    * The log download url for the maintenance job
    */
  var logsDownloadUrl: String = js.native
  /**
    * Orchestration/Plan Id for the maintenance job
    */
  var orchestrationId: String = js.native
  /**
    * Pool reference for the maintenance job
    */
  var pool: TaskAgentPoolReference = js.native
  /**
    * Time that the maintenance job was queued
    */
  var queueTime: js.Date = js.native
  /**
    * The identity that queued the maintenance job
    */
  var requestedBy: IdentityRef = js.native
  /**
    * The maintenance job result
    */
  var result: TaskAgentPoolMaintenanceJobResult = js.native
  /**
    * Time that the maintenance job was started
    */
  var startTime: js.Date = js.native
  /**
    * Status of the maintenance job
    */
  var status: TaskAgentPoolMaintenanceJobStatus = js.native
  var targetAgents: js.Array[TaskAgentReference] = js.native
  /**
    * The total warning counts during the maintenance job
    */
  var warningCount: Double = js.native
}

object TaskAgentPoolMaintenanceJob {
  @scala.inline
  def apply(
    definitionId: Double,
    errorCount: Double,
    finishTime: js.Date,
    jobId: Double,
    logsDownloadUrl: String,
    orchestrationId: String,
    pool: TaskAgentPoolReference,
    queueTime: js.Date,
    requestedBy: IdentityRef,
    result: TaskAgentPoolMaintenanceJobResult,
    startTime: js.Date,
    status: TaskAgentPoolMaintenanceJobStatus,
    targetAgents: js.Array[TaskAgentReference],
    warningCount: Double
  ): TaskAgentPoolMaintenanceJob = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], logsDownloadUrl = logsDownloadUrl.asInstanceOf[js.Any], orchestrationId = orchestrationId.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetAgents = targetAgents.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceJob]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceJobOps[Self <: TaskAgentPoolMaintenanceJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
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
    def withJobId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogsDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsDownloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrchestrationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: TaskAgentPoolReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TaskAgentPoolMaintenanceJobResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: TaskAgentPoolMaintenanceJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAgents(value: js.Array[TaskAgentReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

