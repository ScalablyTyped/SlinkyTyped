package typingsSlinky.wxJsSdkDt.wx

import typingsSlinky.wxJsSdkDt.anon.CardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseCardConfig extends WxBaseRequestConfig {
  /**
    * 卡券Id
    */
  var cardId: js.UndefOr[String] = js.native
  /**
    * 卡券签名
    */
  var cardSign: String = js.native
  /**
    * 卡券类型
    */
  var cardType: js.UndefOr[String] = js.native
  /**
    * 卡券签名随机串
    */
  var nonceStr: String = js.native
  /**
    * 门店Id
    */
  var shopId: js.UndefOr[String] = js.native
  /**
    * 签名方式，默认'SHA1'
    */
  var signType: String = js.native
  /**
    * var cardList= res.cardList; 用户选中的卡券列表信息
    */
  @JSName("success")
  var success_ChooseCardConfig: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.native
  /**
    * 卡券签名时间戳
    */
  var timestamp: Double = js.native
}

object ChooseCardConfig {
  @scala.inline
  def apply(cardSign: String, nonceStr: String, signType: String, timestamp: Double): ChooseCardConfig = {
    val __obj = js.Dynamic.literal(cardSign = cardSign.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseCardConfig]
  }
  @scala.inline
  implicit class ChooseCardConfigOps[Self <: ChooseCardConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
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
    def withCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(js.undefined)
        ret
    }
    @scala.inline
    def withShopId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShopId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopId")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ CardList => Unit): Self = {
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

