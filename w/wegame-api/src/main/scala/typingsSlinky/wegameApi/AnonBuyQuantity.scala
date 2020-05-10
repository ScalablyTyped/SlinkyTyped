package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wegameApiNumbers.`0`
import typingsSlinky.wegameApi.wegameApiNumbers.`1`
import typingsSlinky.wegameApi.wegameApiStrings.CNY
import typingsSlinky.wegameApi.wegameApiStrings.android
import typingsSlinky.wegameApi.wegameApiStrings.game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuyQuantity extends js.Object {
  /**
    * 购买数量。mode=game 时必填。购买数量。详见 buyQuantity 限制说明。
    * mode为game（购买游戏币）时，buyQuantity不可任意填写。需满足 buyQuantity * 游戏币单价 = 限定的价格等级。如：游戏币单价为 0.1 元，一次购买最少数量是 10。
    * 有效价格等级如下：
    *       价格等级（单位：人民币）
    *       1
    *       3
    *       6
    *       8
    *       12
    *       18
    *       25
    *       30
    *       40
    *       45
    *       50
    *       60
    *       68
    *       73
    *       78
    *       88
    *       98
    *       108
    *       118
    *       128
    *       148
    *       168
    *       188
    *       198
    *       328
    *       648
    */
  var buyQuantity: js.UndefOr[Double] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 币种
    */
  var currencyType: CNY = js.native
  /**
    * 环境配置，默认值0
    *   0 - 米大师正式环境
    *   1 - 米大师沙箱环境
    */
  var env: js.UndefOr[`0` | `1`] = js.native
  /**
    * @param res.errCode 有如下值：
    *      -1	系统失败
    *      -2	支付取消
    *      -15001	虚拟支付接口错误码，缺少参数
    *      -15002	虚拟支付接口错误码，参数不合法
    *      -15003	虚拟支付接口错误码，订单重复
    *      -15004	虚拟支付接口错误码，后台错误
    *      -15006	虚拟支付接口错误码，appId 权限被封禁
    *      -15006	虚拟支付接口错误码，货币类型不支持
    *      -15007	虚拟支付接口错误码，订单已支付
    *       1	虚拟支付接口错误码，用户取消支付
    *       2	虚拟支付接口错误码，客户端错误, 判断到小程序在用户处于支付中时,又发起了一笔支付请求
    *       3	虚拟支付接口错误码，Android 独有错误：用户使用 Google Play 支付，而手机未安装 Google Play
    *       4	虚拟支付接口错误码，用户操作系统支付状态异常
    *       5	虚拟支付接口错误码，操作系统错误
    *       6	虚拟支付接口错误码，其他错误
    *       1000	参数错误
    *       1003	米大师 Portal 错误
    */
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrCode, Unit]] = js.native
  /**
    * 支付的类型，不同的支付类型有各自额外要传的附加参数。
    *   game - 购买游戏币
    */
  var mode: game = js.native
  /**
    * 在米大师侧申请的应用 id
    */
  var offerId: String = js.native
  /**
    * 申请接入时的平台，platform 与应用id有关。
    */
  var platform: js.UndefOr[android] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 分区 ID
    */
  var zoneId: js.UndefOr[String] = js.native
}

object AnonBuyQuantity {
  @scala.inline
  def apply(currencyType: CNY, mode: game, offerId: String): AnonBuyQuantity = {
    val __obj = js.Dynamic.literal(currencyType = currencyType.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuyQuantity]
  }
  @scala.inline
  implicit class AnonBuyQuantityOps[Self <: AnonBuyQuantity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyType(value: CNY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: game): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuyQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyQuantity")(js.undefined)
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
    def withEnv(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ AnonErrCode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: android): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(js.undefined)
        ret
    }
  }
  
}

