package typingsSlinky.sentryWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCommitsOptions extends js.Object {
  var auto: js.UndefOr[Boolean] = js.native
  var commit: js.UndefOr[String] = js.native
  var previousCommit: js.UndefOr[String] = js.native
  var repo: String = js.native
}

object SetCommitsOptions {
  @scala.inline
  def apply(repo: String): SetCommitsOptions = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCommitsOptions]
  }
  @scala.inline
  implicit class SetCommitsOptionsOps[Self <: SetCommitsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCommit")(js.undefined)
        ret
    }
  }
  
}

