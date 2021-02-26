package typingsSlinky.twitter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Request
import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequestCallback
import typingsSlinky.request.mod.RequiredUriUrl
import typingsSlinky.request.mod.Response
import typingsSlinky.twitter.twitterStrings.site
import typingsSlinky.twitter.twitterStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twitter", JSImport.Namespace)
  @js.native
  class ^ protected () extends Twitter {
    def this(options: AccessTokenOptions) = this()
    def this(options: BearerTokenOptions) = this()
  }
  
  @js.native
  trait AccessTokenOptions extends Options {
    
    var access_token_key: String = js.native
    
    var access_token_secret: String = js.native
  }
  object AccessTokenOptions {
    
    @scala.inline
    def apply(
      access_token_key: String,
      access_token_secret: String,
      consumer_key: String,
      consumer_secret: String
    ): AccessTokenOptions = {
      val __obj = js.Dynamic.literal(access_token_key = access_token_key.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenOptions]
    }
    
    @scala.inline
    implicit class AccessTokenOptionsMutableBuilder[Self <: AccessTokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token_key(value: String): Self = StObject.set(x, "access_token_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_token_secret(value: String): Self = StObject.set(x, "access_token_secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BearerTokenOptions extends Options {
    
    var bearer_token: String = js.native
  }
  object BearerTokenOptions {
    
    @scala.inline
    def apply(bearer_token: String, consumer_key: String, consumer_secret: String): BearerTokenOptions = {
      val __obj = js.Dynamic.literal(bearer_token = bearer_token.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[BearerTokenOptions]
    }
    
    @scala.inline
    implicit class BearerTokenOptionsMutableBuilder[Self <: BearerTokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBearer_token(value: String): Self = StObject.set(x, "bearer_token", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function3[/* error */ js.Any, /* data */ ResponseData, /* response */ Response, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var consumer_key: String = js.native
    
    var consumer_secret: String = js.native
    
    var media_base: js.UndefOr[String] = js.native
    
    var request_options: js.UndefOr[CoreOptions] = js.native
    
    var rest_base: js.UndefOr[String] = js.native
    
    var site_stream_base: js.UndefOr[String] = js.native
    
    var stream_base: js.UndefOr[String] = js.native
    
    var user_stream_base: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(consumer_key: String, consumer_secret: String): Options = {
      val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_base(value: String): Self = StObject.set(x, "media_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_baseUndefined: Self = StObject.set(x, "media_base", js.undefined)
      
      @scala.inline
      def setRequest_options(value: CoreOptions): Self = StObject.set(x, "request_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_optionsUndefined: Self = StObject.set(x, "request_options", js.undefined)
      
      @scala.inline
      def setRest_base(value: String): Self = StObject.set(x, "rest_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest_baseUndefined: Self = StObject.set(x, "rest_base", js.undefined)
      
      @scala.inline
      def setSite_stream_base(value: String): Self = StObject.set(x, "site_stream_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSite_stream_baseUndefined: Self = StObject.set(x, "site_stream_base", js.undefined)
      
      @scala.inline
      def setStream_base(value: String): Self = StObject.set(x, "stream_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream_baseUndefined: Self = StObject.set(x, "stream_base", js.undefined)
      
      @scala.inline
      def setUser_stream_base(value: String): Self = StObject.set(x, "user_stream_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_stream_baseUndefined: Self = StObject.set(x, "user_stream_base", js.undefined)
    }
  }
  
  @js.native
  trait RequestParams
    extends /* key */ StringDictionary[js.Any] {
    
    var base: js.UndefOr[String] = js.native
  }
  object RequestParams {
    
    @scala.inline
    def apply(): RequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestParams]
    }
    
    @scala.inline
    implicit class RequestParamsMutableBuilder[Self <: RequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    }
  }
  
  type ResponseData = StringDictionary[js.Any]
  
  @js.native
  trait Twitter extends StObject {
    
    val VERSION: String = js.native
    
    val allow_promise: Boolean = js.native
    
    def get(path: String): js.Promise[ResponseData] = js.native
    def get(path: String, callback: Callback): Unit = js.native
    def get(path: String, params: RequestParams): js.Promise[ResponseData] = js.native
    def get(path: String, params: RequestParams, callback: Callback): Unit = js.native
    
    def post(path: String): js.Promise[ResponseData] = js.native
    def post(path: String, callback: Callback): Unit = js.native
    def post(path: String, params: RequestParams): js.Promise[ResponseData] = js.native
    def post(path: String, params: RequestParams, callback: Callback): Unit = js.native
    
    def request(options: RequiredUriUrl with CoreOptions): Request = js.native
    def request(options: RequiredUriUrl with CoreOptions, callback: RequestCallback): Request = js.native
    def request(uri: String): Request = js.native
    def request(uri: String, callback: RequestCallback): Request = js.native
    def request(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): Request = js.native
    def request(uri: String, options: CoreOptions): Request = js.native
    def request(uri: String, options: CoreOptions, callback: RequestCallback): Request = js.native
    @JSName("request")
    val request_Original: RequestAPI[Request, CoreOptions, RequiredUriUrl] = js.native
    
    def stream(method: String): EventEmitter = js.native
    def stream(method: String, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
    def stream(method: String, params: StringDictionary[js.Any]): EventEmitter = js.native
    def stream(
      method: String,
      params: StringDictionary[js.Any],
      callback: js.Function1[/* stream */ EventEmitter, Unit]
    ): Unit = js.native
    @JSName("stream")
    def stream_site(method: site): EventEmitter = js.native
    @JSName("stream")
    def stream_site(method: site, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
    @JSName("stream")
    def stream_site(method: site, params: StringDictionary[js.Any]): EventEmitter = js.native
    @JSName("stream")
    def stream_site(
      method: site,
      params: StringDictionary[js.Any],
      callback: js.Function1[/* stream */ EventEmitter, Unit]
    ): Unit = js.native
    @JSName("stream")
    def stream_user(method: user): EventEmitter = js.native
    @JSName("stream")
    def stream_user(method: user, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
    @JSName("stream")
    def stream_user(method: user, params: StringDictionary[js.Any]): EventEmitter = js.native
    @JSName("stream")
    def stream_user(
      method: user,
      params: StringDictionary[js.Any],
      callback: js.Function1[/* stream */ EventEmitter, Unit]
    ): Unit = js.native
  }
}
