package typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod

import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesLabelMod.Label
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesMilestoneMod.Milestone
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesRepositoryMod.Repository
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var assignee: UserSummary | Null
  var assignees: js.Array[UserSummary]
  var body: String
  var closed_at: js.Date | Null
  var closed_by: UserSummary | Null
  var comments: Double
  var comments_url: String
  var created_at: js.Date
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[Label]
  var labels_url: String
  var locked: Boolean
  var milestone: Milestone | Null
  var number: Double
  var pull_request: js.UndefOr[PullRequestExtension] = js.undefined
  var repository: js.UndefOr[Repository] = js.undefined
  var repository_url: String
  var state: open | closed
  var title: String
  var updated_at: js.Date
  var url: String
  var user: UserSummary
}

object Issue {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    body: String,
    comments: Double,
    comments_url: String,
    created_at: js.Date,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[Label],
    labels_url: String,
    locked: Boolean,
    number: Double,
    repository_url: String,
    state: open | closed,
    title: String,
    updated_at: js.Date,
    url: String,
    user: UserSummary,
    assignee: UserSummary = null,
    closed_at: js.Date = null,
    closed_by: UserSummary = null,
    milestone: Milestone = null,
    pull_request: PullRequestExtension = null,
    repository: Repository = null
  ): Issue = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at.asInstanceOf[js.Any])
    if (closed_by != null) __obj.updateDynamic("closed_by")(closed_by.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (pull_request != null) __obj.updateDynamic("pull_request")(pull_request.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

