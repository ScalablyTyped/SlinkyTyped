package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasGetImageDataSuccessCallbackResult extends StObject {
  
  /** 图像像素点数据，一维数组，每四项表示一个像素点的 rgba */
  var data: js.typedarray.Uint8ClampedArray = js.native
  
  var errMsg: String = js.native
  
  /** 图像数据矩形的高度 */
  var height: Double = js.native
  
  /** 图像数据矩形的宽度 */
  var width: Double = js.native
}
object CanvasGetImageDataSuccessCallbackResult {
  
  @scala.inline
  def apply(data: js.typedarray.Uint8ClampedArray, errMsg: String, height: Double, width: Double): CanvasGetImageDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CanvasGetImageDataSuccessCallbackResultMutableBuilder[Self <: CanvasGetImageDataSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
