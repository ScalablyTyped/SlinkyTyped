package typingsSlinky.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserInfoOptions extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ UserInfoResponse, Unit]] = js.native
}
object GetUserInfoOptions {
  
  @scala.inline
  def apply(): GetUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserInfoOptions]
  }
  
  @scala.inline
  implicit class GetUserInfoOptionsMutableBuilder[Self <: GetUserInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ UserInfoResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
