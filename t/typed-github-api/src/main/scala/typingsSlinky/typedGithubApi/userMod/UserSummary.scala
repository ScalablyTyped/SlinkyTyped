package typingsSlinky.typedGithubApi.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSummary extends UserOrOrgSummary {
  var followers_url: String = js.native
  var following_url: String = js.native
  var gists_url: String = js.native
  var gravatar_id: String = js.native
  var html_url: String = js.native
  var organizations_url: String = js.native
  var received_events_url: String = js.native
  var site_admin: Boolean = js.native
  var starred_url: String = js.native
  var subscriptions_url: String = js.native
  @JSName("type")
  var type_UserSummary: typingsSlinky.typedGithubApi.typedGithubApiStrings.User = js.native
}

object UserSummary {
  @scala.inline
  def apply(
    avatar_url: String,
    events_url: String,
    followers_url: String,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    html_url: String,
    id: Double,
    login: String,
    organizations_url: String,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: typingsSlinky.typedGithubApi.typedGithubApiStrings.User,
    url: String
  ): UserSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSummary]
  }
  @scala.inline
  implicit class UserSummaryOps[Self <: UserSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGists_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gists_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravatar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravatar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizations_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceived_events_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received_events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSite_admin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarred_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.typedGithubApi.typedGithubApiStrings.User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

