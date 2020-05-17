package typingsSlinky.yeomanGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Git extends js.Object {
  val git: Email = js.native
  val github: Username = js.native
}

object Git {
  @scala.inline
  def apply(git: Email, github: Username): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
  @scala.inline
  implicit class GitOps[Self <: Git] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGit(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGithub(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("github")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

