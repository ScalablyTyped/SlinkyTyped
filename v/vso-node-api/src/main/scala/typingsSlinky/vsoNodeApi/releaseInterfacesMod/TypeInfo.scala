package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.anon.EnumValuesAfterGatesAlways
import typingsSlinky.vsoNodeApi.anon.EnumValuesAgentBasedDeployment
import typingsSlinky.vsoNodeApi.anon.EnumValuesApprovalSnapshots
import typingsSlinky.vsoNodeApi.anon.EnumValuesApprovals
import typingsSlinky.vsoNodeApi.anon.EnumValuesArtifact
import typingsSlinky.vsoNodeApi.anon.EnumValuesArtifactSource
import typingsSlinky.vsoNodeApi.anon.EnumValuesArtifacts
import typingsSlinky.vsoNodeApi.anon.EnumValuesAscendingDescending
import typingsSlinky.vsoNodeApi.anon.EnumValuesAutomated
import typingsSlinky.vsoNodeApi.anon.EnumValuesAutomatic
import typingsSlinky.vsoNodeApi.anon.EnumValuesContinuousIntegration
import typingsSlinky.vsoNodeApi.anon.EnumValuesDeferred
import typingsSlinky.vsoNodeApi.anon.EnumValuesDescending
import typingsSlinky.vsoNodeApi.anon.EnumValuesDesigner
import typingsSlinky.vsoNodeApi.anon.EnumValuesDraft
import typingsSlinky.vsoNodeApi.anon.EnumValuesEnvironments
import typingsSlinky.vsoNodeApi.anon.EnumValuesExclusion
import typingsSlinky.vsoNodeApi.anon.EnumValuesExternalTfsBuild
import typingsSlinky.vsoNodeApi.anon.EnumValuesFailingSince
import typingsSlinky.vsoNodeApi.anon.EnumValuesFailure
import typingsSlinky.vsoNodeApi.anon.EnumValuesFriday
import typingsSlinky.vsoNodeApi.anon.EnumValuesIbiza
import typingsSlinky.vsoNodeApi.anon.EnumValuesIdAscending
import typingsSlinky.vsoNodeApi.anon.EnumValuesManage
import typingsSlinky.vsoNodeApi.anon.EnumValuesManualInterventions
import typingsSlinky.vsoNodeApi.anon.EnumValuesMultiConfiguration
import typingsSlinky.vsoNodeApi.anon.EnumValuesNotDeployed
import typingsSlinky.vsoNodeApi.anon.EnumValuesNotStarted
import typingsSlinky.vsoNodeApi.anon.EnumValuesOnBehalfOf
import typingsSlinky.vsoNodeApi.anon.EnumValuesPartiallySucceeded
import typingsSlinky.vsoNodeApi.anon.EnumValuesPending
import typingsSlinky.vsoNodeApi.anon.EnumValuesPostDeploy
import typingsSlinky.vsoNodeApi.anon.EnumValuesRejected
import typingsSlinky.vsoNodeApi.anon.EnumValuesRequestingUser
import typingsSlinky.vsoNodeApi.anon.EnumValuesSucceeded
import typingsSlinky.vsoNodeApi.anon.EnumValuesSystem
import typingsSlinky.vsoNodeApi.anon.EnumValuesUndelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  
  var AgentArtifactDefinition: js.Any = js.native
  
  var AgentArtifactType: EnumValuesExternalTfsBuild = js.native
  
  var AgentBasedDeployPhase: js.Any = js.native
  
  var AgentDeploymentInput: js.Any = js.native
  
  var ApprovalExecutionOrder: EnumValuesAfterGatesAlways = js.native
  
  var ApprovalFilters: EnumValuesApprovalSnapshots = js.native
  
  var ApprovalOptions: js.Any = js.native
  
  var ApprovalStatus: EnumValuesPending = js.native
  
  var ApprovalType: EnumValuesPostDeploy = js.native
  
  var ArtifactContributionDefinition: js.Any = js.native
  
  var ArtifactSourceTrigger: js.Any = js.native
  
  var ArtifactTypeDefinition: js.Any = js.native
  
  var AuditAction: EnumValuesUndelete = js.native
  
  var AuthorizationHeaderFor: EnumValuesOnBehalfOf = js.native
  
  var AutoTriggerIssue: js.Any = js.native
  
  var AzureKeyVaultVariableGroupProviderData: js.Any = js.native
  
  var AzureKeyVaultVariableValue: js.Any = js.native
  
  var Change: js.Any = js.native
  
  var Condition: js.Any = js.native
  
  var ConditionType: EnumValuesArtifact = js.native
  
  var ContainerImageTrigger: js.Any = js.native
  
  var ContinuousDeploymentTriggerIssue: js.Any = js.native
  
  var DeployPhase: js.Any = js.native
  
  var DeployPhaseStatus: EnumValuesNotStarted = js.native
  
  var DeployPhaseTypes: EnumValuesAgentBasedDeployment = js.native
  
  var Deployment: js.Any = js.native
  
  var DeploymentApprovalCompletedEvent: js.Any = js.native
  
  var DeploymentApprovalPendingEvent: js.Any = js.native
  
  var DeploymentAttempt: js.Any = js.native
  
  var DeploymentAuthorizationInfo: js.Any = js.native
  
  var DeploymentAuthorizationOwner: EnumValuesAutomatic = js.native
  
  var DeploymentCompletedEvent: js.Any = js.native
  
  var DeploymentExpands: EnumValuesApprovals = js.native
  
  var DeploymentJob: js.Any = js.native
  
  var DeploymentManualInterventionPendingEvent: js.Any = js.native
  
  var DeploymentOperationStatus: EnumValuesDeferred = js.native
  
  var DeploymentQueryParameters: js.Any = js.native
  
  var DeploymentReason: EnumValuesAutomated = js.native
  
  var DeploymentStartedEvent: js.Any = js.native
  
  var DeploymentStatus: EnumValuesNotDeployed = js.native
  
  var DeploymentsQueryType: EnumValuesFailingSince = js.native
  
  var EnvironmentStatus: EnumValuesPartiallySucceeded = js.native
  
  var ExecutionInput: js.Any = js.native
  
  var Folder: js.Any = js.native
  
  var FolderPathQueryOrder: EnumValuesDescending = js.native
  
  var GateStatus: EnumValuesSucceeded = js.native
  
  var IssueSource: EnumValuesSystem = js.native
  
  var MachineGroupBasedDeployPhase: js.Any = js.native
  
  var MailMessage: js.Any = js.native
  
  var MailSectionType: EnumValuesEnvironments = js.native
  
  var ManualIntervention: js.Any = js.native
  
  var ManualInterventionStatus: EnumValuesRejected = js.native
  
  var ManualInterventionUpdateMetadata: js.Any = js.native
  
  var MultiConfigInput: js.Any = js.native
  
  var MultiMachineInput: js.Any = js.native
  
  var PackageTrigger: js.Any = js.native
  
  var ParallelExecutionInputBase: js.Any = js.native
  
  var ParallelExecutionTypes: EnumValuesMultiConfiguration = js.native
  
  var PipelineProcess: js.Any = js.native
  
  var PipelineProcessTypes: EnumValuesDesigner = js.native
  
  var PropertySelector: js.Any = js.native
  
  var PropertySelectorType: EnumValuesExclusion = js.native
  
  var Release: js.Any = js.native
  
  var ReleaseAbandonedEvent: js.Any = js.native
  
  var ReleaseApproval: js.Any = js.native
  
  var ReleaseApprovalHistory: js.Any = js.native
  
  var ReleaseApprovalPendingEvent: js.Any = js.native
  
  var ReleaseCondition: js.Any = js.native
  
  var ReleaseCreatedEvent: js.Any = js.native
  
  var ReleaseDefinition: js.Any = js.native
  
  var ReleaseDefinitionApprovals: js.Any = js.native
  
  var ReleaseDefinitionEnvironment: js.Any = js.native
  
  var ReleaseDefinitionEnvironmentTemplate: js.Any = js.native
  
  var ReleaseDefinitionExpands: EnumValuesArtifacts = js.native
  
  var ReleaseDefinitionQueryOrder: EnumValuesIdAscending = js.native
  
  var ReleaseDefinitionRevision: js.Any = js.native
  
  var ReleaseDefinitionSource: EnumValuesIbiza = js.native
  
  var ReleaseDefinitionSummary: js.Any = js.native
  
  var ReleaseDeployPhase: js.Any = js.native
  
  var ReleaseEnvironment: js.Any = js.native
  
  var ReleaseEnvironmentCompletedEvent: js.Any = js.native
  
  var ReleaseEnvironmentUpdateMetadata: js.Any = js.native
  
  var ReleaseExpands: EnumValuesManualInterventions = js.native
  
  var ReleaseGates: js.Any = js.native
  
  var ReleaseQueryOrder: EnumValuesAscendingDescending = js.native
  
  var ReleaseReason: EnumValuesContinuousIntegration = js.native
  
  var ReleaseReference: js.Any = js.native
  
  var ReleaseRevision: js.Any = js.native
  
  var ReleaseSchedule: js.Any = js.native
  
  var ReleaseStartMetadata: js.Any = js.native
  
  var ReleaseStatus: EnumValuesDraft = js.native
  
  var ReleaseTask: js.Any = js.native
  
  var ReleaseTaskAttachment: js.Any = js.native
  
  var ReleaseTasksUpdatedEvent: js.Any = js.native
  
  var ReleaseTriggerBase: js.Any = js.native
  
  var ReleaseTriggerType: EnumValuesArtifactSource = js.native
  
  var ReleaseUpdateMetadata: js.Any = js.native
  
  var ReleaseUpdatedEvent: js.Any = js.native
  
  var RunOnServerDeployPhase: js.Any = js.native
  
  var ScheduleDays: EnumValuesFriday = js.native
  
  var ScheduledReleaseTrigger: js.Any = js.native
  
  var SenderType: EnumValuesRequestingUser = js.native
  
  var ServerDeploymentInput: js.Any = js.native
  
  var SourceRepoTrigger: js.Any = js.native
  
  var SummaryMailSection: js.Any = js.native
  
  var TaskStatus: EnumValuesFailure = js.native
  
  var VariableGroup: js.Any = js.native
  
  var VariableGroupActionFilter: EnumValuesManage = js.native
}
