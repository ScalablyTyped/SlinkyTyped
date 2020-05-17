package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreIfExists extends js.Object {
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  var overwrite: js.UndefOr[Boolean] = js.native
}

object IgnoreIfExists {
  @scala.inline
  def apply(): IgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfExists]
  }
  @scala.inline
  implicit class IgnoreIfExistsOps[Self <: IgnoreIfExists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreIfExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfExists")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

