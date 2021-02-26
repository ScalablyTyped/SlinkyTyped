package typingsSlinky.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseMessage extends Message {
  
  /**
    * The error object in case a request fails.
    */
  var error: js.UndefOr[ResponseErrorLiteral[_]] = js.native
  
  /**
    * The request id.
    */
  var id: Double | String | Null = js.native
  
  /**
    * The result of a request. This member is REQUIRED on success.
    * This member MUST NOT exist if there was an error invoking the method.
    */
  var result: js.UndefOr[String | Double | Boolean | js.Object | Null] = js.native
}
object ResponseMessage {
  
  @scala.inline
  def apply(jsonrpc: String): ResponseMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMessage]
  }
  
  @scala.inline
  implicit class ResponseMessageMutableBuilder[Self <: ResponseMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ResponseErrorLiteral[_]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setResult(value: String | Double | Boolean | js.Object): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultNull: Self = StObject.set(x, "result", null)
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
