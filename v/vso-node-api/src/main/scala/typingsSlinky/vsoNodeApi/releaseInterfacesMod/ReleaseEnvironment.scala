package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseEnvironment extends js.Object {
  /**
    * Gets list of conditions.
    */
  var conditions: js.Array[ReleaseCondition] = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: js.Date = js.native
  /**
    * Gets definition environment id.
    */
  var definitionEnvironmentId: Double = js.native
  /**
    * Gets demands.
    */
  var demands: js.Array[_] = js.native
  /**
    * Gets list of deploy phases snapshot.
    */
  var deployPhasesSnapshot: js.Array[DeployPhase] = js.native
  /**
    * Gets deploy steps.
    */
  var deploySteps: js.Array[DeploymentAttempt] = js.native
  /**
    * Gets environment options.
    */
  var environmentOptions: EnvironmentOptions = js.native
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date = js.native
  /**
    * Gets name.
    */
  var name: String = js.native
  /**
    * Gets next scheduled UTC time.
    */
  var nextScheduledUtcTime: js.Date = js.native
  /**
    * Gets the identity who is owner for release environment.
    */
  var owner: IdentityRef = js.native
  /**
    * Gets list of post deploy approvals snapshot.
    */
  var postApprovalsSnapshot: ReleaseDefinitionApprovals = js.native
  /**
    * Gets list of post deploy approvals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval] = js.native
  var postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep = js.native
  /**
    * Gets list of pre deploy approvals snapshot.
    */
  var preApprovalsSnapshot: ReleaseDefinitionApprovals = js.native
  /**
    * Gets list of pre deploy approvals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval] = js.native
  var preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep = js.native
  /**
    * Gets process parameters.
    */
  var processParameters: ProcessParameters = js.native
  /**
    * Gets queue id.
    */
  var queueId: Double = js.native
  /**
    * Gets rank.
    */
  var rank: Double = js.native
  /**
    * Gets release reference which specifies the reference of the release to which this release environment is associated.
    */
  var release: ReleaseShallowReference = js.native
  /**
    * Gets the identity who created release.
    */
  var releaseCreatedBy: IdentityRef = js.native
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release environment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets release description.
    */
  var releaseDescription: String = js.native
  /**
    * Gets release id.
    */
  var releaseId: Double = js.native
  /**
    * Gets schedule deployment time of release environment.
    */
  var scheduledDeploymentTime: js.Date = js.native
  /**
    * Gets list of schedules.
    */
  var schedules: js.Array[ReleaseSchedule] = js.native
  /**
    * Gets environment status.
    */
  var status: EnvironmentStatus = js.native
  /**
    * Gets time to deploy.
    */
  var timeToDeploy: Double = js.native
  /**
    * Gets trigger reason.
    */
  var triggerReason: String = js.native
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup] = js.native
  /**
    * Gets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
  /**
    * Gets list of workflow tasks.
    */
  var workflowTasks: js.Array[WorkflowTask] = js.native
}

object ReleaseEnvironment {
  @scala.inline
  def apply(
    conditions: js.Array[ReleaseCondition],
    createdOn: js.Date,
    definitionEnvironmentId: Double,
    demands: js.Array[_],
    deployPhasesSnapshot: js.Array[DeployPhase],
    deploySteps: js.Array[DeploymentAttempt],
    environmentOptions: EnvironmentOptions,
    id: Double,
    modifiedOn: js.Date,
    name: String,
    nextScheduledUtcTime: js.Date,
    owner: IdentityRef,
    postApprovalsSnapshot: ReleaseDefinitionApprovals,
    postDeployApprovals: js.Array[ReleaseApproval],
    postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep,
    preApprovalsSnapshot: ReleaseDefinitionApprovals,
    preDeployApprovals: js.Array[ReleaseApproval],
    preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep,
    processParameters: ProcessParameters,
    queueId: Double,
    rank: Double,
    release: ReleaseShallowReference,
    releaseCreatedBy: IdentityRef,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseDescription: String,
    releaseId: Double,
    scheduledDeploymentTime: js.Date,
    schedules: js.Array[ReleaseSchedule],
    status: EnvironmentStatus,
    timeToDeploy: Double,
    triggerReason: String,
    variableGroups: js.Array[VariableGroup],
    variables: StringDictionary[ConfigurationVariableValue],
    workflowTasks: js.Array[WorkflowTask]
  ): ReleaseEnvironment = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deployPhasesSnapshot = deployPhasesSnapshot.asInstanceOf[js.Any], deploySteps = deploySteps.asInstanceOf[js.Any], environmentOptions = environmentOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextScheduledUtcTime = nextScheduledUtcTime.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], postApprovalsSnapshot = postApprovalsSnapshot.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], postDeploymentGatesSnapshot = postDeploymentGatesSnapshot.asInstanceOf[js.Any], preApprovalsSnapshot = preApprovalsSnapshot.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], preDeploymentGatesSnapshot = preDeploymentGatesSnapshot.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseDescription = releaseDescription.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeToDeploy = timeToDeploy.asInstanceOf[js.Any], triggerReason = triggerReason.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironment]
  }
  @scala.inline
  implicit class ReleaseEnvironmentOps[Self <: ReleaseEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[ReleaseCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionEnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployPhasesSnapshot(value: js.Array[DeployPhase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployPhasesSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploySteps(value: js.Array[DeploymentAttempt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploySteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentOptions(value: EnvironmentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextScheduledUtcTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScheduledUtcTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostApprovalsSnapshot(value: ReleaseDefinitionApprovals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postApprovalsSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeployApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeploymentGatesSnapshot(value: ReleaseDefinitionGatesStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeploymentGatesSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreApprovalsSnapshot(value: ReleaseDefinitionApprovals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preApprovalsSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeployApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeploymentGatesSnapshot(value: ReleaseDefinitionGatesStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeploymentGatesSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessParameters(value: ProcessParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: ReleaseShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseCreatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledDeploymentTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledDeploymentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedules(value: js.Array[ReleaseSchedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: EnvironmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeToDeploy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToDeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableGroups(value: js.Array[VariableGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[ConfigurationVariableValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowTasks(value: js.Array[WorkflowTask]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowTasks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

