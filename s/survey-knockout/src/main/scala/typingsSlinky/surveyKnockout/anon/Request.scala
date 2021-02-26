package typingsSlinky.surveyKnockout.anon

import org.scalajs.dom.raw.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  var request: XMLHttpRequest = js.native
}
object Request {
  
  @scala.inline
  def apply(request: XMLHttpRequest): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
