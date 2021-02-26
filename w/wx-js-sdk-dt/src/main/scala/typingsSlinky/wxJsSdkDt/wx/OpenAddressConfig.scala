package typingsSlinky.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * openAddress的调用参数
  */
@js.native
trait OpenAddressConfig extends WxBaseRequestConfig {
  
  /**
    * 成功回调
    */
  @JSName("success")
  var success_OpenAddressConfig: js.UndefOr[js.Function1[/* res */ OpenAddressResponse, Unit]] = js.native
}
object OpenAddressConfig {
  
  @scala.inline
  def apply(): OpenAddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenAddressConfig]
  }
  
  @scala.inline
  implicit class OpenAddressConfigMutableBuilder[Self <: OpenAddressConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ OpenAddressResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
