package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSoterAuthenticationRes extends js.Object {
  /**
    * 生物认证方式
    */
  var authMode: js.UndefOr[String] = js.native
  /**
    * 错误码
    */
  var errCode: js.UndefOr[Double] = js.native
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 在设备安全区域（TEE）内获得的本机安全信息以及本次认证信息
    */
  var resultJSON: js.UndefOr[String] = js.native
}

object StartSoterAuthenticationRes {
  @scala.inline
  def apply(): StartSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSoterAuthenticationRes]
  }
  @scala.inline
  implicit class StartSoterAuthenticationResOps[Self <: StartSoterAuthenticationRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withResultJSON(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultJSON")(js.undefined)
        ret
    }
  }
  
}

