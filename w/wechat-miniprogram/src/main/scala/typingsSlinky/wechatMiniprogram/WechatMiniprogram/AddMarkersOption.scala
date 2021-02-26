package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddMarkersOption extends StObject {
  
  /** 是否先清空地图上所有 marker */
  var clear: js.UndefOr[Boolean] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddMarkersCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddMarkersFailCallback] = js.native
  
  /** 同传入 map 组件的 marker 属性 */
  var markers: js.Array[_] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddMarkersSuccessCallback] = js.native
}
object AddMarkersOption {
  
  @scala.inline
  def apply(markers: js.Array[_]): AddMarkersOption = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMarkersOption]
  }
  
  @scala.inline
  implicit class AddMarkersOptionMutableBuilder[Self <: AddMarkersOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMarkers(value: js.Array[_]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersVarargs(value: js.Any*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
