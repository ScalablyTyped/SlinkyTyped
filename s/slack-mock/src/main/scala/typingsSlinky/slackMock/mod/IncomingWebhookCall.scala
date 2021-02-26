package typingsSlinky.slackMock.mod

import typingsSlinky.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingWebhookCall[T] extends StObject {
  
  var headers: IncomingWebhookHttpHeaders = js.native
  
  var params: T = js.native
  
  var url: IncomingWebhookUrl = js.native
}
object IncomingWebhookCall {
  
  @scala.inline
  def apply[T](headers: IncomingWebhookHttpHeaders, params: T, url: IncomingWebhookUrl): IncomingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingWebhookCall[T]]
  }
  
  @scala.inline
  implicit class IncomingWebhookCallMutableBuilder[Self <: IncomingWebhookCall[_], T] (val x: Self with IncomingWebhookCall[T]) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: IncomingWebhookHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: IncomingWebhookUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
