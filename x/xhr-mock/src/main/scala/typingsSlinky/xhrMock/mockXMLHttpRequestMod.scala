package typingsSlinky.xhrMock

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.BodyInit
import typingsSlinky.std.XMLHttpRequestResponseType
import typingsSlinky.std.XMLHttpRequestUpload
import typingsSlinky.std.stdStrings.readystatechange
import typingsSlinky.xhrMock.typesMod.ErrorCallbackEvent
import typingsSlinky.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockXMLHttpRequestMod {
  
  @JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Default)
  @js.native
  class default () extends MockXMLHttpRequest
  /* static members */
  object default {
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.DONE")
    @js.native
    val DONE: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.HEADERS_RECEIVED")
    @js.native
    val HEADERS_RECEIVED: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.LOADING")
    @js.native
    val LOADING: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.OPENED")
    @js.native
    val OPENED: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.UNSENT")
    @js.native
    val UNSENT: ReadyState = js.native
    
    /**
      * Add a mock handler
      */
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.addHandler")
    @js.native
    def addHandler(fn: MockFunction): Unit = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.errorCallback")
    @js.native
    def errorCallback(event: ErrorCallbackEvent): Unit = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.handlers")
    @js.native
    def handlers: js.Array[MockFunction] = js.native
    @scala.inline
    def handlers_=(x: js.Array[MockFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlers")(x.asInstanceOf[js.Any])
    
    /**
      * Remove all request handlers
      */
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.removeAllHandlers")
    @js.native
    def removeAllHandlers(): Unit = js.native
    
    /**
      * Remove a mock handler
      */
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.removeHandler")
    @js.native
    def removeHandler(fn: MockFunction): Unit = js.native
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("xhr-mock/lib/MockXMLHttpRequest", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
    
    @js.native
    sealed trait DONE extends ReadyState
    /* 4 */ val DONE: typingsSlinky.xhrMock.mockXMLHttpRequestMod.ReadyState.DONE with Double = js.native
    
    @js.native
    sealed trait HEADERS_RECEIVED extends ReadyState
    /* 2 */ val HEADERS_RECEIVED: typingsSlinky.xhrMock.mockXMLHttpRequestMod.ReadyState.HEADERS_RECEIVED with Double = js.native
    
    @js.native
    sealed trait LOADING extends ReadyState
    /* 3 */ val LOADING: typingsSlinky.xhrMock.mockXMLHttpRequestMod.ReadyState.LOADING with Double = js.native
    
    @js.native
    sealed trait OPENED extends ReadyState
    /* 1 */ val OPENED: typingsSlinky.xhrMock.mockXMLHttpRequestMod.ReadyState.OPENED with Double = js.native
    
    @js.native
    sealed trait UNSENT extends ReadyState
    /* 0 */ val UNSENT: typingsSlinky.xhrMock.mockXMLHttpRequestMod.ReadyState.UNSENT with Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.std.EventTarget because Already inherited
  - typingsSlinky.std.XMLHttpRequestEventTarget because Already inherited
  - typingsSlinky.std.XMLHttpRequest because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined upload, status, withCredentials, OPENED, LOADING, responseURL, response, readyState, DONE, UNSENT, responseType, HEADERS_RECEIVED, responseText, timeout, responseXML, onreadystatechange, statusText, abort, addEventListener_readystatechange, addEventListener_readystatechange, addEventListener_readystatechange, getAllResponseHeaders, getResponseHeader, open, open, open, open, open, open, overrideMimeType, removeEventListener_readystatechange, removeEventListener_readystatechange, removeEventListener_readystatechange, send, send, send, setRequestHeader */ @js.native
  trait MockXMLHttpRequest
    extends typingsSlinky.xhrMock.mockXMLHttpRequestEventTargetMod.default {
    
    val DONE: Double | ReadyState = js.native
    
    val HEADERS_RECEIVED: Double | ReadyState = js.native
    
    val LOADING: Double | ReadyState = js.native
    
    val OPENED: Double | ReadyState = js.native
    
    val UNSENT: Double | ReadyState = js.native
    
    var _timeout: js.Any = js.native
    
    var _timeoutTimer: js.Any = js.native
    
    /**
      * Cancels any network activity.
      */
    def abort(): Unit = js.native
    
    @JSName("addEventListener")
    def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ def applyNetworkError(): js.Any = js.native
    
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(name: String): Null | String = js.native
    
    /* private */ def handleError(error: js.Any): js.Any = js.native
    
    /* private */ def handleResponseBody(res: js.Any): js.Any = js.native
    
    var isAborted: js.Any = js.native
    
    var isSending: js.Any = js.native
    
    var isSynchronous: js.Any = js.native
    
    var isTimedOut: js.Any = js.native
    
    var isUploadComplete: js.Any = js.native
    
    def msCachingEnabled(): Boolean = js.native
    
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    def onreadystatechange(ev: Event): js.Any = js.native
    
    /**
      * Sets the request method, request URL, and synchronous flag.
      * 
      * Throws a "SyntaxError" DOMException if either method is not a valid HTTP method or url cannot be parsed.
      * 
      * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
      * 
      * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
      */
    def open(method: String, url: String): Unit = js.native
    def open(
      method: String,
      url: String,
      async: js.UndefOr[scala.Nothing],
      username: js.UndefOr[scala.Nothing],
      password: String
    ): Unit = js.native
    def open(method: String, url: String, async: js.UndefOr[scala.Nothing], username: String): Unit = js.native
    def open(method: String, url: String, async: js.UndefOr[scala.Nothing], username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: js.UndefOr[scala.Nothing], username: Null, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: js.UndefOr[scala.Nothing], password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: Null, password: String): Unit = js.native
    
    /**
      * Acts as if the `Content-Type` header value for response is mime. (It does not actually change the header though.)
      * 
      * Throws an "InvalidStateError" DOMException if state is loading or done.
      */
    def overrideMimeType(mime: String): Unit = js.native
    
    var readyState: Double | ReadyState = js.native
    
    /* private */ def receiveResponse(res: js.Any): js.Any = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    
    /* private */ def reportError(event: js.Any): js.Any = js.native
    
    var req: js.Any = js.native
    
    var res: js.Any = js.native
    
    val response: js.Any = js.native
    
    val responseText: String = js.native
    
    var responseType: XMLHttpRequestResponseType = js.native
    
    var responseURL: String = js.native
    
    val responseXML: Document | Null = js.native
    
    /**
      * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
      * 
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      */
    def send(): Unit = js.native
    def send(body: js.Any): Unit = js.native
    def send(body: Document): Unit = js.native
    def send(body: BodyInit): Unit = js.native
    
    /* private */ def sendAsync(): js.Any = js.native
    
    /* private */ def sendRequest(req: js.Any): js.Any = js.native
    
    /* private */ def sendSync(): js.Any = js.native
    
    /**
      * Combines a header in author request headers.
      * 
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      * 
      * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    var timeout: Double = js.native
    
    var upload: XMLHttpRequestUpload = js.native
    
    var withCredentials: Boolean = js.native
  }
}
