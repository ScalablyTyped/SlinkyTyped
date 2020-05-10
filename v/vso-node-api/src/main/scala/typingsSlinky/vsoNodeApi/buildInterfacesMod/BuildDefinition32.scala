package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typingsSlinky.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinition32 extends BuildDefinitionReference32 {
  /**
    * Indicates whether badges are enabled for this definition
    */
  var badgeEnabled: Boolean = js.native
  var build: js.Array[BuildDefinitionStep] = js.native
  /**
    * The build number format
    */
  var buildNumberFormat: String = js.native
  /**
    * The comment entered when saving the definition
    */
  var comment: String = js.native
  var demands: js.Array[_] = js.native
  /**
    * The description
    */
  var description: String = js.native
  /**
    * The drop location for the definition
    */
  var dropLocation: String = js.native
  /**
    * The job authorization scope for builds which are queued against this definition
    */
  var jobAuthorizationScope: BuildAuthorizationScope = js.native
  /**
    * The job cancel timeout in minutes for builds which are cancelled by user for this definition
    */
  var jobCancelTimeoutInMinutes: Double = js.native
  /**
    * The job execution timeout in minutes for builds which are queued against this definition
    */
  var jobTimeoutInMinutes: Double = js.native
  var latestBuild: Build = js.native
  var latestCompletedBuild: Build = js.native
  var options: js.Array[BuildOption] = js.native
  /**
    * Process Parameters
    */
  var processParameters: ProcessParameters = js.native
  var properties: js.Any = js.native
  /**
    * The repository
    */
  var repository: BuildRepository = js.native
  var retentionRules: js.Array[RetentionPolicy] = js.native
  var tags: js.Array[String] = js.native
  var triggers: js.Array[BuildTrigger] = js.native
  var variables: StringDictionary[BuildDefinitionVariable] = js.native
}

object BuildDefinition32 {
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: IdentityRef,
    badgeEnabled: Boolean,
    build: js.Array[BuildDefinitionStep],
    buildNumberFormat: String,
    comment: String,
    createdDate: js.Date,
    demands: js.Array[_],
    description: String,
    draftOf: DefinitionReference,
    drafts: js.Array[DefinitionReference],
    dropLocation: String,
    id: Double,
    jobAuthorizationScope: BuildAuthorizationScope,
    jobCancelTimeoutInMinutes: Double,
    jobTimeoutInMinutes: Double,
    latestBuild: Build,
    latestCompletedBuild: Build,
    metrics: js.Array[BuildMetric],
    name: String,
    options: js.Array[BuildOption],
    path: String,
    processParameters: ProcessParameters,
    project: TeamProjectReference,
    properties: js.Any,
    quality: DefinitionQuality,
    queue: AgentPoolQueue,
    queueStatus: DefinitionQueueStatus,
    repository: BuildRepository,
    retentionRules: js.Array[RetentionPolicy],
    revision: Double,
    tags: js.Array[String],
    triggers: js.Array[BuildTrigger],
    `type`: DefinitionType,
    uri: String,
    url: String,
    variables: StringDictionary[BuildDefinitionVariable]
  ): BuildDefinition32 = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], authoredBy = authoredBy.asInstanceOf[js.Any], badgeEnabled = badgeEnabled.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildNumberFormat = buildNumberFormat.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], draftOf = draftOf.asInstanceOf[js.Any], drafts = drafts.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobAuthorizationScope = jobAuthorizationScope.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], latestBuild = latestBuild.asInstanceOf[js.Any], latestCompletedBuild = latestCompletedBuild.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], retentionRules = retentionRules.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinition32]
  }
  @scala.inline
  implicit class BuildDefinition32Ops[Self <: BuildDefinition32] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: js.Array[BuildDefinitionStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildNumberFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobAuthorizationScope(value: BuildAuthorizationScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobAuthorizationScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobCancelTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCancelTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestBuild(value: Build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestCompletedBuild(value: Build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestCompletedBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[BuildOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
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
    def withRepository(value: BuildRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionRules(value: js.Array[RetentionPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: js.Array[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[BuildDefinitionVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

