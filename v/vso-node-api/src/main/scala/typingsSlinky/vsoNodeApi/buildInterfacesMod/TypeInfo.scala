package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.AnonEnumValues
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAbandoned
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAboveNormal
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAdd
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAll
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonAllBuildDir
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBatchedContinuousIntegration
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBoolean
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonBuild
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCanceled
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCancelling
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCloak
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCompleted
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonCustom
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonDefault
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonDefinition
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonDefinitionNameAscending
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonDetails
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonDisabled
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonDoNotRun
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonError
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonExcludeDeleted
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFailed
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFinishTimeAscending
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFolderAscending
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonFriday
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonHosted
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonOK
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonOffline
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonProject
import typingsSlinky.vsoNodeApi.AnonEnumValuesAnonRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/BuildInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  var AgentStatus: AnonEnumValues = js.native
  var AuditAction: AnonEnumValuesAnonAdd = js.native
  var Build: js.Any = js.native
  var BuildAgent: js.Any = js.native
  var BuildArtifactAddedEvent: js.Any = js.native
  var BuildAuthorizationScope: AnonEnumValuesAnonProject = js.native
  var BuildChangesCalculatedEvent: js.Any = js.native
  var BuildCompletedEvent: js.Any = js.native
  var BuildController: js.Any = js.native
  var BuildDefinition: js.Any = js.native
  var BuildDefinition3_2: js.Any = js.native
  var BuildDefinitionChangedEvent: js.Any = js.native
  var BuildDefinitionChangingEvent: js.Any = js.native
  var BuildDefinitionReference: js.Any = js.native
  var BuildDefinitionReference3_2: js.Any = js.native
  var BuildDefinitionRevision: js.Any = js.native
  var BuildDefinitionSourceProvider: js.Any = js.native
  var BuildDefinitionTemplate: js.Any = js.native
  var BuildDefinitionTemplate3_2: js.Any = js.native
  var BuildDeletedEvent: js.Any = js.native
  var BuildDeployment: js.Any = js.native
  var BuildDestroyedEvent: js.Any = js.native
  var BuildLog: js.Any = js.native
  var BuildMetric: js.Any = js.native
  var BuildOptionDefinition: js.Any = js.native
  var BuildOptionInputDefinition: js.Any = js.native
  var BuildOptionInputType: AnonEnumValuesAnonBoolean = js.native
  var BuildPhaseStatus: AnonEnumValuesAnonFailed = js.native
  var BuildProcessTemplate: js.Any = js.native
  var BuildQueryOrder: AnonEnumValuesAnonFinishTimeAscending = js.native
  var BuildQueuedEvent: js.Any = js.native
  var BuildReason: AnonEnumValuesAnonAll = js.native
  var BuildReference: js.Any = js.native
  var BuildRequestValidationResult: js.Any = js.native
  var BuildResult: AnonEnumValuesAnonCanceled = js.native
  var BuildServer: js.Any = js.native
  var BuildStartedEvent: js.Any = js.native
  var BuildStatus: AnonEnumValuesAnonCancelling = js.native
  var BuildSummary: js.Any = js.native
  var BuildTrigger: js.Any = js.native
  var BuildUpdatedEvent: js.Any = js.native
  var Change: js.Any = js.native
  var ContinuousDeploymentDefinition: js.Any = js.native
  var ContinuousIntegrationTrigger: js.Any = js.native
  var ControllerStatus: AnonEnumValues = js.native
  var DefinitionQuality: AnonEnumValuesAnonDefinition = js.native
  var DefinitionQueryOrder: AnonEnumValuesAnonDefinitionNameAscending = js.native
  var DefinitionQueueStatus: AnonEnumValuesAnonDisabled = js.native
  var DefinitionReference: js.Any = js.native
  var DefinitionTriggerType: AnonEnumValuesAnonBatchedContinuousIntegration = js.native
  var DefinitionType: AnonEnumValuesAnonBuild = js.native
  var DeleteOptions: AnonEnumValuesAnonDetails = js.native
  var DesignerProcess: js.Any = js.native
  var Folder: js.Any = js.native
  var FolderQueryOrder: AnonEnumValuesAnonFolderAscending = js.native
  var GatedCheckInTrigger: js.Any = js.native
  var GetOption: AnonEnumValuesAnonCustom = js.native
  var InformationNode: js.Any = js.native
  var Issue: js.Any = js.native
  var IssueType: AnonEnumValuesAnonError = js.native
  var Phase: js.Any = js.native
  var ProcessTemplateType: AnonEnumValuesAnonDefault = js.native
  var PullRequestTrigger: js.Any = js.native
  var QueryDeletedOption: AnonEnumValuesAnonExcludeDeleted = js.native
  var QueueOptions: AnonEnumValuesAnonDoNotRun = js.native
  var QueuePriority: AnonEnumValuesAnonAboveNormal = js.native
  var RepositoryCleanOptions: AnonEnumValuesAnonAllBuildDir = js.native
  var Schedule: js.Any = js.native
  var ScheduleDays: AnonEnumValuesAnonFriday = js.native
  var ScheduleTrigger: js.Any = js.native
  var ServiceHostStatus: AnonEnumValuesAnonOffline = js.native
  var SourceProviderAttributes: js.Any = js.native
  var SourceProviderAvailability: AnonEnumValuesAnonHosted = js.native
  var SupportLevel: AnonEnumValuesAnonRequired = js.native
  var SupportedTrigger: js.Any = js.native
  var SyncBuildCompletedEvent: js.Any = js.native
  var SyncBuildStartedEvent: js.Any = js.native
  var TaskResult: AnonEnumValuesAnonAbandoned = js.native
  var Timeline: js.Any = js.native
  var TimelineRecord: js.Any = js.native
  var TimelineRecordState: AnonEnumValuesAnonCompleted = js.native
  var TimelineRecordsUpdatedEvent: js.Any = js.native
  var ValidationResult: AnonEnumValuesAnonOK = js.native
  var WorkspaceMapping: js.Any = js.native
  var WorkspaceMappingType: AnonEnumValuesAnonCloak = js.native
  var WorkspaceTemplate: js.Any = js.native
  var XamlBuildDefinition: js.Any = js.native
}

