package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----微信支付
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weixinApp.weixinAppStrings.MD5
  - typingsSlinky.weixinApp.weixinAppStrings.`HMAC-SHA256`
*/
trait PaymentSignType extends js.Object

object PaymentSignType {
  @scala.inline
  def `HMAC-SHA256`: typingsSlinky.weixinApp.weixinAppStrings.`HMAC-SHA256` = "HMAC-SHA256".asInstanceOf[typingsSlinky.weixinApp.weixinAppStrings.`HMAC-SHA256`]
  @scala.inline
  def MD5: typingsSlinky.weixinApp.weixinAppStrings.MD5 = "MD5".asInstanceOf[typingsSlinky.weixinApp.weixinAppStrings.MD5]
}

