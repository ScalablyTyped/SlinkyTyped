package typingsSlinky.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerGroupList> */
@js.native
trait PartialServerGroupList extends js.Object {
  var iconid: js.UndefOr[Double] = js.native
  var n_member_addp: js.UndefOr[Double] = js.native
  var n_member_removep: js.UndefOr[Double] = js.native
  var n_modifyp: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namemode: js.UndefOr[Double] = js.native
  var savedb: js.UndefOr[Double] = js.native
  var sgid: js.UndefOr[Double] = js.native
  var sortid: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
}

object PartialServerGroupList {
  @scala.inline
  def apply(): PartialServerGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerGroupList]
  }
  @scala.inline
  implicit class PartialServerGroupListOps[Self <: PartialServerGroupList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconid")(js.undefined)
        ret
    }
    @scala.inline
    def withN_member_addp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_addp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN_member_addp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_addp")(js.undefined)
        ret
    }
    @scala.inline
    def withN_member_removep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_removep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN_member_removep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_removep")(js.undefined)
        ret
    }
    @scala.inline
    def withN_modifyp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_modifyp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN_modifyp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_modifyp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamemode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namemode")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedb")(js.undefined)
        ret
    }
    @scala.inline
    def withSgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSgid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(js.undefined)
        ret
    }
    @scala.inline
    def withSortid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortid")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

