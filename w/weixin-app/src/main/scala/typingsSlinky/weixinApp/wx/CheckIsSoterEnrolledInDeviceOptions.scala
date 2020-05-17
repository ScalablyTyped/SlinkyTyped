package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.IsEnrolled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIsSoterEnrolledInDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  var checkAuthMode: AuthModes = js.native
   // 认证方式
  @JSName("success")
  var success_CheckIsSoterEnrolledInDeviceOptions: js.UndefOr[js.Function1[/* res */ IsEnrolled, Unit]] = js.native
}

object CheckIsSoterEnrolledInDeviceOptions {
  @scala.inline
  def apply(checkAuthMode: AuthModes): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceOptionsOps[Self <: CheckIsSoterEnrolledInDeviceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthMode(value: AuthModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ IsEnrolled => Unit): Self = {
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

