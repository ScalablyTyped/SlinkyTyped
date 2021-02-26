package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInit extends StObject {
  
  /**
    * A BodyInit object or null to set request's body.
    */
  var body: js.UndefOr[BodyInit | Null] = js.native
  
  /**
    * A string indicating how the request will interact with the browser's cache to set request's cache.
    */
  var cache: js.UndefOr[org.scalajs.dom.experimental.RequestCache] = js.native
  
  /**
    * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
    */
  var credentials: js.UndefOr[org.scalajs.dom.experimental.RequestCredentials] = js.native
  
  /**
    * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    */
  var headers: js.UndefOr[HeadersInit] = js.native
  
  /**
    * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
    */
  var integrity: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A boolean to set request's keepalive.
    */
  var keepalive: js.UndefOr[scala.Boolean] = js.native
  
  /**
    * A string to set request's method.
    */
  var method: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
    */
  var mode: js.UndefOr[org.scalajs.dom.experimental.RequestMode] = js.native
  
  /**
    * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    */
  var redirect: js.UndefOr[org.scalajs.dom.experimental.RequestRedirect] = js.native
  
  /**
    * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
    */
  var referrer: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A referrer policy to set request's referrerPolicy.
    */
  var referrerPolicy: js.UndefOr[org.scalajs.dom.experimental.ReferrerPolicy] = js.native
  
  /**
    * An AbortSignal to set request's signal.
    */
  var signal: js.UndefOr[org.scalajs.dom.experimental.AbortSignal | Null] = js.native
  
  /**
    * Can only be null. Used to disassociate request from any Window.
    */
  var window: js.UndefOr[js.Any] = js.native
}
object RequestInit {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.RequestInit]
  }
  
  @scala.inline
  implicit class RequestInitMutableBuilder[Self <: org.scalajs.dom.experimental.RequestInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyBlob(value: org.scalajs.dom.raw.Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFormData(value: org.scalajs.dom.raw.FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyReadableStream(value: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCache(value: org.scalajs.dom.experimental.RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCredentials(value: org.scalajs.dom.experimental.RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersHeaders(value: org.scalajs.dom.experimental.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[java.lang.String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setIntegrity(value: java.lang.String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    @scala.inline
    def setKeepalive(value: scala.Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    @scala.inline
    def setMethod(value: java.lang.String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMode(value: org.scalajs.dom.experimental.RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRedirect(value: org.scalajs.dom.experimental.RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicy(value: org.scalajs.dom.experimental.ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.experimental.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalNull: Self = StObject.set(x, "signal", null)
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
