package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.sendcloudStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorResp extends StObject {
  
  var errors: js.Array[String] = js.native
  
  var message: error = js.native
}
object ErrorResp {
  
  @scala.inline
  def apply(errors: js.Array[String], message: error): ErrorResp = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResp]
  }
  
  @scala.inline
  implicit class ErrorRespMutableBuilder[Self <: ErrorResp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
