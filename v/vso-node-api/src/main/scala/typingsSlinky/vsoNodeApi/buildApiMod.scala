package typingsSlinky.vsoNodeApi

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.vsoNodeApi.buildInterfacesMod.Build
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildArtifact
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildBadge
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildController
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildDefinition
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildDefinitionReference
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildDefinitionRevision
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildDefinitionTemplate
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildLog
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildMetric
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionDefinition
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildQueryOrder
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReportMetadata
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildResourceUsage
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildResult
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildSettings
import typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildStatus
import typingsSlinky.vsoNodeApi.buildInterfacesMod.Change
import typingsSlinky.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder
import typingsSlinky.vsoNodeApi.buildInterfacesMod.Folder
import typingsSlinky.vsoNodeApi.buildInterfacesMod.FolderQueryOrder
import typingsSlinky.vsoNodeApi.buildInterfacesMod.QueryDeletedOption
import typingsSlinky.vsoNodeApi.buildInterfacesMod.RepositoryWebhook
import typingsSlinky.vsoNodeApi.buildInterfacesMod.SourceProviderAttributes
import typingsSlinky.vsoNodeApi.buildInterfacesMod.SourceRepository
import typingsSlinky.vsoNodeApi.buildInterfacesMod.Timeline
import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoNodeApi.vssinterfacesMod.JsonPatchDocument
import typingsSlinky.vsoNodeApi.vssinterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/BuildApi", JSImport.Namespace)
@js.native
object buildApiMod extends js.Object {
  
