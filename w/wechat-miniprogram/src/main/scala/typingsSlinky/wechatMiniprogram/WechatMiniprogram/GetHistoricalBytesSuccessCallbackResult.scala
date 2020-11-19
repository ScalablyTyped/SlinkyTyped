package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHistoricalBytesSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 返回历史二进制数据 */
  var histBytes: js.typedarray.ArrayBuffer = js.native
}
object GetHistoricalBytesSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, histBytes: js.typedarray.ArrayBuffer): GetHistoricalBytesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], histBytes = histBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistoricalBytesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetHistoricalBytesSuccessCallbackResultOps[Self <: GetHistoricalBytesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistBytes(value: js.typedarray.ArrayBuffer): Self = this.set("histBytes", value.asInstanceOf[js.Any])
  }
}
