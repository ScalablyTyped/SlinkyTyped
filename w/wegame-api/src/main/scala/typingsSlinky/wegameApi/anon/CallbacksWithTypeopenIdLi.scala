package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.CallbacksWithType<{  openIdList  :std.ReadonlyArray<string>,   errCode  :number,   errMsg  :string}> & {  signature  :string,   nonceStr  :string,   timeStamp  :number,   groupId  :string,   muteConfig ? :{  muteMicrophone ? :boolean,   muteEarphone ? :boolean}} */
@js.native
trait CallbacksWithTypeopenIdLi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。
    */
  var groupId: String = js.native
  /**
    * 静音设置
    */
  var muteConfig: js.UndefOr[MuteEarphone] = js.native
  /**
    * 验证所需的随机字符串
    */
  var nonceStr: String = js.native
  /**
    * 签名，用于验证小游戏的身份
    */
  var signature: String = js.native
  var success: js.UndefOr[js.Function1[/* res */ OpenIdList, Unit]] = js.native
  /**
    * 验证所需的时间戳
    */
  var timeStamp: Double = js.native
}

object CallbacksWithTypeopenIdLi {
  @scala.inline
  def apply(groupId: String, nonceStr: String, signature: String, timeStamp: Double): CallbacksWithTypeopenIdLi = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbacksWithTypeopenIdLi]
  }
  @scala.inline
  implicit class CallbacksWithTypeopenIdLiOps[Self <: CallbacksWithTypeopenIdLi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withMuteConfig(value: MuteEarphone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuteConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ OpenIdList => Unit): Self = {
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

