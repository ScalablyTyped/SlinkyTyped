package typingsSlinky.typedGithubApi.interfacesPullRequestMod

import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import typingsSlinky.typedGithubApi.typedGithubApiStrings.APPROVED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.COMMENTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.DISMISSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Review extends js.Object {
  var body: String = js.native
  var commitSha: String = js.native
  var createdBy: UserSummary = js.native
  var htmlUri: String = js.native
  var id: Double = js.native
  var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
}

object Review {
  @scala.inline
  def apply(
    body: String,
    commitSha: String,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
  ): Review = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commitSha = commitSha.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
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
    def withCommitSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitSha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: UserSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

