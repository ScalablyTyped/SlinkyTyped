package typingsSlinky.teenyRequest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpsMod.Agent
import typingsSlinky.node.httpsMod.AgentOptions
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.Error
import typingsSlinky.teenyRequest.teenyRequestBooleans.`false`
import typingsSlinky.teenyRequest.teenyStatisticsMod.TeenyStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("teeny-request", "RequestError")
  @js.native
  class RequestError () extends Error {
    
    var code: js.UndefOr[Double] = js.native
  }
  
  object teenyRequest {
    
    @JSImport("teeny-request", "teenyRequest")
    @js.native
    def apply(reqOpts: Options): Request = js.native
    @JSImport("teeny-request", "teenyRequest")
    @js.native
    def apply(reqOpts: Options, callback: RequestCallback[_]): Unit = js.native
    @JSImport("teeny-request", "teenyRequest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("teeny-request", "teenyRequest.defaults")
    @js.native
    def defaults: js.Function1[
        /* defaults */ CoreOptions, 
        js.Function2[
          /* reqOpts */ Options, 
          /* callback */ js.UndefOr[RequestCallback[js.Any]], 
          Unit | Request
        ]
      ] = js.native
    @scala.inline
    def defaults_=(
      x: js.Function1[
          /* defaults */ CoreOptions, 
          js.Function2[
            /* reqOpts */ Options, 
            /* callback */ js.UndefOr[RequestCallback[js.Any]], 
            Unit | Request
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("teeny-request", "teenyRequest.resetStats")
    @js.native
    def resetStats: js.Function0[Unit] = js.native
    @scala.inline
    def resetStats_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetStats")(x.asInstanceOf[js.Any])
    
    @JSImport("teeny-request", "teenyRequest.stats")
    @js.native
    def stats: TeenyStatistics = js.native
    @scala.inline
    def stats_=(x: TeenyStatistics): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stats")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CoreOptions extends StObject {
    
    var body: js.UndefOr[String | js.Object] = js.native
    
    var forever: js.UndefOr[Boolean] = js.native
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var json: js.UndefOr[js.Any] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var multipart: js.UndefOr[js.Array[RequestPart]] = js.native
    
    var pool: js.UndefOr[AgentOptions | typingsSlinky.node.httpMod.AgentOptions] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var qs: js.UndefOr[js.Any] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var useQuerystring: js.UndefOr[Boolean] = js.native
  }
  object CoreOptions {
    
    @scala.inline
    def apply(): CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreOptions]
    }
    
    @scala.inline
    implicit class CoreOptionsMutableBuilder[Self <: CoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMultipart(value: js.Array[RequestPart]): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      @scala.inline
      def setMultipartVarargs(value: RequestPart*): Self = StObject.set(x, "multipart", js.Array(value :_*))
      
      @scala.inline
      def setPool(value: AgentOptions | typingsSlinky.node.httpMod.AgentOptions): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setQs(value: js.Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
    }
  }
  
  type Headers = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.teenyRequest.mod.OptionsWithUri
    - typingsSlinky.teenyRequest.mod.OptionsWithUrl
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def OptionsWithUri(uri: String): typingsSlinky.teenyRequest.mod.OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.teenyRequest.mod.OptionsWithUri]
    }
    
    @scala.inline
    def OptionsWithUrl(url: String): typingsSlinky.teenyRequest.mod.OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.teenyRequest.mod.OptionsWithUrl]
    }
  }
  
  @js.native
  trait OptionsWithUri
    extends CoreOptions
       with Options {
    
    var uri: String = js.native
  }
  object OptionsWithUri {
    
    @scala.inline
    def apply(uri: String): OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUri]
    }
    
    @scala.inline
    implicit class OptionsWithUriMutableBuilder[Self <: OptionsWithUri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionsWithUrl
    extends CoreOptions
       with Options {
    
    var url: String = js.native
  }
  object OptionsWithUrl {
    
    @scala.inline
    def apply(url: String): OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUrl]
    }
    
    @scala.inline
    implicit class OptionsWithUrlMutableBuilder[Self <: OptionsWithUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends PassThrough {
    
    var agent: Agent | `false` = js.native
    
    var headers: Headers = js.native
    
    var href: js.UndefOr[String] = js.native
  }
  
  type RequestCallback[T] = js.Function3[
    /* err */ js.Error | Null, 
    /* response */ Response[js.Any], 
    /* body */ js.UndefOr[T], 
    Unit
  ]
  
  @js.native
  trait RequestPart extends StObject {
    
    var body: String | Readable = js.native
  }
  object RequestPart {
    
    @scala.inline
    def apply(body: String | Readable): RequestPart = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPart]
    }
    
    @scala.inline
    implicit class RequestPartMutableBuilder[Self <: RequestPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response[T] extends StObject {
    
    var body: T = js.native
    
    var headers: Headers = js.native
    
    var request: Request = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: js.UndefOr[String] = js.native
  }
  object Response {
    
    @scala.inline
    def apply[T](body: T, headers: Headers, request: Request, statusCode: Double): Response[T] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[T]]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
      
      @scala.inline
      def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    }
  }
}
