package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`-1`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`10001`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`10002`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`10003`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`10004`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerAudioContextOnErrorCallbackResult extends StObject {
  
  /**
    *
    * 可选值：
    * - 10001: 系统错误;
    * - 10002: 网络错误;
    * - 10003: 文件错误;
    * - 10004: 格式错误;
    * - -1: 未知错误; */
  var errCode: `10001` | `10002` | `10003` | `10004` | `-1` = js.native
  
  var errMsg: String = js.native
}
object InnerAudioContextOnErrorCallbackResult {
  
  @scala.inline
  def apply(errCode: `10001` | `10002` | `10003` | `10004` | `-1`, errMsg: String): InnerAudioContextOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContextOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class InnerAudioContextOnErrorCallbackResultMutableBuilder[Self <: InnerAudioContextOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: `10001` | `10002` | `10003` | `10004` | `-1`): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
