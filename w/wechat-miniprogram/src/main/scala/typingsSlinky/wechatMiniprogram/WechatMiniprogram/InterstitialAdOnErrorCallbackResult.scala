package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1000`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1001`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1002`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1003`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1004`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1005`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1006`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1007`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1008`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterstitialAdOnErrorCallbackResult extends js.Object {
  
  /** 错误码
    *
    * 可选值：
    * - 1000: 后端接口调用失败;
    * - 1001: 参数错误;
    * - 1002: 广告单元无效;
    * - 1003: 内部错误;
    * - 1004: 无合适的广告;
    * - 1005: 广告组件审核中;
    * - 1006: 广告组件被驳回;
    * - 1007: 广告组件被封禁;
    * - 1008: 广告单元已关闭; */
  var errCode: `1000` | `1001` | `1002` | `1003` | `1004` | `1005` | `1006` | `1007` | `1008` = js.native
  
  /** 错误信息 */
  var errMsg: String = js.native
}
object InterstitialAdOnErrorCallbackResult {
  
  @scala.inline
  def apply(
    errCode: `1000` | `1001` | `1002` | `1003` | `1004` | `1005` | `1006` | `1007` | `1008`,
    errMsg: String
  ): InterstitialAdOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterstitialAdOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class InterstitialAdOnErrorCallbackResultOps[Self <: InterstitialAdOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrCode(value: `1000` | `1001` | `1002` | `1003` | `1004` | `1005` | `1006` | `1007` | `1008`): Self = this.set("errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
