package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 位置-----地图组件控制
@js.native
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetCenterLocationOptions(res: Latitude): Unit = js.native
}
object GetCenterLocationOptions {
  
  @scala.inline
  def apply(success: Latitude => Unit): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
  
  @scala.inline
  implicit class GetCenterLocationOptionsMutableBuilder[Self <: GetCenterLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Latitude => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
