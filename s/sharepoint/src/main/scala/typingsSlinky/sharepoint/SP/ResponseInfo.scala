package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseInfo extends StObject {
  
  var allResponseHeaders: js.UndefOr[String] = js.native
  
  /** Can be string or bytearray depending on request.binaryStringResponseBody field */
  var body: js.UndefOr[String | js.typedarray.Uint8Array] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var responseAvailable: Boolean = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var statusText: js.UndefOr[String] = js.native
}
object ResponseInfo {
  
  @scala.inline
  def apply(responseAvailable: Boolean): ResponseInfo = {
    val __obj = js.Dynamic.literal(responseAvailable = responseAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInfo]
  }
  
  @scala.inline
  implicit class ResponseInfoMutableBuilder[Self <: ResponseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllResponseHeaders(value: String): Self = StObject.set(x, "allResponseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllResponseHeadersUndefined: Self = StObject.set(x, "allResponseHeaders", js.undefined)
    
    @scala.inline
    def setBody(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setResponseAvailable(value: Boolean): Self = StObject.set(x, "responseAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
  }
}
