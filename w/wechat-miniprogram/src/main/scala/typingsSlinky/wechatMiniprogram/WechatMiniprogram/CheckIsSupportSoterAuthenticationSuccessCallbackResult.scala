package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.facial
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.fingerPrint
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSupportSoterAuthenticationSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 该设备支持的可被SOTER识别的生物识别方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别;
    * - 'speech': 声纹识别（暂未支持）; */
  var supportMode: js.Array[fingerPrint | facial | speech] = js.native
}
object CheckIsSupportSoterAuthenticationSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[fingerPrint | facial | speech]): CheckIsSupportSoterAuthenticationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationSuccessCallbackResultMutableBuilder[Self <: CheckIsSupportSoterAuthenticationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportMode(value: js.Array[fingerPrint | facial | speech]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportModeVarargs(value: (fingerPrint | facial | speech)*): Self = StObject.set(x, "supportMode", js.Array(value :_*))
  }
}
