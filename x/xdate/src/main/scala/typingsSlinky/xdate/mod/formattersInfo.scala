package typingsSlinky.xdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait formattersInfo extends js.Object {
  var i: js.UndefOr[String] = js.native
  var u: js.UndefOr[String] = js.native
  var vvv: js.UndefOr[js.Function2[/* xdate */ XDate, /* useutc */ Boolean, String]] = js.native
  var xxx: js.UndefOr[String] = js.native
}

object formattersInfo {
  @scala.inline
  def apply(): formattersInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[formattersInfo]
  }
  @scala.inline
  implicit class formattersInfoOps[Self <: formattersInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(js.undefined)
        ret
    }
    @scala.inline
    def withU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(js.undefined)
        ret
    }
    @scala.inline
    def withVvv(value: (/* xdate */ XDate, /* useutc */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vvv")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVvv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vvv")(js.undefined)
        ret
    }
    @scala.inline
    def withXxx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXxx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxx")(js.undefined)
        ret
    }
  }
  
}

