package typingsSlinky.steam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogonOptions extends js.Object {
  var accountName: String = js.native
  var authCode: js.UndefOr[String] = js.native
  var password: String = js.native
  var shaSentryfile: js.UndefOr[String] = js.native
}

object LogonOptions {
  @scala.inline
  def apply(accountName: String, password: String): LogonOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogonOptions]
  }
  @scala.inline
  implicit class LogonOptionsOps[Self <: LogonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCode")(js.undefined)
        ret
    }
    @scala.inline
    def withShaSentryfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaSentryfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShaSentryfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaSentryfile")(js.undefined)
        ret
    }
  }
  
}

