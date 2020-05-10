package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceDefinition extends js.Object {
  /**
    * Enable maintenance
    */
  var enabled: Boolean = js.native
  /**
    * Id
    */
  var id: Double = js.native
  /**
    * Maintenance job timeout per agent
    */
  var jobTimeoutInMinutes: Double = js.native
  /**
    * Max percentage of agents within a pool running maintenance job at given time
    */
  var maxConcurrentAgentsPercentage: Double = js.native
  var options: TaskAgentPoolMaintenanceOptions = js.native
  /**
    * Pool reference for the maintenance definition
    */
  var pool: TaskAgentPoolReference = js.native
  var retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy = js.native
  var scheduleSetting: TaskAgentPoolMaintenanceSchedule = js.native
}

object TaskAgentPoolMaintenanceDefinition {
  @scala.inline
  def apply(
    enabled: Boolean,
    id: Double,
    jobTimeoutInMinutes: Double,
    maxConcurrentAgentsPercentage: Double,
    options: TaskAgentPoolMaintenanceOptions,
    pool: TaskAgentPoolReference,
    retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy,
    scheduleSetting: TaskAgentPoolMaintenanceSchedule
  ): TaskAgentPoolMaintenanceDefinition = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], maxConcurrentAgentsPercentage = maxConcurrentAgentsPercentage.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], scheduleSetting = scheduleSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceDefinition]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceDefinitionOps[Self <: TaskAgentPoolMaintenanceDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrentAgentsPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentAgentsPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: TaskAgentPoolMaintenanceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: TaskAgentPoolReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPolicy(value: TaskAgentPoolMaintenanceRetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleSetting(value: TaskAgentPoolMaintenanceSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleSetting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

