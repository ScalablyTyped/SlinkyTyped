package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseInit extends StObject {
  
  var headers: js.UndefOr[HeadersInit] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var statusText: js.UndefOr[java.lang.String] = js.native
}
object ResponseInit {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.ResponseInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.ResponseInit]
  }
  
  @scala.inline
  implicit class ResponseInitMutableBuilder[Self <: org.scalajs.dom.experimental.ResponseInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersHeaders(value: org.scalajs.dom.experimental.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[java.lang.String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
