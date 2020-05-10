package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionList extends js.Object {
  var permdesc: String = js.native
  var permid: Double = js.native
  var permname: String = js.native
}

object PermissionList {
  @scala.inline
  def apply(permdesc: String, permid: Double, permname: String): PermissionList = {
    val __obj = js.Dynamic.literal(permdesc = permdesc.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permname = permname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionList]
  }
  @scala.inline
  implicit class PermissionListOps[Self <: PermissionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermdesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permdesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

