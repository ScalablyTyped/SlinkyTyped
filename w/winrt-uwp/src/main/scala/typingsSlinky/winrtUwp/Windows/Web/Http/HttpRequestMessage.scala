package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpRequestHeaderCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an HTTP request message including headers. */
@js.native
trait HttpRequestMessage extends StObject {
  
  /** Closes the HttpRequestMessage instance and releases allocated resources. */
  def close(): Unit = js.native
  
  /** Gets or sets the HTTP content to send to the server on the HttpRequestMessage object. */
  var content: IHttpContent = js.native
  
  /** Gets the collection of the HTTP request headers associated with the HttpRequestMessage . */
  var headers: HttpRequestHeaderCollection = js.native
  
  /** Gets or sets the HTTP method to be performed on the request URI. */
  var method: HttpMethod = js.native
  
  /** Gets a set of properties on the HttpRequestMessage instance that are for use by the developer. */
  var properties: IMap[String, _] = js.native
  
  /** Gets or sets the Uri used for the HttpRequestMessage object. */
  var requestUri: Uri = js.native
  
  /** Get information about the underlying transport socket used by an HTTP connection. */
  var transportInformation: HttpTransportInformation = js.native
}
object HttpRequestMessage {
  
  @scala.inline
  def apply(
    close: () => Unit,
    content: IHttpContent,
    headers: HttpRequestHeaderCollection,
    method: HttpMethod,
    properties: IMap[String, _],
    requestUri: Uri,
    transportInformation: HttpTransportInformation
  ): HttpRequestMessage = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], requestUri = requestUri.asInstanceOf[js.Any], transportInformation = transportInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestMessage]
  }
  
  @scala.inline
  implicit class HttpRequestMessageMutableBuilder[Self <: HttpRequestMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContent(value: IHttpContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: HttpRequestHeaderCollection): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMap[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUri(value: Uri): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportInformation(value: HttpTransportInformation): Self = StObject.set(x, "transportInformation", value.asInstanceOf[js.Any])
  }
}
