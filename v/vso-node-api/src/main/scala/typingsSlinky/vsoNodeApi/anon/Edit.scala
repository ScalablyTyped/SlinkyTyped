package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  var edit: scala.Double = js.native
  var manage: scala.Double = js.native
  var managePermissions: scala.Double = js.native
  var none: scala.Double = js.native
}

object Edit {
  @scala.inline
  def apply(edit: scala.Double, manage: scala.Double, managePermissions: scala.Double, none: scala.Double): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  @scala.inline
  implicit class EditOps[Self <: Edit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManage(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagePermissions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

