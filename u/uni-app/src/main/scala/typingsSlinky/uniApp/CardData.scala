package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardData extends js.Object {
  /**
    * 用户领取到卡券的扩展参数，与调用时传入的参数相同
    */
  var cardExt: js.UndefOr[String] = js.native
  /**
    * 用户领取到卡券的id
    */
  var cardId: js.UndefOr[String] = js.native
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串
    */
  var code: js.UndefOr[String] = js.native
  /**
    * 是否成功
    */
  var isSuccess: js.UndefOr[Boolean] = js.native
}

object CardData {
  @scala.inline
  def apply(): CardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardData]
  }
  @scala.inline
  implicit class CardDataOps[Self <: CardData] (val x: Self) extends AnyVal {
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
    def withoutCardExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardExt")(js.undefined)
        ret
    }
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(js.undefined)
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
    def withIsSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccess")(js.undefined)
        ret
    }
  }
  
}

