package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.alipay
import typingsSlinky.uniApp.uniAppStrings.appleiap
import typingsSlinky.uniApp.uniAppStrings.baidu
import typingsSlinky.uniApp.uniAppStrings.wxpay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPaymentOptions extends StObject {
  
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
  implicit class RequestPaymentOptionsMutableBuilder[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceStrUndefined: Self = StObject.set(x, "nonceStr", js.undefined)
    
    @scala.inline
    def setOrderInfo(value: String): Self = StObject.set(x, "orderInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderInfoUndefined: Self = StObject.set(x, "orderInfo", js.undefined)
    
    @scala.inline
    def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaySignUndefined: Self = StObject.set(x, "paySign", js.undefined)
    
    @scala.inline
    def setProvider(value: alipay | wxpay | baidu | appleiap): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignTypeUndefined: Self = StObject.set(x, "signType", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
