package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  var create: scala.Double = js.native
  var delete: scala.Double = js.native
  var edit: scala.Double = js.native
  var managePermissions: scala.Double = js.native
  var none: scala.Double = js.native
  var read: scala.Double = js.native
}

object Create {
  @scala.inline
  def apply(
    create: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    managePermissions: scala.Double,
    none: scala.Double,
    read: scala.Double
  ): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withRead(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

