package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Web.Http.HttpStatusCode
import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request that is sent to the Windows Store. */
@js.native
trait StoreSendRequestResult extends StObject {
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  
  /** Gets the HTTP status code for the request. */
  var httpStatusCode: HttpStatusCode = js.native
  
  /** Gets the response data for the request. */
  var response: String = js.native
}
object StoreSendRequestResult {
  
  @scala.inline
  def apply(extendedError: WinRTError, httpStatusCode: HttpStatusCode, response: String): StoreSendRequestResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSendRequestResult]
  }
  
  @scala.inline
  implicit class StoreSendRequestResultMutableBuilder[Self <: StoreSendRequestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusCode(value: HttpStatusCode): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
