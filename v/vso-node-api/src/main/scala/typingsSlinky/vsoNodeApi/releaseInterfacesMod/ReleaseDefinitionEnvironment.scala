package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionEnvironment extends js.Object {
  var badgeUrl: String = js.native
  var conditions: js.Array[Condition] = js.native
  var demands: js.Array[_] = js.native
  var deployPhases: js.Array[DeployPhase] = js.native
  var deployStep: ReleaseDefinitionDeployStep = js.native
  var environmentOptions: EnvironmentOptions = js.native
  var executionPolicy: EnvironmentExecutionPolicy = js.native
  var id: Double = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var postDeployApprovals: ReleaseDefinitionApprovals = js.native
  var postDeploymentGates: ReleaseDefinitionGatesStep = js.native
  var preDeployApprovals: ReleaseDefinitionApprovals = js.native
  var preDeploymentGates: ReleaseDefinitionGatesStep = js.native
  var processParameters: ProcessParameters = js.native
  var properties: js.Any = js.native
  var queueId: Double = js.native
  var rank: Double = js.native
  var retentionPolicy: EnvironmentRetentionPolicy = js.native
  var runOptions: StringDictionary[String] = js.native
  var schedules: js.Array[ReleaseSchedule] = js.native
  var variableGroups: js.Array[Double] = js.native
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
}

object ReleaseDefinitionEnvironment {
  @scala.inline
  def apply(
    badgeUrl: String,
    conditions: js.Array[Condition],
    demands: js.Array[_],
    deployPhases: js.Array[DeployPhase],
    deployStep: ReleaseDefinitionDeployStep,
    environmentOptions: EnvironmentOptions,
    executionPolicy: EnvironmentExecutionPolicy,
    id: Double,
    name: String,
    owner: IdentityRef,
    postDeployApprovals: ReleaseDefinitionApprovals,
    postDeploymentGates: ReleaseDefinitionGatesStep,
    preDeployApprovals: ReleaseDefinitionApprovals,
    preDeploymentGates: ReleaseDefinitionGatesStep,
    processParameters: ProcessParameters,
    properties: js.Any,
    queueId: Double,
    rank: Double,
    retentionPolicy: EnvironmentRetentionPolicy,
    runOptions: StringDictionary[String],
    schedules: js.Array[ReleaseSchedule],
    variableGroups: js.Array[Double],
    variables: StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinitionEnvironment = {
    val __obj = js.Dynamic.literal(badgeUrl = badgeUrl.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deployPhases = deployPhases.asInstanceOf[js.Any], deployStep = deployStep.asInstanceOf[js.Any], environmentOptions = environmentOptions.asInstanceOf[js.Any], executionPolicy = executionPolicy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], postDeploymentGates = postDeploymentGates.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], preDeploymentGates = preDeploymentGates.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], runOptions = runOptions.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironment]
  }
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentOps[Self <: ReleaseDefinitionEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployPhases(value: js.Array[DeployPhase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployPhases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployStep(value: ReleaseDefinitionDeployStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentOptions(value: EnvironmentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionPolicy(value: EnvironmentExecutionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeployApprovals(value: ReleaseDefinitionApprovals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeployApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeploymentGates(value: ReleaseDefinitionGatesStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeploymentGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeployApprovals(value: ReleaseDefinitionApprovals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeployApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeploymentGates(value: ReleaseDefinitionGatesStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeploymentGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessParameters(value: ProcessParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
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
    def withRetentionPolicy(value: EnvironmentRetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedules(value: js.Array[ReleaseSchedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableGroups(value: js.Array[Double]): Self = {
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
  }
  
}

