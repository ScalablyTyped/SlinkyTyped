package typingsSlinky.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseWXPayConfig extends WxBaseRequestConfig {
  /**
    * 统一支付接口返回的 prepay_id 参数值，提交格式如：prepay_id=***
    */
  @JSName("package")
  var _package: String = js.native
  /**
    * 支付签名随机串，不长于 32 位
    */
  var nonceStr: String = js.native
  /**
    * 支付签名
    */
  var paySign: String = js.native
  /**
    * 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
    */
  var signType: js.UndefOr[String] = js.native
  /**
    * 支付签名时间戳，注意微信jssdk中的所有使用 timestamp 字段均为小写。但最新版的支付后台生成签名使用的 timeStamp 字段名需大写其中的S字符
    */
  var timestamp: Double = js.native
}

object ChooseWXPayConfig {
  @scala.inline
  def apply(_package: String, nonceStr: String, paySign: String, timestamp: Double): ChooseWXPayConfig = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseWXPayConfig]
  }
  @scala.inline
  implicit class ChooseWXPayConfigOps[Self <: ChooseWXPayConfig] (val x: Self) extends AnyVal {
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
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaySign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paySign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
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
  }
  
}

