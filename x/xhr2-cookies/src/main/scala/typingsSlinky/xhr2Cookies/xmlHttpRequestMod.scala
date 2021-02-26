package typingsSlinky.xhr2Cookies

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpsMod.Agent
import typingsSlinky.node.urlMod.Url
import typingsSlinky.xhr2Cookies.anon.BaseUrl
import typingsSlinky.xhr2Cookies.errorsMod.InvalidStateError
import typingsSlinky.xhr2Cookies.errorsMod.NetworkError
import typingsSlinky.xhr2Cookies.errorsMod.SecurityError
import typingsSlinky.xhr2Cookies.errorsMod.SyntaxError
import typingsSlinky.xhr2Cookies.progressEventMod.ProgressEvent
import typingsSlinky.xhr2Cookies.xmlHttpRequestEventTargetMod.ProgressEventListener
import typingsSlinky.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
import typingsSlinky.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlHttpRequestMod {
  
  @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest")
  @js.native
  class XMLHttpRequest () extends XMLHttpRequestEventTarget {
    def this(options: XMLHttpRequestOptions) = this()
    
    var DONE: Double = js.native
    
    var HEADERS_RECEIVED: Double = js.native
    
    var LOADING: Double = js.native
    
    var OPENED: Double = js.native
    
    var UNSENT: Double = js.native
    
    var _aborting: js.Any = js.native
    
    var _anonymous: js.Any = js.native
    
    /* private */ def _dispatchProgress(eventType: js.Any): js.Any = js.native
    
    var _error: js.Any = js.native
    
    /* private */ def _finalizeHeaders(): js.Any = js.native
    
    var _headers: js.Any = js.native
    
    var _lengthComputable: js.Any = js.native
    
    var _loadedBytes: js.Any = js.native
    
    var _loweredHeaders: js.Any = js.native
    
    var _method: js.Any = js.native
    
    var _mimeOverride: js.Any = js.native
    
    /* private */ def _onHttpRequestError(request: js.Any, error: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponse(request: js.Any, response: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponseClose(response: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponseData(response: js.Any, data: js.Any): js.Any = js.native
    
    /* private */ def _onHttpResponseEnd(response: js.Any): js.Any = js.native
    
    /* private */ def _onHttpTimeout(request: js.Any): js.Any = js.native
    
    /* private */ def _parseResponse(): js.Any = js.native
    
    /* private */ def _parseResponseEncoding(): js.Any = js.native
    
    /* private */ def _parseResponseHeaders(response: js.Any): js.Any = js.native
    
    /* private */ def _parseUrl(urlString: js.Any, user: js.Any, password: js.Any): js.Any = js.native
    
    var _privateHeaders: js.Any = js.native
    
    var _request: js.Any = js.native
    
    var _response: js.Any = js.native
    
    var _responseHeaders: js.Any = js.native
    
    var _responseParts: js.Any = js.native
    
    var _restrictedHeaders: js.Any = js.native
    
    var _restrictedMethods: js.Any = js.native
    
    /* private */ def _sendFile(data: js.Any): js.Any = js.native
    
    /* private */ def _sendHttp(data: js.Any): js.Any = js.native
    
    /* private */ def _sendHxxpRequest(): js.Any = js.native
    
    /* private */ def _setError(): js.Any = js.native
    
    /* private */ def _setReadyState(readyState: js.Any): js.Any = js.native
    
    var _sync: js.Any = js.native
    
    var _totalBytes: js.Any = js.native
    
    var _url: js.Any = js.native
    
    var _userAgent: js.Any = js.native
    
    def abort(): Unit = js.native
    
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(name: String): String = js.native
    
    var nodejsBaseUrl: String | Null = js.native
    
    var nodejsHttpAgent: Agent = js.native
    
    var nodejsHttpsAgent: Agent = js.native
    
    def nodejsSet(options: BaseUrl): Unit = js.native
    
    var onreadystatechange: ProgressEventListener | Null = js.native
    
    def open(method: String, url: String): Unit = js.native
    def open(
      method: String,
      url: String,
      async: js.UndefOr[scala.Nothing],
      user: js.UndefOr[scala.Nothing],
      password: String
    ): Unit = js.native
    def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: String): Unit = js.native
    def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: js.UndefOr[scala.Nothing], password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
    
    def overrideMimeType(mimeType: String): Unit = js.native
    
    var readyState: Double = js.native
    
    var response: String | js.typedarray.ArrayBuffer | Buffer | js.Object | Null = js.native
    
    var responseText: String = js.native
    
    var responseType: String = js.native
    
    var responseUrl: String = js.native
    
    def send(): Unit = js.native
    def send(data: String): Unit = js.native
    def send(data: js.typedarray.ArrayBuffer): Unit = js.native
    
    def setRequestHeader(name: String, value: js.Any): Unit = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
    
    var timeout: Double = js.native
    
    var upload: XMLHttpRequestUpload = js.native
    
    var withCredentials: Boolean = js.native
  }
  /* static members */
  object XMLHttpRequest {
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.DONE")
    @js.native
    def DONE: Double = js.native
    @scala.inline
    def DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONE")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.HEADERS_RECEIVED")
    @js.native
    def HEADERS_RECEIVED: Double = js.native
    @scala.inline
    def HEADERS_RECEIVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADERS_RECEIVED")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.InvalidStateError")
    @js.native
    def InvalidStateError: Instantiable0[typingsSlinky.xhr2Cookies.errorsMod.InvalidStateError] = js.native
    @scala.inline
    def InvalidStateError_=(x: Instantiable0[InvalidStateError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.LOADING")
    @js.native
    def LOADING: Double = js.native
    @scala.inline
    def LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.NetworkError")
    @js.native
    def NetworkError: Instantiable0[typingsSlinky.xhr2Cookies.errorsMod.NetworkError] = js.native
    @scala.inline
    def NetworkError_=(x: Instantiable0[NetworkError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NetworkError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.OPENED")
    @js.native
    def OPENED: Double = js.native
    @scala.inline
    def OPENED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.ProgressEvent")
    @js.native
    def ProgressEvent: Instantiable1[/* type */ String, typingsSlinky.xhr2Cookies.progressEventMod.ProgressEvent] = js.native
    @scala.inline
    def ProgressEvent_=(x: Instantiable1[/* type */ String, ProgressEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.SecurityError")
    @js.native
    def SecurityError: Instantiable0[typingsSlinky.xhr2Cookies.errorsMod.SecurityError] = js.native
    @scala.inline
    def SecurityError_=(x: Instantiable0[SecurityError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecurityError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.SyntaxError")
    @js.native
    def SyntaxError: Instantiable0[typingsSlinky.xhr2Cookies.errorsMod.SyntaxError] = js.native
    @scala.inline
    def SyntaxError_=(x: Instantiable0[SyntaxError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.UNSENT")
    @js.native
    def UNSENT: Double = js.native
    @scala.inline
    def UNSENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSENT")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.XMLHttpRequestUpload")
    @js.native
    def XMLHttpRequestUpload: Instantiable0[typingsSlinky.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload] = js.native
    @scala.inline
    def XMLHttpRequestUpload_=(x: Instantiable0[XMLHttpRequestUpload]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XMLHttpRequestUpload")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.cookieJar")
    @js.native
    def cookieJar: js.Any = js.native
    @scala.inline
    def cookieJar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies/dist/xml-http-request", "XMLHttpRequest.nodejsSet")
    @js.native
    def nodejsSet(options: BaseUrl): Unit = js.native
  }
  
  @js.native
  trait XHRUrl extends Url {
    
    var method: js.UndefOr[String] = js.native
  }
  object XHRUrl {
    
    @scala.inline
    def apply(href: String): XHRUrl = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[XHRUrl]
    }
    
    @scala.inline
    implicit class XHRUrlMutableBuilder[Self <: XHRUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait XMLHttpRequestOptions extends StObject {
    
    var anon: js.UndefOr[Boolean] = js.native
  }
  object XMLHttpRequestOptions {
    
    @scala.inline
    def apply(): XMLHttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLHttpRequestOptions]
    }
    
    @scala.inline
    implicit class XMLHttpRequestOptionsMutableBuilder[Self <: XMLHttpRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnon(value: Boolean): Self = StObject.set(x, "anon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonUndefined: Self = StObject.set(x, "anon", js.undefined)
    }
  }
}
