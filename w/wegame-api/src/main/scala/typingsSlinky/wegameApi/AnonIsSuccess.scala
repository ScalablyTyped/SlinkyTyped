package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsSuccess extends js.Object {
  /**
    * 卡券的扩展参数，值为一个 JSON 字符串
    */
  var cardExt: String = js.native
  /**
    * 用户领取到卡券的 ID
    */
  var cardId: String = js.native
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：code 解码接口
    */
  var code: String = js.native
  /**
    * 是否成功
    */
  var isSuccess: Boolean = js.native
}

object AnonIsSuccess {
  @scala.inline
  def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): AnonIsSuccess = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsSuccess]
  }
  @scala.inline
  implicit class AnonIsSuccessOps[Self <: AnonIsSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccess")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