  @js.native
  class BuildApi protected () extends IBuildApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  @js.native
  object BuildApi extends js.Object {
    
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IBuildApi extends ClientApiBase {
    
    def addBuildTag(project: String, buildId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def addBuildTags(tags: js.Array[String], project: String, buildId: Double): js.Promise[js.Array[String]] = js.native
    
    def addDefinitionTag(project: String, definitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def addDefinitionTags(tags: js.Array[String], project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
    
    def createArtifact(artifact: BuildArtifact, buildId: Double): js.Promise[BuildArtifact] = js.native
    def createArtifact(artifact: BuildArtifact, buildId: Double, project: String): js.Promise[BuildArtifact] = js.native
    
    def createDefinition(definition: BuildDefinition): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: js.UndefOr[scala.Nothing],
      definitionToCloneId: js.UndefOr[scala.Nothing],
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def createDefinition(definition: BuildDefinition, project: js.UndefOr[scala.Nothing], definitionToCloneId: Double): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: js.UndefOr[scala.Nothing],
      definitionToCloneId: Double,
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def createDefinition(definition: BuildDefinition, project: String): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: String,
      definitionToCloneId: js.UndefOr[scala.Nothing],
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def createDefinition(definition: BuildDefinition, project: String, definitionToCloneId: Double): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: String,
      definitionToCloneId: Double,
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    
    def createFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
    
    def deleteBuild(buildId: Double): js.Promise[Unit] = js.native
    def deleteBuild(buildId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteBuildTag(project: String, buildId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def deleteDefinition(definitionId: Double): js.Promise[Unit] = js.native
    def deleteDefinition(definitionId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteDefinitionTag(project: String, definitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def deleteFolder(project: String, path: String): js.Promise[Unit] = js.native
    
    def deleteTemplate(project: String, templateId: String): js.Promise[Unit] = js.native
    
    def getArtifact(buildId: Double, artifactName: String): js.Promise[BuildArtifact] = js.native
    def getArtifact(buildId: Double, artifactName: String, project: String): js.Promise[BuildArtifact] = js.native
    
    def getArtifactContentZip(buildId: Double, artifactName: String): js.Promise[ReadableStream] = js.native
    def getArtifactContentZip(buildId: Double, artifactName: String, project: String): js.Promise[ReadableStream] = js.native
    
    def getArtifacts(buildId: Double): js.Promise[js.Array[BuildArtifact]] = js.native
    def getArtifacts(buildId: Double, project: String): js.Promise[js.Array[BuildArtifact]] = js.native
    
    def getBadge(project: String, definitionId: Double): js.Promise[String] = js.native
    def getBadge(project: String, definitionId: Double, branchName: String): js.Promise[String] = js.native
    
    def getBuild(buildId: Double): js.Promise[Build] = js.native
    def getBuild(buildId: Double, project: js.UndefOr[scala.Nothing], propertyFilters: String): js.Promise[Build] = js.native
    def getBuild(buildId: Double, project: String): js.Promise[Build] = js.native
    def getBuild(buildId: Double, project: String, propertyFilters: String): js.Promise[Build] = js.native
    
    def getBuildBadge(project: String, repoType: String): js.Promise[BuildBadge] = js.native
    def getBuildBadge(project: String, repoType: String, repoId: js.UndefOr[scala.Nothing], branchName: String): js.Promise[BuildBadge] = js.native
    def getBuildBadge(project: String, repoType: String, repoId: String): js.Promise[BuildBadge] = js.native
    def getBuildBadge(project: String, repoType: String, repoId: String, branchName: String): js.Promise[BuildBadge] = js.native
    
    def getBuildBadgeData(project: String, repoType: String): js.Promise[String] = js.native
    def getBuildBadgeData(project: String, repoType: String, repoId: js.UndefOr[scala.Nothing], branchName: String): js.Promise[String] = js.native
    def getBuildBadgeData(project: String, repoType: String, repoId: String): js.Promise[String] = js.native
    def getBuildBadgeData(project: String, repoType: String, repoId: String, branchName: String): js.Promise[String] = js.native
    
    def getBuildChanges(project: String, buildId: Double): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: js.UndefOr[scala.Nothing],
      top: Double,
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: String): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: String,
      top: js.UndefOr[scala.Nothing],
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: String, top: Double): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: String,
      top: Double,
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    
    def getBuildController(controllerId: Double): js.Promise[BuildController] = js.native
    
    def getBuildControllers(): js.Promise[js.Array[BuildController]] = js.native
    def getBuildControllers(name: String): js.Promise[js.Array[BuildController]] = js.native
    
    def getBuildLog(project: String, buildId: Double, logId: Double): js.Promise[ReadableStream] = js.native
    def getBuildLog(
      project: String,
      buildId: Double,
      logId: Double,
      startLine: js.UndefOr[scala.Nothing],
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Double): js.Promise[ReadableStream] = js.native
    def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Double, endLine: Double): js.Promise[ReadableStream] = js.native
    
    def getBuildLogLines(project: String, buildId: Double, logId: Double): js.Promise[js.Array[String]] = js.native
    def getBuildLogLines(
      project: String,
      buildId: Double,
      logId: Double,
      startLine: js.UndefOr[scala.Nothing],
      endLine: Double
    ): js.Promise[js.Array[String]] = js.native
    def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Double): js.Promise[js.Array[String]] = js.native
    def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Double, endLine: Double): js.Promise[js.Array[String]] = js.native
    
    def getBuildLogs(project: String, buildId: Double): js.Promise[js.Array[BuildLog]] = js.native
    
    def getBuildLogsZip(project: String, buildId: Double): js.Promise[ReadableStream] = js.native
    
    def getBuildOptionDefinitions(): js.Promise[js.Array[BuildOptionDefinition]] = js.native
    def getBuildOptionDefinitions(project: String): js.Promise[js.Array[BuildOptionDefinition]] = js.native
    
    def getBuildProperties(project: String, buildId: Double): js.Promise[_] = js.native
    def getBuildProperties(project: String, buildId: Double, filter: js.Array[String]): js.Promise[_] = js.native
    
    def getBuildReport(project: String, buildId: Double): js.Promise[BuildReportMetadata] = js.native
    def getBuildReport(project: String, buildId: Double, `type`: String): js.Promise[BuildReportMetadata] = js.native
    
    def getBuildReportHtmlContent(project: String, buildId: Double): js.Promise[ReadableStream] = js.native
    def getBuildReportHtmlContent(project: String, buildId: Double, `type`: String): js.Promise[ReadableStream] = js.native
    
    def getBuildSettings(): js.Promise[BuildSettings] = js.native
    
    def getBuildTags(project: String, buildId: Double): js.Promise[js.Array[String]] = js.native
    
    def getBuildTimeline(project: String, buildId: Double): js.Promise[Timeline] = js.native
    def getBuildTimeline(
      project: String,
      buildId: Double,
      timelineId: js.UndefOr[scala.Nothing],
      changeId: js.UndefOr[scala.Nothing],
      planId: String
    ): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: js.UndefOr[scala.Nothing], changeId: Double): js.Promise[Timeline] = js.native
    def getBuildTimeline(
      project: String,
      buildId: Double,
      timelineId: js.UndefOr[scala.Nothing],
      changeId: Double,
      planId: String
    ): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String): js.Promise[Timeline] = js.native
    def getBuildTimeline(
      project: String,
      buildId: Double,
      timelineId: String,
      changeId: js.UndefOr[scala.Nothing],
      planId: String
    ): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Double): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Double, planId: String): js.Promise[Timeline] = js.native
    
