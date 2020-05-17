package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTrash extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.native
  var useTrash: js.UndefOr[Boolean] = js.native
}

object UseTrash {
  @scala.inline
  def apply(): UseTrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTrash]
  }
  @scala.inline
  implicit class UseTrashOps[Self <: UseTrash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUseTrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTrash")(js.undefined)
        ret
    }
  }
  
}

