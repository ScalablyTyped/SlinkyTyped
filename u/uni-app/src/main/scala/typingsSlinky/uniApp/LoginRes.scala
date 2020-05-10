package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginRes extends js.Object {
  /**
    * 头条小程序当前设备标识
    */
  var anonymousCode: js.UndefOr[String] = js.native
  /**
    * 支付宝小程序授权码
    */
  var authCode: js.UndefOr[String] = js.native
  /**
    * 支付宝小程序登录失败的授权类型，key是授权失败的 scope，value 是对应的错误码
    */
  var authErrorScope: js.UndefOr[js.Any] = js.native
  /**
    * 登录服务商提供的登录信息，服务商不同返回的结果不完全相同
    */
  var authResult: js.UndefOr[String] = js.native
  /**
    * 支付宝小程序登录成功的授权 scope
    */
  var authSucessScope: js.UndefOr[js.Array[String]] = js.native
  /**
    * 小程序用户临时登录凭证
    */
  var code: js.UndefOr[String] = js.native
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object LoginRes {
  @scala.inline
  def apply(): LoginRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginRes]
  }
  @scala.inline
  implicit class LoginResOps[Self <: LoginRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymousCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymousCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousCode")(js.undefined)
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
    def withAuthErrorScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authErrorScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthErrorScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authErrorScope")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResult")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthSucessScope(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSucessScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSucessScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSucessScope")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
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
  }
  
}

