package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.wx.AuthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String = js.native
  var supportMode: js.Array[AuthModes] = js.native
}

object SupportMode {
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): SupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
  @scala.inline
  implicit class SupportModeOps[Self <: SupportMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportMode(value: js.Array[AuthModes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

