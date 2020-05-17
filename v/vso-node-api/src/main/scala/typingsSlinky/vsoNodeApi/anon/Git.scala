package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Git extends js.Object {
  var git: scala.Double = js.native
  var tfvc: scala.Double = js.native
}

object Git {
  @scala.inline
  def apply(git: scala.Double, tfvc: scala.Double): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
  @scala.inline
  implicit class GitOps[Self <: Git] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvc(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

