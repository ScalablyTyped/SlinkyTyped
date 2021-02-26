package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileSuccessCallbackResult extends StObject {
  
  /**
    * 开发者服务器返回的数据
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.native
}
object UploadFileSuccessCallbackResult {
  
  @scala.inline
  def apply(): UploadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class UploadFileSuccessCallbackResultMutableBuilder[Self <: UploadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
