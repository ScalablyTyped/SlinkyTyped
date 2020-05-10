package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.WebApiTagDefinition
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import typingsSlinky.vsoNodeApi.vssinterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequest extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  /**
    * A string which uniquely identifies this pull request. To generate an artifact ID for a pull request, use this template: ```vstfs:///Git/PullRequestId/{projectId}/{repositoryId}/{pullRequestId}```
    */
  var artifactId: String = js.native
  /**
    * If set, auto-complete is enabled for this pull request and this is the identity that enabled it.
    */
  var autoCompleteSetBy: IdentityRef = js.native
  /**
    * The user who closed the pull request.
    */
  var closedBy: IdentityRef = js.native
  /**
    * The date when the pull request was closed (completed, abandoned, or merged externally).
    */
  var closedDate: js.Date = js.native
  /**
    * The code review ID of the pull request. Used internally.
    */
  var codeReviewId: Double = js.native
  /**
    * The commits contained in the pull request.
    */
  var commits: js.Array[GitCommitRef] = js.native
  /**
    * Options which affect how the pull request will be merged when it is completed.
    */
  var completionOptions: GitPullRequestCompletionOptions = js.native
  /**
    * The most recent date at which the pull request entered the queue to be completed. Used internally.
    */
  var completionQueueTime: js.Date = js.native
  /**
    * The identity of the user who created the pull request.
    */
  var createdBy: IdentityRef = js.native
  /**
    * The date when the pull request was created.
    */
  var creationDate: js.Date = js.native
  /**
    * The description of the pull request.
    */
  var description: String = js.native
  /**
    * If this is a PR from a fork this will contain information about its source.
    */
  var forkSource: GitForkRef = js.native
  /**
    * The labels associated with the pull request.
    */
  var labels: js.Array[WebApiTagDefinition] = js.native
  /**
    * The commit of the most recent pull request merge. If empty, the most recent merge is in progress or was unsuccessful.
    */
  var lastMergeCommit: GitCommitRef = js.native
  /**
    * The commit at the head of the source branch at the time of the last pull request merge.
    */
  var lastMergeSourceCommit: GitCommitRef = js.native
  /**
    * The commit at the head of the target branch at the time of the last pull request merge.
    */
  var lastMergeTargetCommit: GitCommitRef = js.native
  /**
    * If set, pull request merge failed for this reason.
    */
  var mergeFailureMessage: String = js.native
  /**
    * The type of failure (if any) of the pull request merge.
    */
  var mergeFailureType: PullRequestMergeFailureType = js.native
  /**
    * The ID of the job used to run the pull request merge. Used internally.
    */
  var mergeId: String = js.native
  /**
    * Options used when the pull request merge runs. These are separate from completion options since completion happens only once and a new merge will run every time the source branch of the pull request changes.
    */
  var mergeOptions: GitPullRequestMergeOptions = js.native
  /**
    * The current status of the pull request merge.
    */
  var mergeStatus: PullRequestAsyncStatus = js.native
  /**
    * The ID of the pull request.
    */
  var pullRequestId: Double = js.native
  /**
    * Used internally.
    */
  var remoteUrl: String = js.native
  /**
    * The repository containing the target branch of the pull request.
    */
  var repository: GitRepository = js.native
  /**
    * A list of reviewers on the pull request along with the state of their votes.
    */
  var reviewers: js.Array[IdentityRefWithVote] = js.native
  /**
    * The name of the source branch of the pull request.
    */
  var sourceRefName: String = js.native
  /**
    * The status of the pull request.
    */
  var status: PullRequestStatus = js.native
  /**
    * If true, this pull request supports multiple iterations. Iteration support means individual pushes to the source branch of the pull request can be reviewed and comments left in one iteration will be tracked across future iterations.
    */
  var supportsIterations: Boolean = js.native
  /**
    * The name of the target branch of the pull request.
    */
  var targetRefName: String = js.native
  /**
    * The title of the pull request.
    */
  var title: String = js.native
  /**
    * Used internally.
    */
  var url: String = js.native
  /**
    * Any work item references associated with this pull request.
    */
  var workItemRefs: js.Array[ResourceRef] = js.native
}

object GitPullRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    artifactId: String,
    autoCompleteSetBy: IdentityRef,
    closedBy: IdentityRef,
    closedDate: js.Date,
    codeReviewId: Double,
    commits: js.Array[GitCommitRef],
    completionOptions: GitPullRequestCompletionOptions,
    completionQueueTime: js.Date,
    createdBy: IdentityRef,
    creationDate: js.Date,
    description: String,
    forkSource: GitForkRef,
    labels: js.Array[WebApiTagDefinition],
    lastMergeCommit: GitCommitRef,
    lastMergeSourceCommit: GitCommitRef,
    lastMergeTargetCommit: GitCommitRef,
    mergeFailureMessage: String,
    mergeFailureType: PullRequestMergeFailureType,
    mergeId: String,
    mergeOptions: GitPullRequestMergeOptions,
    mergeStatus: PullRequestAsyncStatus,
    pullRequestId: Double,
    remoteUrl: String,
    repository: GitRepository,
    reviewers: js.Array[IdentityRefWithVote],
    sourceRefName: String,
    status: PullRequestStatus,
    supportsIterations: Boolean,
    targetRefName: String,
    title: String,
    url: String,
    workItemRefs: js.Array[ResourceRef]
  ): GitPullRequest = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], autoCompleteSetBy = autoCompleteSetBy.asInstanceOf[js.Any], closedBy = closedBy.asInstanceOf[js.Any], closedDate = closedDate.asInstanceOf[js.Any], codeReviewId = codeReviewId.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], completionOptions = completionOptions.asInstanceOf[js.Any], completionQueueTime = completionQueueTime.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forkSource = forkSource.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], lastMergeSourceCommit = lastMergeSourceCommit.asInstanceOf[js.Any], lastMergeTargetCommit = lastMergeTargetCommit.asInstanceOf[js.Any], mergeFailureMessage = mergeFailureMessage.asInstanceOf[js.Any], mergeFailureType = mergeFailureType.asInstanceOf[js.Any], mergeId = mergeId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], mergeStatus = mergeStatus.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], sourceRefName = sourceRefName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], supportsIterations = supportsIterations.asInstanceOf[js.Any], targetRefName = targetRefName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemRefs = workItemRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequest]
  }
  @scala.inline
  implicit class GitPullRequestOps[Self <: GitPullRequest] (val x: Self) extends AnyVal {
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
    def withArtifactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCompleteSetBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteSetBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeReviewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeReviewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: js.Array[GitCommitRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionOptions(value: GitPullRequestCompletionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionQueueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionQueueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForkSource(value: GitForkRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[WebApiTagDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMergeCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMergeCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMergeSourceCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMergeSourceCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMergeTargetCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMergeTargetCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeFailureType(value: PullRequestMergeFailureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFailureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOptions(value: GitPullRequestMergeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeStatus(value: PullRequestAsyncStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: GitRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewers(value: js.Array[IdentityRefWithVote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PullRequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsIterations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemRefs(value: js.Array[ResourceRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemRefs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

