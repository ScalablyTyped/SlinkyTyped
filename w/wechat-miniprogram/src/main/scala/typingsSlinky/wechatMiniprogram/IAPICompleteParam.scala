package typingsSlinky.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wechatMiniprogram.IAPISuccessParam
  - typingsSlinky.wechatMiniprogram.IAPIError
*/
trait IAPICompleteParam extends StObject
object IAPICompleteParam {
  
  @scala.inline
  def IAPIError(errMsg: String): typingsSlinky.wechatMiniprogram.IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.IAPIError]
  }
  
  @scala.inline
  def IAPISuccessParam(errMsg: String): typingsSlinky.wechatMiniprogram.IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wechatMiniprogram.IAPISuccessParam]
  }
}
