package typingsSlinky.typedGithubApi.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserOrOrgSummary extends js.Object {
  var avatar_url: String = js.native
  var events_url: String = js.native
  var id: Double = js.native
  var login: String = js.native
  var repos_url: String = js.native
  var `type`: typingsSlinky.typedGithubApi.typedGithubApiStrings.User | typingsSlinky.typedGithubApi.typedGithubApiStrings.Organization = js.native
  var url: String = js.native
}

object UserOrOrgSummary {
  @scala.inline
  def apply(
    avatar_url: String,
    events_url: String,
    id: Double,
    login: String,
    repos_url: String,
    `type`: typingsSlinky.typedGithubApi.typedGithubApiStrings.User | typingsSlinky.typedGithubApi.typedGithubApiStrings.Organization,
    url: String
  ): UserOrOrgSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOrOrgSummary]
  }
  @scala.inline
  implicit class UserOrOrgSummaryOps[Self <: UserOrOrgSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: typingsSlinky.typedGithubApi.typedGithubApiStrings.User | typingsSlinky.typedGithubApi.typedGithubApiStrings.Organization
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

