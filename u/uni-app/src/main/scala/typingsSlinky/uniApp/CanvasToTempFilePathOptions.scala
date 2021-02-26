package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasToTempFilePathOptions extends StObject {
  
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.native
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 输出图片高度（默认为 height * 屏幕像素密度）
    */
  var destHeight: js.UndefOr[Double] = js.native
  
  /**
    * 输出图片宽度（默认为 width * 屏幕像素密度）
    */
  var destWidth: js.UndefOr[Double] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 目标文件的类型，默认为 'png'
    */
  var fileType: js.UndefOr[String] = js.native
  
  /**
    * 画布高度（默认为canvas高度-y）
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 图片的质量，取值范围为 (0, 1]，不在范围内时当作1.0处理
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasToTempFilePathRes, Unit]] = js.native
  
  /**
    * 画布宽度（默认为canvas宽度-x）
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * 画布x轴起点（默认0）
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 画布y轴起点（默认0）
    */
  var y: js.UndefOr[Double] = js.native
}
object CanvasToTempFilePathOptions {
  
  @scala.inline
  def apply(): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathOptionsMutableBuilder[Self <: CanvasToTempFilePathOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasIdUndefined: Self = StObject.set(x, "canvasId", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    @scala.inline
    def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ CanvasToTempFilePathRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