    def getBuildWorkItemsRefs(project: String, buildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
    def getBuildWorkItemsRefs(project: String, buildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
    
    def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[String], project: String, buildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
    def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[String], project: String, buildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
    
    def getBuilds(
      project: js.UndefOr[String],
      definitions: js.UndefOr[js.Array[Double]],
      queues: js.UndefOr[js.Array[Double]],
      buildNumber: js.UndefOr[String],
      minTime: js.UndefOr[js.Date],
      maxTime: js.UndefOr[js.Date],
      requestedFor: js.UndefOr[String],
      reasonFilter: js.UndefOr[BuildReason],
      statusFilter: js.UndefOr[BuildStatus],
      resultFilter: js.UndefOr[BuildResult],
      tagFilters: js.UndefOr[js.Array[String]],
      properties: js.UndefOr[js.Array[String]],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String],
      maxBuildsPerDefinition: js.UndefOr[Double],
      deletedFilter: js.UndefOr[QueryDeletedOption],
      queryOrder: js.UndefOr[BuildQueryOrder],
      branchName: js.UndefOr[String],
      buildIds: js.UndefOr[js.Array[Double]],
      repositoryId: js.UndefOr[String],
      repositoryType: js.UndefOr[String]
    ): js.Promise[js.Array[Build]] = js.native
    
    def getChangesBetweenBuilds(project: String): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(
      project: String,
      fromBuildId: js.UndefOr[scala.Nothing],
      toBuildId: js.UndefOr[scala.Nothing],
      top: Double
    ): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: js.UndefOr[scala.Nothing], toBuildId: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: js.UndefOr[scala.Nothing], toBuildId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
    
    def getDefinition(definitionId: Double): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date,
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: js.UndefOr[scala.Nothing], revision: Double): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.Date
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date,
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: js.UndefOr[scala.Nothing],
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String, revision: Double): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.UndefOr[scala.Nothing],
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String, revision: Double, minMetricsTime: js.Date): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.UndefOr[scala.Nothing],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    
    def getDefinitionMetrics(project: String, definitionId: Double): js.Promise[js.Array[BuildMetric]] = js.native
    def getDefinitionMetrics(project: String, definitionId: Double, minMetricsTime: js.Date): js.Promise[js.Array[BuildMetric]] = js.native
    
    def getDefinitionProperties(project: String, definitionId: Double): js.Promise[_] = js.native
    def getDefinitionProperties(project: String, definitionId: Double, filter: js.Array[String]): js.Promise[_] = js.native
    
    def getDefinitionRevisions(project: String, definitionId: Double): js.Promise[js.Array[BuildDefinitionRevision]] = js.native
    
    def getDefinitionTags(project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
    def getDefinitionTags(project: String, definitionId: Double, revision: Double): js.Promise[js.Array[String]] = js.native
    
    def getDefinitions(
      project: js.UndefOr[String],
      name: js.UndefOr[String],
      repositoryId: js.UndefOr[String],
      repositoryType: js.UndefOr[String],
      queryOrder: js.UndefOr[DefinitionQueryOrder],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String],
      minMetricsTime: js.UndefOr[js.Date],
      definitionIds: js.UndefOr[js.Array[Double]],
      path: js.UndefOr[String],
      builtAfter: js.UndefOr[js.Date],
      notBuiltAfter: js.UndefOr[js.Date],
      includeAllProperties: js.UndefOr[Boolean],
      includeLatestBuilds: js.UndefOr[Boolean],
      taskIdFilter: js.UndefOr[String]
    ): js.Promise[js.Array[BuildDefinitionReference]] = js.native
    
    def getFolders(project: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: js.UndefOr[scala.Nothing], queryOrder: FolderQueryOrder): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String, queryOrder: FolderQueryOrder): js.Promise[js.Array[Folder]] = js.native
    
    def getProjectMetrics(project: String): js.Promise[js.Array[BuildMetric]] = js.native
    def getProjectMetrics(project: String, metricAggregationType: js.UndefOr[scala.Nothing], minMetricsTime: js.Date): js.Promise[js.Array[BuildMetric]] = js.native
    def getProjectMetrics(project: String, metricAggregationType: String): js.Promise[js.Array[BuildMetric]] = js.native
    def getProjectMetrics(project: String, metricAggregationType: String, minMetricsTime: js.Date): js.Promise[js.Array[BuildMetric]] = js.native
    
    def getResourceUsage(): js.Promise[BuildResourceUsage] = js.native
    
    def getTags(project: String): js.Promise[js.Array[String]] = js.native
    
    def getTemplate(project: String, templateId: String): js.Promise[BuildDefinitionTemplate] = js.native
    
    def getTemplates(project: String): js.Promise[js.Array[BuildDefinitionTemplate]] = js.native
    
    def getWorkItemsBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
    def getWorkItemsBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
    
    def listBranches(project: String, providerName: String): js.Promise[js.Array[String]] = js.native
    def listBranches(
      project: String,
      providerName: String,
      serviceEndpointId: js.UndefOr[scala.Nothing],
      repository: String
    ): js.Promise[js.Array[String]] = js.native
    def listBranches(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[String]] = js.native
    def listBranches(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[String]] = js.native
    
    def listRepositories(project: String, providerName: String): js.Promise[js.Array[SourceRepository]] = js.native
    def listRepositories(
      project: String,
      providerName: String,
      serviceEndpointId: js.UndefOr[scala.Nothing],
      repository: String
    ): js.Promise[js.Array[SourceRepository]] = js.native
    def listRepositories(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[SourceRepository]] = js.native
    def listRepositories(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[SourceRepository]] = js.native
    
    def listSourceProviders(project: String): js.Promise[js.Array[SourceProviderAttributes]] = js.native
    
    def listWebhooks(project: String, providerName: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    def listWebhooks(
      project: String,
      providerName: String,
      serviceEndpointId: js.UndefOr[scala.Nothing],
      repository: String
    ): js.Promise[js.Array[RepositoryWebhook]] = js.native
    def listWebhooks(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    def listWebhooks(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    
    def queueBuild(build: Build): js.Promise[Build] = js.native
    def queueBuild(
      build: Build,
      project: js.UndefOr[scala.Nothing],
      ignoreWarnings: js.UndefOr[scala.Nothing],
      checkInTicket: String
    ): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: js.UndefOr[scala.Nothing], ignoreWarnings: Boolean): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: js.UndefOr[scala.Nothing], ignoreWarnings: Boolean, checkInTicket: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String, ignoreWarnings: js.UndefOr[scala.Nothing], checkInTicket: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String, ignoreWarnings: Boolean): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String, ignoreWarnings: Boolean, checkInTicket: String): js.Promise[Build] = js.native
    
    def saveTemplate(template: BuildDefinitionTemplate, project: String, templateId: String): js.Promise[BuildDefinitionTemplate] = js.native
    
    def updateBuild(build: Build, buildId: Double): js.Promise[Build] = js.native
    def updateBuild(build: Build, buildId: Double, project: String): js.Promise[Build] = js.native
    
    def updateBuildProperties(customHeaders: js.Any, document: JsonPatchDocument, project: String, buildId: Double): js.Promise[_] = js.native
    
    def updateBuildSettings(settings: BuildSettings): js.Promise[BuildSettings] = js.native
    
    def updateBuilds(builds: js.Array[Build]): js.Promise[js.Array[Build]] = js.native
    def updateBuilds(builds: js.Array[Build], project: String): js.Promise[js.Array[Build]] = js.native
    
    def updateDefinition(definition: BuildDefinition, definitionId: Double): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      secretsSourceDefinitionId: js.UndefOr[scala.Nothing],
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      secretsSourceDefinitionId: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: js.UndefOr[scala.Nothing],
      secretsSourceDefinitionId: Double,
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(definition: BuildDefinition, definitionId: Double, project: String): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: String,
      secretsSourceDefinitionId: js.UndefOr[scala.Nothing],
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: String,
      secretsSourceDefinitionId: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: String,
      secretsSourceDefinitionId: Double,
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    
    def updateDefinitionProperties(customHeaders: js.Any, document: JsonPatchDocument, project: String, definitionId: Double): js.Promise[_] = js.native
    
    def updateFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
  }
}
