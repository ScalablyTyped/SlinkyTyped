package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerTempPasswordAdd extends js.Object {
  /** description of the password */
  var desc: js.UndefOr[String] = js.native
  /** the duration the password is valid in seconds */
  var duration: Double = js.native
  /** the temporary password */
  var pw: String = js.native
  /** the channel to let the user join */
  var tcid: js.UndefOr[Double] = js.native
  /** the password to the channel */
  var tcpw: js.UndefOr[String] = js.native
}

object ServerTempPasswordAdd {
  @scala.inline
  def apply(duration: Double, pw: String): ServerTempPasswordAdd = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTempPasswordAdd]
  }
  @scala.inline
  implicit class ServerTempPasswordAddOps[Self <: ServerTempPasswordAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withTcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcid")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpw")(js.undefined)
        ret
    }
  }
  
}

