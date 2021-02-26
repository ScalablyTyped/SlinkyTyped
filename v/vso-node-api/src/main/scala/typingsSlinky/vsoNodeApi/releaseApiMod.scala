package typingsSlinky.vsoNodeApi

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputValuesQuery
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.AgentArtifactDefinition
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalFilters
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalStatus
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ApprovalType
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.Artifact
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ArtifactTypeDefinition
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ArtifactVersionQueryResult
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.AutoTriggerIssue
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.Change
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.DefinitionEnvironmentReference
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.Deployment
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentQueryParameters
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentStatus
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.FavoriteItem
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.Folder
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.FolderPathQueryOrder
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.MailMessage
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ManualIntervention
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ManualInterventionUpdateMetadata
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.Metric
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ProjectReference
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.Release
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseApproval
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinition
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionRevision
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSummary
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionUndeleteParameter
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseEnvironment
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseEnvironmentUpdateMetadata
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseQueryOrder
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseRevision
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseSettings
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseStartMetadata
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseStatus
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTask
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTaskAttachment
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseUpdateMetadata
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseWorkItemRef
import typingsSlinky.vsoNodeApi.releaseInterfacesMod.SummaryMailSection
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseApiMod {
  
  @JSImport("vso-node-api/ReleaseApi", "ReleaseApi")
  @js.native
  class ReleaseApi protected () extends IReleaseApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object ReleaseApi {
    
    @JSImport("vso-node-api/ReleaseApi", "ReleaseApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IReleaseApi extends ClientApiBase {
    
    def addDefinitionTag(project: String, releaseDefinitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def addDefinitionTags(tags: js.Array[String], project: String, releaseDefinitionId: Double): js.Promise[js.Array[String]] = js.native
    
    def addReleaseTag(project: String, releaseId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def addReleaseTags(tags: js.Array[String], project: String, releaseId: Double): js.Promise[js.Array[String]] = js.native
    
    def createDefinitionEnvironmentTemplate(template: ReleaseDefinitionEnvironmentTemplate, project: String): js.Promise[ReleaseDefinitionEnvironmentTemplate] = js.native
    
    def createFavorites(favoriteItems: js.Array[FavoriteItem], project: String, scope: String): js.Promise[js.Array[FavoriteItem]] = js.native
    def createFavorites(favoriteItems: js.Array[FavoriteItem], project: String, scope: String, identityId: String): js.Promise[js.Array[FavoriteItem]] = js.native
    
    def createFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
    
    def createRelease(releaseStartMetadata: ReleaseStartMetadata, project: String): js.Promise[Release] = js.native
    
    def createReleaseDefinition(releaseDefinition: ReleaseDefinition, project: String): js.Promise[ReleaseDefinition] = js.native
    
    def deleteDefinitionEnvironmentTemplate(project: String, templateId: String): js.Promise[Unit] = js.native
    
    def deleteDefinitionTag(project: String, releaseDefinitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def deleteFavorites(project: String, scope: String): js.Promise[Unit] = js.native
    def deleteFavorites(project: String, scope: String, identityId: js.UndefOr[scala.Nothing], favoriteItemIds: String): js.Promise[Unit] = js.native
    def deleteFavorites(project: String, scope: String, identityId: String): js.Promise[Unit] = js.native
    def deleteFavorites(project: String, scope: String, identityId: String, favoriteItemIds: String): js.Promise[Unit] = js.native
    
    def deleteFolder(project: String, path: String): js.Promise[Unit] = js.native
    
    def deleteRelease(project: String, releaseId: Double): js.Promise[Unit] = js.native
    def deleteRelease(project: String, releaseId: Double, comment: String): js.Promise[Unit] = js.native
    
    def deleteReleaseDefinition(project: String, definitionId: Double): js.Promise[Unit] = js.native
    def deleteReleaseDefinition(project: String, definitionId: Double, comment: js.UndefOr[scala.Nothing], forceDelete: Boolean): js.Promise[Unit] = js.native
    def deleteReleaseDefinition(project: String, definitionId: Double, comment: String): js.Promise[Unit] = js.native
    def deleteReleaseDefinition(project: String, definitionId: Double, comment: String, forceDelete: Boolean): js.Promise[Unit] = js.native
    
    def deleteReleaseTag(project: String, releaseId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def getAgentArtifactDefinitions(project: String, releaseId: Double): js.Promise[js.Array[AgentArtifactDefinition]] = js.native
    
    def getApproval(project: String, approvalId: Double): js.Promise[ReleaseApproval] = js.native
    def getApproval(project: String, approvalId: Double, includeHistory: Boolean): js.Promise[ReleaseApproval] = js.native
    
    def getApprovalHistory(project: String, approvalStepId: Double): js.Promise[ReleaseApproval] = js.native
    
    def getApprovals(
      project: String,
      assignedToFilter: js.UndefOr[String],
      statusFilter: js.UndefOr[ApprovalStatus],
      releaseIdsFilter: js.UndefOr[js.Array[Double]],
      typeFilter: js.UndefOr[ApprovalType],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[Double],
      queryOrder: js.UndefOr[ReleaseQueryOrder],
      includeMyGroupApprovals: js.UndefOr[Boolean]
    ): js.Promise[js.Array[ReleaseApproval]] = js.native
    
    def getArtifactTypeDefinitions(project: String): js.Promise[js.Array[ArtifactTypeDefinition]] = js.native
    
    def getArtifactVersions(project: String, releaseDefinitionId: Double): js.Promise[ArtifactVersionQueryResult] = js.native
    
    def getArtifactVersionsForSources(artifacts: js.Array[Artifact], project: String): js.Promise[ArtifactVersionQueryResult] = js.native
    
    def getAutoTriggerIssues(artifactType: String, sourceId: String, artifactVersionId: String): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    def getAutoTriggerIssues(artifactType: String, sourceId: String, artifactVersionId: String, project: String): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    
    def getDefinitionEnvironmentTemplate(project: String, templateId: String): js.Promise[ReleaseDefinitionEnvironmentTemplate] = js.native
    
    def getDefinitionEnvironments(project: String): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    def getDefinitionEnvironments(project: String, taskGroupId: js.UndefOr[scala.Nothing], propertyFilters: js.Array[String]): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    def getDefinitionEnvironments(project: String, taskGroupId: String): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    def getDefinitionEnvironments(project: String, taskGroupId: String, propertyFilters: js.Array[String]): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    
    def getDefinitionRevision(project: String, definitionId: Double, revision: Double): js.Promise[ReadableStream] = js.native
    
    def getDefinitionTags(project: String, releaseDefinitionId: Double): js.Promise[js.Array[String]] = js.native
    
    def getDeploymentBadge(projectId: String, releaseDefinitionId: Double, environmentId: Double): js.Promise[String] = js.native
    def getDeploymentBadge(projectId: String, releaseDefinitionId: Double, environmentId: Double, branchName: String): js.Promise[String] = js.native
    
    def getDeployments(
      project: String,
      definitionId: js.UndefOr[Double],
      definitionEnvironmentId: js.UndefOr[Double],
      createdBy: js.UndefOr[String],
      minModifiedTime: js.UndefOr[js.Date],
      maxModifiedTime: js.UndefOr[js.Date],
      deploymentStatus: js.UndefOr[DeploymentStatus],
      operationStatus: js.UndefOr[DeploymentOperationStatus],
      latestAttemptsOnly: js.UndefOr[Boolean],
      queryOrder: js.UndefOr[ReleaseQueryOrder],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[Double],
      createdFor: js.UndefOr[String]
    ): js.Promise[js.Array[Deployment]] = js.native
    
    def getDeploymentsForMultipleEnvironments(queryParameters: DeploymentQueryParameters, project: String): js.Promise[js.Array[Deployment]] = js.native
    
    def getFavorites(project: String, scope: String): js.Promise[js.Array[FavoriteItem]] = js.native
    def getFavorites(project: String, scope: String, identityId: String): js.Promise[js.Array[FavoriteItem]] = js.native
    
    def getFolders(project: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: js.UndefOr[scala.Nothing], queryOrder: FolderPathQueryOrder): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String, queryOrder: FolderPathQueryOrder): js.Promise[js.Array[Folder]] = js.native
    
    def getGateLog(project: String, releaseId: Double, environmentId: Double, gateId: Double, taskId: Double): js.Promise[ReadableStream] = js.native
    
    def getInputValues(query: InputValuesQuery, project: String): js.Promise[InputValuesQuery] = js.native
    
    def getIssues(project: String, buildId: Double): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    def getIssues(project: String, buildId: Double, sourceId: String): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    
    def getLog(project: String, releaseId: Double, environmentId: Double, taskId: Double): js.Promise[ReadableStream] = js.native
    def getLog(project: String, releaseId: Double, environmentId: Double, taskId: Double, attemptId: Double): js.Promise[ReadableStream] = js.native
    
    def getLogs(project: String, releaseId: Double): js.Promise[ReadableStream] = js.native
    
    def getManualIntervention(project: String, releaseId: Double, manualInterventionId: Double): js.Promise[ManualIntervention] = js.native
    
    def getManualInterventions(project: String, releaseId: Double): js.Promise[js.Array[ManualIntervention]] = js.native
    
    def getMetrics(project: String): js.Promise[js.Array[Metric]] = js.native
    def getMetrics(project: String, minMetricsTime: js.Date): js.Promise[js.Array[Metric]] = js.native
    
    def getRelease(project: String, releaseId: Double): js.Promise[Release] = js.native
    def getRelease(
      project: String,
      releaseId: Double,
      approvalFilters: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String]
    ): js.Promise[Release] = js.native
    def getRelease(project: String, releaseId: Double, approvalFilters: ApprovalFilters): js.Promise[Release] = js.native
    def getRelease(
      project: String,
      releaseId: Double,
      approvalFilters: ApprovalFilters,
      propertyFilters: js.Array[String]
    ): js.Promise[Release] = js.native
    
    def getReleaseChanges(project: String, releaseId: Double): js.Promise[js.Array[Change]] = js.native
    def getReleaseChanges(project: String, releaseId: Double, baseReleaseId: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[Change]] = js.native
    def getReleaseChanges(project: String, releaseId: Double, baseReleaseId: Double): js.Promise[js.Array[Change]] = js.native
    def getReleaseChanges(project: String, releaseId: Double, baseReleaseId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
    
    def getReleaseDefinition(project: String, definitionId: Double): js.Promise[ReleaseDefinition] = js.native
    def getReleaseDefinition(project: String, definitionId: Double, propertyFilters: js.Array[String]): js.Promise[ReleaseDefinition] = js.native
    
    def getReleaseDefinitionHistory(project: String, definitionId: Double): js.Promise[js.Array[ReleaseDefinitionRevision]] = js.native
    
    def getReleaseDefinitionRevision(project: String, definitionId: Double, revision: Double): js.Promise[ReadableStream] = js.native
    
    def getReleaseDefinitionSummary(project: String, definitionId: Double, releaseCount: Double): js.Promise[ReleaseDefinitionSummary] = js.native
    def getReleaseDefinitionSummary(
      project: String,
      definitionId: Double,
      releaseCount: Double,
      includeArtifact: js.UndefOr[scala.Nothing],
      definitionEnvironmentIdsFilter: js.Array[Double]
    ): js.Promise[ReleaseDefinitionSummary] = js.native
    def getReleaseDefinitionSummary(project: String, definitionId: Double, releaseCount: Double, includeArtifact: Boolean): js.Promise[ReleaseDefinitionSummary] = js.native
    def getReleaseDefinitionSummary(
      project: String,
      definitionId: Double,
      releaseCount: Double,
      includeArtifact: Boolean,
      definitionEnvironmentIdsFilter: js.Array[Double]
    ): js.Promise[ReleaseDefinitionSummary] = js.native
    
    def getReleaseDefinitions(
      project: String,
      searchText: js.UndefOr[String],
      expand: js.UndefOr[ReleaseDefinitionExpands],
      artifactType: js.UndefOr[String],
      artifactSourceId: js.UndefOr[String],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String],
      queryOrder: js.UndefOr[ReleaseDefinitionQueryOrder],
      path: js.UndefOr[String],
      isExactNameMatch: js.UndefOr[Boolean],
      tagFilter: js.UndefOr[js.Array[String]],
      propertyFilters: js.UndefOr[js.Array[String]],
      definitionIdFilter: js.UndefOr[js.Array[String]],
      isDeleted: js.UndefOr[Boolean]
    ): js.Promise[js.Array[ReleaseDefinition]] = js.native
    
    def getReleaseEnvironment(project: String, releaseId: Double, environmentId: Double): js.Promise[ReleaseEnvironment] = js.native
    
    def getReleaseHistory(project: String, releaseId: Double): js.Promise[js.Array[ReleaseRevision]] = js.native
    
    def getReleaseProjects(artifactType: String, artifactSourceId: String): js.Promise[js.Array[ProjectReference]] = js.native
    
    def getReleaseRevision(project: String, releaseId: Double, definitionSnapshotRevision: Double): js.Promise[ReadableStream] = js.native
    
    def getReleaseSettings(project: String): js.Promise[ReleaseSettings] = js.native
    
    def getReleaseTags(project: String, releaseId: Double): js.Promise[js.Array[String]] = js.native
    
    def getReleaseWorkItemsRefs(project: String, releaseId: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    def getReleaseWorkItemsRefs(project: String, releaseId: Double, baseReleaseId: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    def getReleaseWorkItemsRefs(project: String, releaseId: Double, baseReleaseId: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    def getReleaseWorkItemsRefs(project: String, releaseId: Double, baseReleaseId: Double, top: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    
    def getReleases(
      project: js.UndefOr[String],
      definitionId: js.UndefOr[Double],
      definitionEnvironmentId: js.UndefOr[Double],
      searchText: js.UndefOr[String],
      createdBy: js.UndefOr[String],
      statusFilter: js.UndefOr[ReleaseStatus],
      environmentStatusFilter: js.UndefOr[Double],
      minCreatedTime: js.UndefOr[js.Date],
      maxCreatedTime: js.UndefOr[js.Date],
      queryOrder: js.UndefOr[ReleaseQueryOrder],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[Double],
      expand: js.UndefOr[ReleaseExpands],
      artifactTypeId: js.UndefOr[String],
      sourceId: js.UndefOr[String],
      artifactVersionId: js.UndefOr[String],
      sourceBranchFilter: js.UndefOr[String],
      isDeleted: js.UndefOr[Boolean],
      tagFilter: js.UndefOr[js.Array[String]],
      propertyFilters: js.UndefOr[js.Array[String]],
      releaseIdFilter: js.UndefOr[js.Array[Double]]
    ): js.Promise[js.Array[Release]] = js.native
    
    def getSourceBranches(project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
    
    def getSummaryMailSections(project: String, releaseId: Double): js.Promise[js.Array[SummaryMailSection]] = js.native
    
    def getTags(project: String): js.Promise[js.Array[String]] = js.native
    
    def getTaskAttachmentContent(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[ReadableStream] = js.native
    
    def getTaskAttachments(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      `type`: String
    ): js.Promise[js.Array[ReleaseTaskAttachment]] = js.native
    
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double,
      startLine: js.UndefOr[scala.Nothing],
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double,
      startLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double,
      startLine: Double,
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double,
      startLine: js.UndefOr[scala.Nothing],
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double,
      startLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double,
      startLine: Double,
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    
    def getTasks(project: String, releaseId: Double, environmentId: Double): js.Promise[js.Array[ReleaseTask]] = js.native
    def getTasks(project: String, releaseId: Double, environmentId: Double, attemptId: Double): js.Promise[js.Array[ReleaseTask]] = js.native
    
    def getTasks2(project: String, releaseId: Double, environmentId: Double, attemptId: Double, timelineId: String): js.Promise[js.Array[ReleaseTask]] = js.native
    
    def getTasksForTaskGroup(project: String, releaseId: Double, environmentId: Double, releaseDeployPhaseId: Double): js.Promise[js.Array[ReleaseTask]] = js.native
    
    def listDefinitionEnvironmentTemplates(project: String): js.Promise[js.Array[ReleaseDefinitionEnvironmentTemplate]] = js.native
    def listDefinitionEnvironmentTemplates(project: String, isDeleted: Boolean): js.Promise[js.Array[ReleaseDefinitionEnvironmentTemplate]] = js.native
    
    def sendSummaryMail(mailMessage: MailMessage, project: String, releaseId: Double): js.Promise[Unit] = js.native
    
    def undeleteRelease(project: String, releaseId: Double, comment: String): js.Promise[Unit] = js.native
    
    def undeleteReleaseDefinition(
      releaseDefinitionUndeleteParameter: ReleaseDefinitionUndeleteParameter,
      project: String,
      definitionId: Double
    ): js.Promise[ReleaseDefinition] = js.native
    
    def undeleteReleaseDefinitionEnvironmentTemplate(project: String, templateId: String): js.Promise[ReleaseDefinitionEnvironmentTemplate] = js.native
    
    def updateFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
    
    def updateManualIntervention(
      manualInterventionUpdateMetadata: ManualInterventionUpdateMetadata,
      project: String,
      releaseId: Double,
      manualInterventionId: Double
    ): js.Promise[ManualIntervention] = js.native
    
    def updateRelease(release: Release, project: String, releaseId: Double): js.Promise[Release] = js.native
    
    def updateReleaseApproval(approval: ReleaseApproval, project: String, approvalId: Double): js.Promise[ReleaseApproval] = js.native
    
    def updateReleaseApprovals(approvals: js.Array[ReleaseApproval], project: String): js.Promise[js.Array[ReleaseApproval]] = js.native
    
    def updateReleaseDefinition(releaseDefinition: ReleaseDefinition, project: String): js.Promise[ReleaseDefinition] = js.native
    
    def updateReleaseEnvironment(
      environmentUpdateData: ReleaseEnvironmentUpdateMetadata,
      project: String,
      releaseId: Double,
      environmentId: Double
    ): js.Promise[ReleaseEnvironment] = js.native
    
    def updateReleaseResource(releaseUpdateMetadata: ReleaseUpdateMetadata, project: String, releaseId: Double): js.Promise[Release] = js.native
    
    def updateReleaseSettings(releaseSettings: ReleaseSettings, project: String): js.Promise[ReleaseSettings] = js.native
  }
}
