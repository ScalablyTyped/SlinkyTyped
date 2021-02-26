package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Fetch API interface represents the response to a request. */
@js.native
trait Response extends Body {
  
  val headers: org.scalajs.dom.experimental.Headers = js.native
  
  val ok: scala.Boolean = js.native
  
  val redirected: scala.Boolean = js.native
  
  val status: Double = js.native
  
  val statusText: java.lang.String = js.native
  
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  
  val `type`: org.scalajs.dom.experimental.ResponseType = js.native
  
  val url: java.lang.String = js.native
}
object Response {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.raw.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.raw.FormData],
    headers: org.scalajs.dom.experimental.Headers,
    json: () => js.Promise[_],
    ok: scala.Boolean,
    redirected: scala.Boolean,
    status: Double,
    statusText: java.lang.String,
    text: () => js.Promise[java.lang.String],
    trailer: js.Promise[org.scalajs.dom.experimental.Headers],
    `type`: org.scalajs.dom.experimental.ResponseType,
    url: java.lang.String
  ): org.scalajs.dom.experimental.Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.experimental.Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: org.scalajs.dom.experimental.Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: org.scalajs.dom.experimental.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: scala.Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirected(value: scala.Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailer(value: js.Promise[org.scalajs.dom.experimental.Headers]): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: org.scalajs.dom.experimental.ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
