package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.trezorConnectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error
  extends ResponseMessage[js.Any] {
  
  var payload: typingsSlinky.trezorConnect.anon.Error = js.native
  
  var success: `false` = js.native
}
object Error {
  
  @scala.inline
  def apply(payload: typingsSlinky.trezorConnect.anon.Error, success: `false`): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: typingsSlinky.trezorConnect.anon.Error): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
