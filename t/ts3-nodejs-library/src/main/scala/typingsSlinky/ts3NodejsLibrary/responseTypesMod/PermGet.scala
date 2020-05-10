package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermGet extends js.Object {
  var permid: Double = js.native
  var permsid: String = js.native
  var permvalue: Double = js.native
}

object PermGet {
  @scala.inline
  def apply(permid: Double, permsid: String, permvalue: Double): PermGet = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermGet]
  }
  @scala.inline
  implicit class PermGetOps[Self <: PermGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

