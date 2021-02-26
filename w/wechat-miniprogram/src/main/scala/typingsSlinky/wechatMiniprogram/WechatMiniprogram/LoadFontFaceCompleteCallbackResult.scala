package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadFontFaceCompleteCallbackResult extends StObject {
  
  /** 加载字体结果 */
  var status: String = js.native
}
object LoadFontFaceCompleteCallbackResult {
  
  @scala.inline
  def apply(status: String): LoadFontFaceCompleteCallbackResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFontFaceCompleteCallbackResult]
  }
  
  @scala.inline
  implicit class LoadFontFaceCompleteCallbackResultMutableBuilder[Self <: LoadFontFaceCompleteCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
