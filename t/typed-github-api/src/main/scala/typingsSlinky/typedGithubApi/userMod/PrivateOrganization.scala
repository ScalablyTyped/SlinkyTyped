package typingsSlinky.typedGithubApi.userMod

import typingsSlinky.typedGithubApi.anon.Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typedGithubApi.userMod.UserOrOrgSummary because Already inherited
- typingsSlinky.typedGithubApi.userMod.UserOrOrg because Already inherited
- typingsSlinky.typedGithubApi.userMod.PrivateUserOrOrg because var conflicts: avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url. Inlined total_private_repos, owned_private_repos, private_gists, disk_usage, collaborators, plan */ @js.native
trait PrivateOrganization extends Organization {
  var billing_email: String = js.native
  var collaborators: Double = js.native
  var default_repository_settings: String = js.native
  var disk_usage: Double = js.native
  var members_can_create_repositories: Boolean = js.native
  var owned_private_repos: Double = js.native
  var plan: Collaborators = js.native
  var private_gists: Double = js.native
  var total_private_repos: Double = js.native
}

object PrivateOrganization {
  @scala.inline
  def apply(
    avatar_url: String,
    billing_email: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: js.Date,
    default_repository_settings: String,
    description: String,
    disk_usage: Double,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    has_organization_projects: Boolean,
    has_repository_projects: Boolean,
    hooks_url: String,
    html_url: String,
    id: Double,
    issues_url: String,
    location: String,
    login: String,
    members_can_create_repositories: Boolean,
    members_url: String,
    name: String,
    owned_private_repos: Double,
    plan: Collaborators,
    private_gists: Double,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    `type`: typingsSlinky.typedGithubApi.typedGithubApiStrings.Organization,
    updated_at: js.Date,
    url: String
  ): PrivateOrganization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], billing_email = billing_email.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_repository_settings = default_repository_settings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateOrganization]
  }
  @scala.inline
  implicit class PrivateOrganizationOps[Self <: PrivateOrganization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollaborators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_repository_settings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_repository_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisk_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwned_private_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owned_private_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: Collaborators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate_gists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_gists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_private_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_private_repos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

