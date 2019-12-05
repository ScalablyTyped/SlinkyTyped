package typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesRepositoryMod.Repository
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesUserMod.OrganizationSummary
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.demilestoned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.edited
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.labeled
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.milestoned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.opened
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.reopened
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.unassigned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod.Event because Already inherited
- typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ trait IssueWebHookData extends IssueEvent {
  var organization: js.UndefOr[OrganizationSummary] = js.undefined
  var repository: js.UndefOr[Repository] = js.undefined
  var sender: UserSummary
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue,
    sender: UserSummary,
    organization: OrganizationSummary = null,
    repository: Repository = null
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueWebHookData]
  }
}

