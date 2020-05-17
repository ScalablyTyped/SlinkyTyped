package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllPermissions extends js.Object {
  var allPermissions: scala.Double = js.native
  var delete: scala.Double = js.native
  var edit: scala.Double = js.native
  var manage: scala.Double = js.native
  var none: scala.Double = js.native
  var view: scala.Double = js.native
}

object AllPermissions {
  @scala.inline
  def apply(
    allPermissions: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    manage: scala.Double,
    none: scala.Double,
    view: scala.Double
  ): AllPermissions = {
    val __obj = js.Dynamic.literal(allPermissions = allPermissions.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermissions]
  }
  @scala.inline
  implicit class AllPermissionsOps[Self <: AllPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllPermissions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

