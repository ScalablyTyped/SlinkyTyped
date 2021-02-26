package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasToTempFilePathSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 生成文件的临时路径 (本地路径) */
  var tempFilePath: String = js.native
}
object CanvasToTempFilePathSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, tempFilePath: String): CanvasToTempFilePathSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathSuccessCallbackResultMutableBuilder[Self <: CanvasToTempFilePathSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
