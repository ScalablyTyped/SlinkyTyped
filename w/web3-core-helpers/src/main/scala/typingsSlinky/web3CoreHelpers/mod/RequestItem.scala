package typingsSlinky.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestItem extends StObject {
  
  def callback(error: js.Any, result: js.Any): Unit = js.native
  
  var payload: JsonRpcPayload = js.native
}
object RequestItem {
  
  @scala.inline
  def apply(callback: (js.Any, js.Any) => Unit, payload: JsonRpcPayload): RequestItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestItem]
  }
  
  @scala.inline
  implicit class RequestItemMutableBuilder[Self <: RequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPayload(value: JsonRpcPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
