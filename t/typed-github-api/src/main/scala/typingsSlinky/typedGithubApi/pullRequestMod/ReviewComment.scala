package typingsSlinky.typedGithubApi.pullRequestMod

import typingsSlinky.typedGithubApi.issueMod.IssueComment
import typingsSlinky.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewComment extends IssueComment {
  var commit_id: String = js.native
  var diff_hunk: String = js.native
  var original_commit_id: String = js.native
  var original_position: Double = js.native
  var path: String = js.native
  var position: Double = js.native
  var pull_request_review_id: Double = js.native
  var pull_request_url: String = js.native
}

object ReviewComment {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    created_at: js.Date,
    diff_hunk: String,
    html_url: String,
    id: Double,
    original_commit_id: String,
    original_position: Double,
    path: String,
    position: Double,
    pull_request_review_id: Double,
    pull_request_url: String,
    updated_at: js.Date,
    url: String,
    user: UserSummary
  ): ReviewComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewComment]
  }
  @scala.inline
  implicit class ReviewCommentOps[Self <: ReviewComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiff_hunk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff_hunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_commit_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request_review_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request_review_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

