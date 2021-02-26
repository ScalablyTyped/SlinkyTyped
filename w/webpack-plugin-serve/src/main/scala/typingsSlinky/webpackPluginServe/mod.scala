package typingsSlinky.webpackPluginServe

import typingsSlinky.connectHistoryApiFallback.mod.Options
import typingsSlinky.globby.mod.GlobbyOptions
import typingsSlinky.httpProxyMiddleware.mod.Config
import typingsSlinky.httpProxyMiddleware.mod.Proxy
import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.koaCompress.mod.CompressOptions
import typingsSlinky.node.http2Mod.SecureServerOptions
import typingsSlinky.node.http2Mod.ServerOptions
import typingsSlinky.webpackPluginServe.anon.Address
import typingsSlinky.webpackPluginServe.anon.App
import typingsSlinky.webpackPluginServe.anon.Apply
import typingsSlinky.webpackPluginServe.anon.Level
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.`refresh-on-failure`
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.minimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-plugin-serve", "WebpackPluginServe")
  @js.native
  class WebpackPluginServe[Compiler] () extends StObject {
    def this(opts: WebpackPluginServeOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def attach(): Apply[Compiler] = js.native
    
    def hook(compiler: Compiler): Unit = js.native
  }
  
  @js.native
  trait Builtins extends StObject {
    
    def compress(opts: CompressOptions): Unit = js.native
    
    def four0four(): Unit = js.native
    def four0four(fn: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
    
    def historyFallback(opts: Options): Unit = js.native
    
    def proxy(args: Config): Proxy = js.native
    
    def static(paths: js.Array[String]): Unit = js.native
    def static(paths: js.Array[String], opts: typingsSlinky.koaStatic.mod.Options): Unit = js.native
    
    def websocket(): Unit = js.native
  }
  
  @js.native
  trait StaticObject extends StObject {
    
    var glob: js.UndefOr[String | js.Array[String]] = js.native
    
    var options: js.UndefOr[GlobbyOptions] = js.native
  }
  object StaticObject {
    
    @scala.inline
    def apply(): StaticObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticObject]
    }
    
    @scala.inline
    implicit class StaticObjectMutableBuilder[Self <: StaticObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: String | js.Array[String]): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setGlobVarargs(value: String*): Self = StObject.set(x, "glob", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: GlobbyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait WebpackPluginServeOptions extends StObject {
    
    var client: js.UndefOr[Address] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var historyFallback: js.UndefOr[Boolean | Options] = js.native
    
    var hmr: js.UndefOr[Boolean | `refresh-on-failure`] = js.native
    
    var host: js.UndefOr[String | js.Promise[String]] = js.native
    
    var http2: js.UndefOr[Boolean | ServerOptions | SecureServerOptions] = js.native
    
    var https: js.UndefOr[typingsSlinky.node.httpsMod.ServerOptions] = js.native
    
    var liveReload: js.UndefOr[Boolean] = js.native
    
    var log: js.UndefOr[Level] = js.native
    
    var middleware: js.UndefOr[
        js.Function2[/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins, Unit]
      ] = js.native
    
    var open: js.UndefOr[Boolean | App] = js.native
    
    var port: js.UndefOr[Double | js.Promise[Double]] = js.native
    
    var progress: js.UndefOr[Boolean | minimal] = js.native
    
    var static: js.UndefOr[String | js.Array[String] | StaticObject] = js.native
    
    var status: js.UndefOr[Boolean] = js.native
    
    var waitForBuild: js.UndefOr[Boolean] = js.native
  }
  object WebpackPluginServeOptions {
    
    @scala.inline
    def apply(): WebpackPluginServeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackPluginServeOptions]
    }
    
    @scala.inline
    implicit class WebpackPluginServeOptionsMutableBuilder[Self <: WebpackPluginServeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Address): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setHistoryFallback(value: Boolean | Options): Self = StObject.set(x, "historyFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryFallbackUndefined: Self = StObject.set(x, "historyFallback", js.undefined)
      
      @scala.inline
      def setHmr(value: Boolean | `refresh-on-failure`): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      @scala.inline
      def setHost(value: String | js.Promise[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttp2(value: Boolean | ServerOptions | SecureServerOptions): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      @scala.inline
      def setHttps(value: typingsSlinky.node.httpsMod.ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      @scala.inline
      def setLog(value: Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMiddleware(value: (/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins) => Unit): Self = StObject.set(x, "middleware", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean | App): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPort(value: Double | js.Promise[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProgress(value: Boolean | minimal): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setStatic(value: String | js.Array[String] | StaticObject): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      @scala.inline
      def setStaticVarargs(value: String*): Self = StObject.set(x, "static", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setWaitForBuild(value: Boolean): Self = StObject.set(x, "waitForBuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForBuildUndefined: Self = StObject.set(x, "waitForBuild", js.undefined)
    }
  }
}
