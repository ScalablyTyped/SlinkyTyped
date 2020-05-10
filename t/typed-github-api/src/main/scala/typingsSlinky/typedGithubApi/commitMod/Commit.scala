package typingsSlinky.typedGithubApi.commitMod

import typingsSlinky.typedGithubApi.AnonAdditions
import typingsSlinky.typedGithubApi.AnonBloburl
import typingsSlinky.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends CommitSummary {
  var files: js.Array[AnonBloburl] = js.native
  var stats: AnonAdditions = js.native
}

object Commit {
  @scala.inline
  def apply(
    author: UserSummary,
    comments_url: String,
    commit: GitCommitSummary,
    committer: UserSummary,
    files: js.Array[AnonBloburl],
    html_url: String,
    parents: js.Array[CommitRef],
    sha: String,
    stats: AnonAdditions,
    url: String
  ): Commit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  @scala.inline
  implicit class CommitOps[Self <: Commit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[AnonBloburl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonAdditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

