package typingsSlinky.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGit extends js.Object {
  val git: AnonEmail = js.native
  val github: AnonUsername = js.native
}

object AnonGit {
  @scala.inline
  def apply(git: AnonEmail, github: AnonUsername): AnonGit = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGit]
  }
  @scala.inline
  implicit class AnonGitOps[Self <: AnonGit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGit(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGithub(value: AnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("github")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

