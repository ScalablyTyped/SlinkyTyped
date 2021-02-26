package typingsSlinky.tampermonkey.Tampermonkey

import org.scalajs.dom.raw.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseBase extends StObject {
  
  val readyState: ReadyState = js.native
  
  val response: js.Any = js.native
  
  val responseHeaders: String = js.native
  
  val responseText: String = js.native
  
  val responseXML: Document | Null = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
}
object ResponseBase {
  
  @scala.inline
  def apply(
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  
  @scala.inline
  implicit class ResponseBaseMutableBuilder[Self <: ResponseBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadyState(value: ReadyState): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseXML(value: Document): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseXMLNull: Self = StObject.set(x, "responseXML", null)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
