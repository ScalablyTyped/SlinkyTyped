package typingsSlinky.soap

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.Dict
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.soap.soapStrings.close
import typingsSlinky.soap.soapStrings.data
import typingsSlinky.soap.soapStrings.end
import typingsSlinky.soap.soapStrings.error
import typingsSlinky.soap.soapStrings.headers
import typingsSlinky.soap.soapStrings.pause
import typingsSlinky.soap.soapStrings.readable
import typingsSlinky.soap.soapStrings.request
import typingsSlinky.soap.soapStrings.response
import typingsSlinky.soap.soapStrings.resume
import typingsSlinky.soap.typesMod.IServerOptions
import typingsSlinky.soap.typesMod.IServices
import typingsSlinky.soap.wsdlMod.WSDL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("soap/lib/server", "Server")
  @js.native
  class Server protected () extends EventEmitter {
    def this(server: ServerType, path: String, services: IServices, wsdl: WSDL) = this()
    def this(server: ServerType, path: String, services: IServices, wsdl: WSDL, options: IServerOptions) = this()
    
    var _envelope: js.Any = js.native
    
    var _executeMethod: js.Any = js.native
    
    var _initializeOptions: js.Any = js.native
    
    var _process: js.Any = js.native
    
    var _processRequestXml: js.Any = js.native
    
    var _processSoapHeader: js.Any = js.native
    
    var _requestListener: js.Any = js.native
    
    var _sendError: js.Any = js.native
    
    var _sendHttpResponse: js.Any = js.native
    
    def addSoapHeader(soapHeader: js.Any): Double = js.native
    def addSoapHeader(
      soapHeader: js.Any,
      name: js.UndefOr[scala.Nothing],
      namespace: js.UndefOr[scala.Nothing],
      xmlns: String
    ): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: js.UndefOr[scala.Nothing], namespace: js.Any): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: js.UndefOr[scala.Nothing], namespace: js.Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.UndefOr[scala.Nothing], xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any, xmlns: String): Double = js.native
    
    def authenticate(security: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(
      security: js.Any,
      processAuthResult: js.UndefOr[scala.Nothing],
      req: js.UndefOr[scala.Nothing],
      obj: js.Any
    ): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: js.UndefOr[scala.Nothing], req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: js.UndefOr[scala.Nothing], req: Request, obj: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ Boolean, Unit]): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(
      security: js.Any,
      processAuthResult: js.Function1[/* result */ Boolean, Unit],
      req: js.UndefOr[scala.Nothing],
      obj: js.Any
    ): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ Boolean, Unit], req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(
      security: js.Any,
      processAuthResult: js.Function1[/* result */ Boolean, Unit],
      req: Request,
      obj: js.Any
    ): Boolean | Unit | js.Promise[Boolean] = js.native
    
    def authorizeConnection(req: Request): Boolean = js.native
    def authorizeConnection(req: Request, res: Response): Boolean = js.native
    
    var callback: js.Any = js.native
    
    def changeSoapHeader(index: js.Any, soapHeader: js.Any): Unit = js.native
    def changeSoapHeader(
      index: js.Any,
      soapHeader: js.Any,
      name: js.UndefOr[scala.Nothing],
      namespace: js.UndefOr[scala.Nothing],
      xmlns: js.Any
    ): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.UndefOr[scala.Nothing], namespace: js.Any): Unit = js.native
    def changeSoapHeader(
      index: js.Any,
      soapHeader: js.Any,
      name: js.UndefOr[scala.Nothing],
      namespace: js.Any,
      xmlns: js.Any
    ): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): Unit = js.native
    def changeSoapHeader(
      index: js.Any,
      soapHeader: js.Any,
      name: js.Any,
      namespace: js.UndefOr[scala.Nothing],
      xmlns: js.Any
    ): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): Unit = js.native
    
    def clearSoapHeaders(): Unit = js.native
    
    @JSName("emit")
    def emit_headers(event: headers, headers: js.Any, methodName: String): Boolean = js.native
    @JSName("emit")
    def emit_request(event: request, request: js.Any, methodName: String): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, headers: js.Any, methodName: String): Boolean = js.native
    
    var enableChunkedEncoding: js.Any = js.native
    
    def getSoapHeaders(): js.Array[String] = js.native
    
    def log(`type`: String, data: js.Any): js.Any = js.native
    
    /** Emitted when the SOAP Headers are not empty. */
    @JSName("on")
    def on_headers(event: headers, listener: js.Function2[/* headers */ js.Any, /* methodName */ String, Unit]): this.type = js.native
    /** Emitted for every received messages. */
    @JSName("on")
    def on_request(event: request, listener: js.Function2[/* request */ js.Any, /* methodName */ String, Unit]): this.type = js.native
    /** Emitted before sending SOAP response. */
    @JSName("on")
    def on_response(event: response, listener: js.Function2[/* response */ js.Any, /* methodName */ String, Unit]): this.type = js.native
    
    var onewayOptions: js.Any = js.native
    
    var path: String = js.native
    
    var returnFault: js.Any = js.native
    
    var services: IServices = js.native
    
    var soapHeaders: js.Any = js.native
    
    var suppressStack: js.Any = js.native
    
    var wsdl: js.Any = js.native
  }
  
  @js.native
  trait IExpressApp extends StObject {
    
    var route: js.Any = js.native
    
    var use: js.Any = js.native
  }
  object IExpressApp {
    
    @scala.inline
    def apply(route: js.Any, use: js.Any): IExpressApp = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpressApp]
    }
    
    @scala.inline
    implicit class IExpressAppMutableBuilder[Self <: IExpressApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoute(value: js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse(value: js.Any): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node.http.IncomingMessage & {  body :any | undefined} */
  @js.native
  trait Request extends StObject {
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    var aborted: Boolean = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    var body: js.UndefOr[js.Any] = js.native
    
    var complete: Boolean = js.native
    
    /**
      * @deprecate Use `socket` instead.
      */
    var connection: Socket = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: js.Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var httpVersion: String = js.native
    
    var httpVersionMajor: Double = js.native
    
    var httpVersionMinor: Double = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var method: js.UndefOr[String] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    var rawHeaders: js.Array[String] = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    var rawTrailers: js.Array[String] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def setTimeout(msecs: Double): this.type = js.native
    def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
    
    var socket: Socket = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusMessage: js.UndefOr[String] = js.native
    
    var trailers: Dict[String] = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var url: js.UndefOr[String] = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  type Response = ServerResponse
  
  type ServerType = typingsSlinky.node.httpMod.Server | IExpressApp
}
