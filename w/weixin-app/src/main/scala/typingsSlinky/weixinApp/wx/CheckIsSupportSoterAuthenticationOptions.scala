package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.AnonSupportMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIsSupportSoterAuthenticationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_CheckIsSupportSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ AnonSupportMode, Unit]] = js.native
}

object CheckIsSupportSoterAuthenticationOptions {
  @scala.inline
  def apply(): CheckIsSupportSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationOptions]
  }
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationOptionsOps[Self <: CheckIsSupportSoterAuthenticationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ AnonSupportMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

