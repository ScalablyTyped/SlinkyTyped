package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameInfoOptions extends js.Object {
  val allowRenameOfImportPath: js.UndefOr[Boolean] = js.native
}

object RenameInfoOptions {
  @scala.inline
  def apply(): RenameInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameInfoOptions]
  }
  @scala.inline
  implicit class RenameInfoOptionsOps[Self <: RenameInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRenameOfImportPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRenameOfImportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRenameOfImportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRenameOfImportPath")(js.undefined)
        ret
    }
  }
  
}

