package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.wx.AuthModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportMode extends StObject {
  
  // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String = js.native
  
  var supportMode: js.Array[AuthModes] = js.native
}
object SupportMode {
  
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): SupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
  
  @scala.inline
  implicit class SupportModeMutableBuilder[Self <: SupportMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportMode(value: js.Array[AuthModes]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportModeVarargs(value: AuthModes*): Self = StObject.set(x, "supportMode", js.Array(value :_*))
  }
}
