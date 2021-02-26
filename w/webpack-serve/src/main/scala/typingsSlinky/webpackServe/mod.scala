package typingsSlinky.webpackServe

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.node.netMod.Server
import typingsSlinky.webpackServe.anon.Compiler
import typingsSlinky.webpackServe.anon.Stats
import typingsSlinky.webpackServe.webpackServeStrings.`build-finished`
import typingsSlinky.webpackServe.webpackServeStrings.`build-started`
import typingsSlinky.webpackServe.webpackServeStrings.`compiler-error`
import typingsSlinky.webpackServe.webpackServeStrings.`compiler-warning`
import typingsSlinky.webpackServe.webpackServeStrings.debug
import typingsSlinky.webpackServe.webpackServeStrings.error
import typingsSlinky.webpackServe.webpackServeStrings.http
import typingsSlinky.webpackServe.webpackServeStrings.https
import typingsSlinky.webpackServe.webpackServeStrings.info
import typingsSlinky.webpackServe.webpackServeStrings.listening
import typingsSlinky.webpackServe.webpackServeStrings.silent
import typingsSlinky.webpackServe.webpackServeStrings.trace
import typingsSlinky.webpackServe.webpackServeStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-serve", JSImport.Namespace)
  @js.native
  def apply(argv: js.Object, options: Options): js.Promise[Result] = js.native
  
  @js.native
  trait EventMap extends StObject {
    
    var `build-finished`: Stats = js.native
    
    var `build-started`: Compiler = js.native
    
    var `compiler-error`: Stats = js.native
    
    var `compiler-warning`: Stats = js.native
    
    var listening: typingsSlinky.webpackServe.anon.Options = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply(
      `build-finished`: Stats,
      `build-started`: Compiler,
      `compiler-error`: Stats,
      `compiler-warning`: Stats,
      listening: typingsSlinky.webpackServe.anon.Options
    ): EventMap = {
      val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
      __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
      __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
      __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBuild-finished`(value: Stats): Self = StObject.set(x, "build-finished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBuild-started`(value: Compiler): Self = StObject.set(x, "build-started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCompiler-error`(value: Stats): Self = StObject.set(x, "compiler-error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCompiler-warning`(value: Stats): Self = StObject.set(x, "compiler-warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListening(value: typingsSlinky.webpackServe.anon.Options): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InitializedKoa extends ^[DefaultState, DefaultContext] {
    
    var server: Server = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait InitializedOptions extends Options {
    
    var protocol: http | https = js.native
  }
  object InitializedOptions {
    
    @scala.inline
    def apply(protocol: http | https): InitializedOptions = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializedOptions]
    }
    
    @scala.inline
    implicit class InitializedOptionsMutableBuilder[Self <: InitializedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Middleware extends StObject {
    
    /** Function to call to add koa-static */
    def content(): Unit = js.native
    
    /** Function to call to add the webpack-dev-middleware */
    def webpack(): Unit = js.native
  }
  object Middleware {
    
    @scala.inline
    def apply(content: () => Unit, webpack: () => Unit): Middleware = {
      val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), webpack = js.Any.fromFunction0(webpack))
      __obj.asInstanceOf[Middleware]
    }
    
    @scala.inline
    implicit class MiddlewareMutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: () => Unit): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpack(value: () => Unit): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined {[ K in keyof webpack-serve.webpack-serve.EventMap ]:? (args : webpack-serve.webpack-serve.EventMap[K]): void} */
  @js.native
  trait OnOptions extends StObject {
    
    var `build-finished`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
    
    var `build-started`: js.UndefOr[js.Function1[/* args */ Compiler, Unit]] = js.native
    
    var `compiler-error`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
    
    var `compiler-warning`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
    
    var listening: js.UndefOr[js.Function1[/* args */ typingsSlinky.webpackServe.anon.Options, Unit]] = js.native
  }
  object OnOptions {
    
    @scala.inline
    def apply(): OnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnOptions]
    }
    
    @scala.inline
    implicit class OnOptionsMutableBuilder[Self <: OnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBuild-finished`(value: /* args */ Stats => Unit): Self = StObject.set(x, "build-finished", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setBuild-finishedUndefined`: Self = StObject.set(x, "build-finished", js.undefined)
      
      @scala.inline
      def `setBuild-started`(value: /* args */ Compiler => Unit): Self = StObject.set(x, "build-started", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setBuild-startedUndefined`: Self = StObject.set(x, "build-started", js.undefined)
      
      @scala.inline
      def `setCompiler-error`(value: /* args */ Stats => Unit): Self = StObject.set(x, "compiler-error", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setCompiler-errorUndefined`: Self = StObject.set(x, "compiler-error", js.undefined)
      
      @scala.inline
      def `setCompiler-warning`(value: /* args */ Stats => Unit): Self = StObject.set(x, "compiler-warning", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setCompiler-warningUndefined`: Self = StObject.set(x, "compiler-warning", js.undefined)
      
      @scala.inline
      def setListening(value: /* args */ typingsSlinky.webpackServe.anon.Options => Unit): Self = StObject.set(x, "listening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
    }
  }
  
  @js.native
  trait OpenOptions extends StObject {
    
    /** Name of the browser to open */
    var app: js.UndefOr[String] = js.native
    
    /** Path on the server to open */
    var path: js.UndefOr[String] = js.native
  }
  object OpenOptions {
    
    @scala.inline
    def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    @scala.inline
    implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Addon to webpack-serve that allows access to the Koa server instance */
    var add: js.UndefOr[
        js.Function3[/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ this.type, Unit]
      ] = js.native
    
    /** Copy the server URL to the clipboard when the server is started */
    var clipboard: js.UndefOr[Boolean] = js.native
    
    /** Custom instance of a webpack compiler */
    var compiler: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
      ] = js.native
    
    /** Webpack configuration for creating a new webpack compiler instance */
    var config: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
      ] = js.native
    
    /** A path or array of paths where content will be served from */
    var content: js.UndefOr[String | js.Array[String]] = js.native
    
    /** Options for webpack-dev-middleware */
    var devMiddleware: js.UndefOr[typingsSlinky.webpackDevMiddleware.mod.Options] = js.native
    
    /** The host the server will listen on */
    var host: js.UndefOr[String] = js.native
    
    /** Options for webpack-hot-client */
    var hotClient: js.UndefOr[typingsSlinky.webpackHotClient.mod.Options | Boolean] = js.native
    
    /** Enable HTTP2 support */
    var http2: js.UndefOr[Boolean] = js.native
    
    /** Configuration object for the server to use HTTPS */
    var https: js.UndefOr[ServerOptions] = js.native
    
    /** Level of information for webpack-serve to output */
    var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
    
    /** Prepend timestamp to each log line */
    var logTime: js.UndefOr[Boolean] = js.native
    
    /** Object of subscribers to webpack-serve bus events */
    var on: js.UndefOr[OnOptions] = js.native
    
    /** Open the browser when started */
    var open: js.UndefOr[OpenOptions | Boolean] = js.native
    
    /** Port that the server listens on */
    var port: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (/* app */ InitializedKoa, /* middleware */ Middleware, Options) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setClipboard(value: Boolean): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      @scala.inline
      def setCompiler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      @scala.inline
      def setConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setDevMiddleware(value: typingsSlinky.webpackDevMiddleware.mod.Options): Self = StObject.set(x, "devMiddleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevMiddlewareUndefined: Self = StObject.set(x, "devMiddleware", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHotClient(value: typingsSlinky.webpackHotClient.mod.Options | Boolean): Self = StObject.set(x, "hotClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotClientUndefined: Self = StObject.set(x, "hotClient", js.undefined)
      
      @scala.inline
      def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      @scala.inline
      def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLogLevel(value: trace | debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      @scala.inline
      def setOn(value: OnOptions): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOpen(value: OpenOptions | Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    /** An instance of a Koa application, extended with a server property, and stop method, which is used to programatically stop the server */
    var app: InitializedKoa = js.native
    
    @JSName("on")
    def on_buildfinished(`type`: `build-finished`, callback: js.Function1[/* args */ Stats, Unit]): Unit = js.native
    /** A function which binds a serve event-name to a function */
    @JSName("on")
    def on_buildstarted(`type`: `build-started`, callback: js.Function1[/* args */ Compiler, Unit]): Unit = js.native
    @JSName("on")
    def on_compilererror(`type`: `compiler-error`, callback: js.Function1[/* args */ Stats, Unit]): Unit = js.native
    @JSName("on")
    def on_compilerwarning(`type`: `compiler-warning`, callback: js.Function1[/* args */ Stats, Unit]): Unit = js.native
    @JSName("on")
    def on_listening(
      `type`: listening,
      callback: js.Function1[/* args */ typingsSlinky.webpackServe.anon.Options, Unit]
    ): Unit = js.native
    
    /** Access to a frozen copy of the internal options object used by the module. */
    var options: InitializedOptions = js.native
  }
  
  /* augmented module */
  object webpackAugmentingMod {
    
    @js.native
    trait Configuration extends StObject {
      
      var serve: js.UndefOr[Options] = js.native
    }
    object Configuration {
      
      @scala.inline
      def apply(): Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Configuration]
      }
      
      @scala.inline
      implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServe(value: Options): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      }
    }
  }
}
