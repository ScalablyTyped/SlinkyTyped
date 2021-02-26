package typingsSlinky.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEnrolled extends StObject {
  
  // 是否已录入信息
  var errMsg: String = js.native
  
  var isEnrolled: Boolean = js.native
}
object IsEnrolled {
  
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): IsEnrolled = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnrolled]
  }
  
  @scala.inline
  implicit class IsEnrolledMutableBuilder[Self <: IsEnrolled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnrolled(value: Boolean): Self = StObject.set(x, "isEnrolled", value.asInstanceOf[js.Any])
  }
}
