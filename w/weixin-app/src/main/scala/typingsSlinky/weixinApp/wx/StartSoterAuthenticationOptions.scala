package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSoterAuthenticationOptions
  extends BaseOptions[js.Any, js.Any] {
   // 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键是别信息，将作为result_json的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。
  var authContent: js.UndefOr[String] = js.native
   // 请求使用的可接受的生物认证方式
  var challenge: String = js.native
  var requestAuthModes: js.Array[AuthModes] = js.native
   // 验证描述，即识别过程中显示在界面上的对话框提示内容
  @JSName("success")
  var success_StartSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ AuthMode, Unit]] = js.native
}

object StartSoterAuthenticationOptions {
  @scala.inline
  def apply(challenge: String, requestAuthModes: js.Array[AuthModes]): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
  @scala.inline
  implicit class StartSoterAuthenticationOptionsOps[Self <: StartSoterAuthenticationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestAuthModes(value: js.Array[AuthModes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAuthModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AuthMode => Unit): Self = {
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

