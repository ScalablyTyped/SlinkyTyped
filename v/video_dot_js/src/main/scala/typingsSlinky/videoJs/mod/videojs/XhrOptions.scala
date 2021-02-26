package typingsSlinky.videoJs.mod.videojs

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.videoJs.videoJsStrings.DELETE
import typingsSlinky.videoJs.videoJsStrings.GET
import typingsSlinky.videoJs.videoJsStrings.HEAD
import typingsSlinky.videoJs.videoJsStrings.OPTIONS
import typingsSlinky.videoJs.videoJsStrings.POST
import typingsSlinky.videoJs.videoJsStrings.PUT
import typingsSlinky.videoJs.videoJsStrings._empty
import typingsSlinky.videoJs.videoJsStrings.arraybuffer
import typingsSlinky.videoJs.videoJsStrings.blob
import typingsSlinky.videoJs.videoJsStrings.document
import typingsSlinky.videoJs.videoJsStrings.json
import typingsSlinky.videoJs.videoJsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XhrOptions extends StObject {
  
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useXDR: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}
object XhrOptions {
  
  @scala.inline
  def apply(): XhrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XhrOptions]
  }
  
  @scala.inline
  implicit class XhrOptionsMutableBuilder[Self <: XhrOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: /* xhrObject */ XMLHttpRequest => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setMethod(value: DELETE | GET | HEAD | OPTIONS | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setResponseType(value: _empty | arraybuffer | blob | document | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseXDR(value: Boolean): Self = StObject.set(x, "useXDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseXDRUndefined: Self = StObject.set(x, "useXDR", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
