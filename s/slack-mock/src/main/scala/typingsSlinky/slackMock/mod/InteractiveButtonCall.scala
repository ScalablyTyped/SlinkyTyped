package typingsSlinky.slackMock.mod

import typingsSlinky.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractiveButtonCall[T] extends StObject {
  
  var headers: InteractiveButtonHttpHeaders = js.native
  
  var params: T = js.native
  
  var statusCode: Double = js.native
  
  var `type`: InteractiveButtonCallType = js.native
  
  var url: InteractiveButtonUrl = js.native
}
object InteractiveButtonCall {
  
  @scala.inline
  def apply[T](
    headers: InteractiveButtonHttpHeaders,
    params: T,
    statusCode: Double,
    `type`: InteractiveButtonCallType,
    url: InteractiveButtonUrl
  ): InteractiveButtonCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveButtonCall[T]]
  }
  
  @scala.inline
  implicit class InteractiveButtonCallMutableBuilder[Self <: InteractiveButtonCall[_], T] (val x: Self with InteractiveButtonCall[T]) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: InteractiveButtonHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InteractiveButtonCallType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: InteractiveButtonUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
