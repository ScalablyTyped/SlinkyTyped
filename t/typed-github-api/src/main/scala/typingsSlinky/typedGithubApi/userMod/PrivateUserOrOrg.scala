package typingsSlinky.typedGithubApi.userMod

import typingsSlinky.typedGithubApi.AnonCollaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateUserOrOrg extends UserOrOrg {
  var collaborators: Double = js.native
  var disk_usage: Double = js.native
  var owned_private_repos: Double = js.native
  var plan: AnonCollaborators = js.native
  var private_gists: Double = js.native
  var total_private_repos: Double = js.native
}

object PrivateUserOrOrg {
  @scala.inline
  def apply(
    avatar_url: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: js.Date,
    disk_usage: Double,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    id: Double,
    location: String,
    login: String,
    name: String,
    owned_private_repos: Double,
    plan: AnonCollaborators,
    private_gists: Double,
    public_gists: Double,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    `type`: typingsSlinky.typedGithubApi.typedGithubApiStrings.User | typingsSlinky.typedGithubApi.typedGithubApiStrings.Organization,
    updated_at: js.Date,
    url: String
  ): PrivateUserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateUserOrOrg]
  }
  @scala.inline
  implicit class PrivateUserOrOrgOps[Self <: PrivateUserOrOrg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollaborators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisk_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwned_private_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owned_private_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: AnonCollaborators): Self = {
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

