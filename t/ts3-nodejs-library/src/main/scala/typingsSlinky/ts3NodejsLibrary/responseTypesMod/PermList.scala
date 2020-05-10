package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermList extends js.Object {
  var permid: js.UndefOr[Double] = js.native
  var permnegated: Double = js.native
  var permsid: js.UndefOr[String] = js.native
  var permskip: Double = js.native
  var permvalue: Double = js.native
}

object PermList {
  @scala.inline
  def apply(permnegated: Double, permskip: Double, permvalue: Double): PermList = {
    val __obj = js.Dynamic.literal(permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermList]
  }
  @scala.inline
  implicit class PermListOps[Self <: PermList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermnegated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermskip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permskip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(js.undefined)
        ret
    }
    @scala.inline
    def withPermsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermsid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(js.undefined)
        ret
    }
  }
  
}

