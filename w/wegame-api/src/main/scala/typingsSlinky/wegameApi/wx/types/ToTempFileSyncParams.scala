package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.wegameApiStrings.jpg
import typingsSlinky.wegameApi.wegameApiStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToTempFileSyncParams extends StObject {
  
  /**
    * 目标文件的高度，会将截取的部分拉伸或压缩至该数值
    */
  var destHeight: js.UndefOr[Double] = js.native
  
  /**
    * 目标文件的宽度，会将截取的部分拉伸或压缩至该数值
    */
  var destWidth: js.UndefOr[Double] = js.native
  
  /**
    * 目标文件的类型
    */
  var fileType: js.UndefOr[jpg | png] = js.native
  
  /**
    * 截取 canvas 的高度
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * jpg图片的质量，仅当 fileType 为 jpg 时有效。取值范围为 0.0（最低）- 1.0（最高），不含 0。不在范围内时当作 1.0
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * 截取 canvas 的宽度
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * 截取 canvas 的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 截取 canvas 的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.native
}
object ToTempFileSyncParams {
  
  @scala.inline
  def apply(): ToTempFileSyncParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToTempFileSyncParams]
  }
  
  @scala.inline
  implicit class ToTempFileSyncParamsMutableBuilder[Self <: ToTempFileSyncParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    @scala.inline
    def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    @scala.inline
    def setFileType(value: jpg | png): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
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
