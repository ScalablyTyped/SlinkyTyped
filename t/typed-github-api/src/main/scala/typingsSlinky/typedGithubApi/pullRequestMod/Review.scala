package typingsSlinky.typedGithubApi.pullRequestMod

import typingsSlinky.typedGithubApi.typedGithubApiStrings.APPROVED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.COMMENTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.DISMISSED
import typingsSlinky.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Review extends js.Object {
  var body: String = js.native
  var commit_id: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var pull_request_url: String = js.native
  var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
  var user: UserSummary = js.native
}

object Review {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    html_url: String,
    id: Double,
    pull_request_url: String,
    state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED,
    user: UserSummary
  ): Review = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  @scala.inline
  implicit class ReviewOps[Self <: Review] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: UserSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

