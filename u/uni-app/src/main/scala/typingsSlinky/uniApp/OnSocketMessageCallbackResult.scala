package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSocketMessageCallbackResult extends StObject {
  
  /**
    * 服务器返回的消息
    */
  var data: js.UndefOr[String | js.typedarray.ArrayBuffer] = js.native
}
object OnSocketMessageCallbackResult {
  
  @scala.inline
  def apply(): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
  
  @scala.inline
  implicit class OnSocketMessageCallbackResultMutableBuilder[Self <: OnSocketMessageCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
