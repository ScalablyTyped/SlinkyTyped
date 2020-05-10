package typingsSlinky.stompit.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectHeaders extends js.Object {
  var `accept-version`: js.UndefOr[String] = js.native
  var `heart-beat`: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var login: js.UndefOr[String] = js.native
  var passcode: js.UndefOr[String] = js.native
}

object ConnectHeaders {
  @scala.inline
  def apply(): ConnectHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectHeaders]
  }
  @scala.inline
  implicit class ConnectHeadersOps[Self <: ConnectHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAccept-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-version")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeart-beat`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heart-beat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeart-beat`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heart-beat")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcode")(js.undefined)
        ret
    }
  }
  
}

