package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakePhoneCallOptions extends StObject {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 需要拨打的电话号码
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object MakePhoneCallOptions {
  
  @scala.inline
  def apply(): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
  
  @scala.inline
  implicit class MakePhoneCallOptionsMutableBuilder[Self <: MakePhoneCallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
