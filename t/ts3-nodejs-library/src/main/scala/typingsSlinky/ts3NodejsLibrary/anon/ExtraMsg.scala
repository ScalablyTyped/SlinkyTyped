package typingsSlinky.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraMsg extends StObject {
  
  var extraMsg: js.UndefOr[String] = js.native
  
  var failedPermid: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var message: String = js.native
  
  var msg: String = js.native
}
object ExtraMsg {
  
  @scala.inline
  def apply(id: String, message: String, msg: String): ExtraMsg = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraMsg]
  }
  
  @scala.inline
  implicit class ExtraMsgMutableBuilder[Self <: ExtraMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraMsg(value: String): Self = StObject.set(x, "extraMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraMsgUndefined: Self = StObject.set(x, "extraMsg", js.undefined)
    
    @scala.inline
    def setFailedPermid(value: Double): Self = StObject.set(x, "failedPermid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedPermidUndefined: Self = StObject.set(x, "failedPermid", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
