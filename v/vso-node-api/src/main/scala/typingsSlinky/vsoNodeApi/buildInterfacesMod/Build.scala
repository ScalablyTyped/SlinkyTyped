package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  var _links: js.Any = js.native
  /**
    * The build number/name of the build.
    */
  var buildNumber: String = js.native
  /**
    * The build number revision.
    */
  var buildNumberRevision: Double = js.native
  /**
    * The build controller. This is only set if the definition type is Xaml.
    */
  var controller: BuildController = js.native
  /**
    * The definition associated with the build.
    */
  var definition: DefinitionReference = js.native
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean = js.native
  /**
    * The identity of the process or person that deleted the build.
    */
  var deletedBy: IdentityRef = js.native
  /**
    * The date the build was deleted.
    */
  var deletedDate: js.Date = js.native
  /**
    * The description of how the build was deleted.
    */
  var deletedReason: String = js.native
  /**
    * A list of demands that represents the agent capabilities required by this build.
    */
  var demands: js.Array[_] = js.native
  /**
    * The time that the build was completed.
    */
  var finishTime: js.Date = js.native
  /**
    * The ID of the build.
    */
  var id: Double = js.native
  /**
    * Indicates whether the build should be skipped by retention policies.
    */
  var keepForever: Boolean = js.native
  /**
    * The identity representing the process or person that last changed the build.
    */
  var lastChangedBy: IdentityRef = js.native
  /**
    * The date the build was last changed.
    */
  var lastChangedDate: js.Date = js.native
  /**
    * Information about the build logs.
    */
  var logs: BuildLogReference = js.native
  /**
    * The orchestration plan for the build.
    */
  var orchestrationPlan: TaskOrchestrationPlanReference = js.native
  /**
    * The parameters for the build.
    */
  var parameters: String = js.native
  /**
    * Orchestration plans associated with the build (build, cleanup)
    */
  var plans: js.Array[TaskOrchestrationPlanReference] = js.native
  /**
    * The build's priority.
    */
  var priority: QueuePriority = js.native
  /**
    * The team project.
    */
  var project: TeamProjectReference = js.native
  var properties: js.Any = js.native
  /**
    * The quality of the xaml build (good, bad, etc.)
    */
  var quality: String = js.native
  /**
    * The queue. This is only set if the definition type is Build.
    */
  var queue: AgentPoolQueue = js.native
  /**
    * Additional options for queueing the build.
    */
  var queueOptions: QueueOptions = js.native
  /**
    * The current position of the build in the queue.
    */
  var queuePosition: Double = js.native
  /**
    * The time that the build was queued.
    */
  var queueTime: js.Date = js.native
  /**
    * The reason that the build was created.
    */
  var reason: BuildReason = js.native
  /**
    * The repository.
    */
  var repository: BuildRepository = js.native
  /**
    * The identity that queued the build.
    */
  var requestedBy: IdentityRef = js.native
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef = js.native
  /**
    * The build result.
    */
  var result: BuildResult = js.native
  /**
    * Indicates whether the build is retained by a release.
    */
  var retainedByRelease: Boolean = js.native
  /**
    * The source branch.
    */
  var sourceBranch: String = js.native
  /**
    * The source version.
    */
  var sourceVersion: String = js.native
  /**
    * The time that the build was started.
    */
  var startTime: js.Date = js.native
  /**
    * The status of the build.
    */
  var status: BuildStatus = js.native
  var tags: js.Array[String] = js.native
  /**
    * Sourceprovider-specific information about what triggered the build
    */
  var triggerInfo: StringDictionary[String] = js.native
  /**
    * The URI of the build.
    */
  var uri: String = js.native
  /**
    * The REST URL of the build.
    */
  var url: String = js.native
  var validationResults: js.Array[BuildRequestValidationResult] = js.native
}

object Build {
  @scala.inline
  def apply(
    _links: js.Any,
    buildNumber: String,
    buildNumberRevision: Double,
    controller: BuildController,
    definition: DefinitionReference,
    deleted: Boolean,
    deletedBy: IdentityRef,
    deletedDate: js.Date,
    deletedReason: String,
    demands: js.Array[_],
    finishTime: js.Date,
    id: Double,
    keepForever: Boolean,
    lastChangedBy: IdentityRef,
    lastChangedDate: js.Date,
    logs: BuildLogReference,
    orchestrationPlan: TaskOrchestrationPlanReference,
    parameters: String,
    plans: js.Array[TaskOrchestrationPlanReference],
    priority: QueuePriority,
    project: TeamProjectReference,
    properties: js.Any,
    quality: String,
    queue: AgentPoolQueue,
    queueOptions: QueueOptions,
    queuePosition: Double,
    queueTime: js.Date,
    reason: BuildReason,
    repository: BuildRepository,
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    result: BuildResult,
    retainedByRelease: Boolean,
    sourceBranch: String,
    sourceVersion: String,
    startTime: js.Date,
    status: BuildStatus,
    tags: js.Array[String],
    triggerInfo: StringDictionary[String],
    uri: String,
    url: String,
    validationResults: js.Array[BuildRequestValidationResult]
  ): Build = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], buildNumber = buildNumber.asInstanceOf[js.Any], buildNumberRevision = buildNumberRevision.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], deletedReason = deletedReason.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], orchestrationPlan = orchestrationPlan.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueOptions = queueOptions.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], retainedByRelease = retainedByRelease.asInstanceOf[js.Any], sourceBranch = sourceBranch.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggerInfo = triggerInfo.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildNumberRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumberRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withController(value: BuildController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: DefinitionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepForever(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepForever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChangedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChangedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogs(value: BuildLogReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrchestrationPlan(value: TaskOrchestrationPlanReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestrationPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlans(value: js.Array[TaskOrchestrationPlanReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: QueuePriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: AgentPoolQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueOptions(value: QueueOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: BuildReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: BuildRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedFor(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: BuildResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetainedByRelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainedByRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: BuildStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerInfo(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationResults(value: js.Array[BuildRequestValidationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

