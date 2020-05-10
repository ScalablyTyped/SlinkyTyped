package typingsSlinky.semanticRelease.mod

import typingsSlinky.semanticRelease.AnonEmail
import typingsSlinky.semanticRelease.AnonLong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends js.Object {
  /**
  		 * The commit author information.
  		 */
  var author: AnonEmail = js.native
  /**
  		 * The commit body.
  		 */
  var body: String = js.native
  /**
  		 * The commit abbreviated and full hash.
  		 */
  var commit: AnonLong = js.native
  /**
  		 * The committer information.
  		 */
  var committer: AnonEmail = js.native
  /**
  		 * The committer date.
  		 */
  var committerDate: String = js.native
  /**
  		 * The commit hash.
  		 */
  var hash: String = js.native
  /**
  		 * The commit full message (subject and body).
  		 */
  var message: String = js.native
  /**
  		 * The commit subject.
  		 */
  var subject: String = js.native
  /**
  		 * The commit abbreviated and full tree hash.
  		 */
  var tree: AnonLong = js.native
}

object Commit {
  @scala.inline
  def apply(
    author: AnonEmail,
    body: String,
    commit: AnonLong,
    committer: AnonEmail,
    committerDate: String,
    hash: String,
    message: String,
    subject: String,
    tree: AnonLong
  ): Commit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], committerDate = committerDate.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  @scala.inline
  implicit class CommitOps[Self <: Commit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: AnonLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committerDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: AnonLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

