package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.alipay
import typingsSlinky.uniApp.uniAppStrings.appleiap
import typingsSlinky.uniApp.uniAppStrings.baidu
import typingsSlinky.uniApp.uniAppStrings.wxpay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentOptions extends js.Object {
  /**
    * 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=xx，微信小程序独有
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 随机字符串，长度为32个字符以下，微信小程序独有 。
    */
  var nonceStr: js.UndefOr[String] = js.native
  /**
    * 订单数据
    */
  var orderInfo: js.UndefOr[String] = js.native
  /**
    * 签名，具体签名方案参见小程序支付接口文档，微信小程序独有
    */
  var paySign: js.UndefOr[String] = js.native
  /**
    * 支付服务提供商，通过 uni.getProvider 获取
    * - alipay: 支付宝支付
    * - wxpay: 微信支付
    * - baidu: 百度收银台
    * - appleiap: 苹果应用内支付
    */
  var provider: js.UndefOr[alipay | wxpay | baidu | appleiap] = js.native
  /**
    * 签名算法，暂支持 MD5 ，微信小程序独有
    */
  var signType: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 时间戳从1970年1月1日至今的秒数，即当前的时间，微信小程序独有
    */
  var timeStamp: js.UndefOr[String] = js.native
}

object RequestPaymentOptions {
  @scala.inline
  def apply(): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPaymentOptions]
  }
  @scala.inline
  implicit class RequestPaymentOptionsOps[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
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
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonceStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPaySign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paySign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaySign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paySign")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: alipay | wxpay | baidu | appleiap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withSignType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signType")(js.undefined)
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
    def withTimeStamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.undefined)
        ret
    }
  }
  
}

