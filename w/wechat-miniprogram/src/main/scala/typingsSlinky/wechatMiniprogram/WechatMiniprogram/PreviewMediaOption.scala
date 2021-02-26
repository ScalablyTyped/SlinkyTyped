package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewMediaOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PreviewMediaCompleteCallback] = js.native
  
  /** 当前显示的资源序号 */
  var current: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PreviewMediaFailCallback] = js.native
  
  /** 需要预览的资源列表 */
  var sources: js.Array[MediaSource] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PreviewMediaSuccessCallback] = js.native
}
object PreviewMediaOption {
  
  @scala.inline
  def apply(sources: js.Array[MediaSource]): PreviewMediaOption = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewMediaOption]
  }
  
  @scala.inline
  implicit class PreviewMediaOptionMutableBuilder[Self <: PreviewMediaOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[MediaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: MediaSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
