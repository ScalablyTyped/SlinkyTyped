package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthSetting extends js.Object {
  var authSetting: keyinScopeboolean = js.native
}

object AnonAuthSetting {
  @scala.inline
  def apply(authSetting: keyinScopeboolean): AnonAuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthSetting]
  }
  @scala.inline
  implicit class AnonAuthSettingOps[Self <: AnonAuthSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthSetting(value: keyinScopeboolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSetting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

