package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetContentsOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetContentsCompleteCallback] = js.native
  
  /** 表示内容的delta对象 */
  var delta: js.UndefOr[IAnyObject] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetContentsFailCallback] = js.native
  
  /** 带标签的HTML内容 */
  var html: js.UndefOr[String] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetContentsSuccessCallback] = js.native
}
object SetContentsOption {
  
  @scala.inline
  def apply(): SetContentsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetContentsOption]
  }
  
  @scala.inline
  implicit class SetContentsOptionMutableBuilder[Self <: SetContentsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDelta(value: IAnyObject): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
