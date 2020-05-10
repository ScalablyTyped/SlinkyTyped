package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelGroupList extends js.Object {
  var cgid: Double = js.native
  var iconid: Double = js.native
  var n_member_addp: Double = js.native
  var n_member_removep: Double = js.native
  var n_modifyp: Double = js.native
  var name: String = js.native
  var namemode: Double = js.native
  var savedb: Double = js.native
  var sortid: Double = js.native
  var `type`: Double = js.native
}

object ChannelGroupList {
  @scala.inline
  def apply(
    cgid: Double,
    iconid: Double,
    n_member_addp: Double,
    n_member_removep: Double,
    n_modifyp: Double,
    name: String,
    namemode: Double,
    savedb: Double,
    sortid: Double,
    `type`: Double
  ): ChannelGroupList = {
    val __obj = js.Dynamic.literal(cgid = cgid.asInstanceOf[js.Any], iconid = iconid.asInstanceOf[js.Any], n_member_addp = n_member_addp.asInstanceOf[js.Any], n_member_removep = n_member_removep.asInstanceOf[js.Any], n_modifyp = n_modifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelGroupList]
  }
  @scala.inline
  implicit class ChannelGroupListOps[Self <: ChannelGroupList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN_member_addp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_addp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN_member_removep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_removep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN_modifyp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_modifyp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamemode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

