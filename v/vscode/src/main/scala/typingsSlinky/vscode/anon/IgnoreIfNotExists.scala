package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreIfNotExists extends js.Object {
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
}

object IgnoreIfNotExists {
  @scala.inline
  def apply(): IgnoreIfNotExists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreIfNotExists]
  }
  @scala.inline
  implicit class IgnoreIfNotExistsOps[Self <: IgnoreIfNotExists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreIfNotExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfNotExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIfNotExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfNotExists")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
  }
  
}

