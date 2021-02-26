package typingsSlinky.webpackHotClient

import typingsSlinky.node.netMod.Server
import typingsSlinky.webpackHotClient.anon.ReadonlyOptions
import typingsSlinky.webpackHotClient.webpackHotClientStrings.debug
import typingsSlinky.webpackHotClient.webpackHotClientStrings.error
import typingsSlinky.webpackHotClient.webpackHotClientStrings.info
import typingsSlinky.webpackHotClient.webpackHotClientStrings.silent
import typingsSlinky.webpackHotClient.webpackHotClientStrings.trace
import typingsSlinky.webpackHotClient.webpackHotClientStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-hot-client", JSImport.Namespace)
  @js.native
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.MultiCompiler */ js.Any,
    options: Options
  ): Client = js.native
  
  @js.native
  trait Client extends StObject {
    
    /** Function that closes the WebSocketServer opened by the module. */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    /** Readonly version of the options after applying defaults */
    var options: ReadonlyOptions = js.native
    
    /** WebSocketServer instance with some hot-client specific method overrides */
    var server: WebSocketServer = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Automatically configure every entry */
    var allEntries: js.UndefOr[Boolean] = js.native
    
    /** Auto configure the given webpack config with the hot configuration */
    var autoConfigure: js.UndefOr[Boolean] = js.native
    
    /** Enable hot module reloading */
    var hmr: js.UndefOr[Boolean] = js.native
    
    /** Host that the WebSocket listens on */
    var host: js.UndefOr[WebpackHotHost | String] = js.native
    
    /** Enable HTTPS */
    var https: js.UndefOr[Boolean] = js.native
    
    /** Level of information for webpack-hot-client to output */
    var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
    
    /** Prepend timestamp to each log line */
    var logTime: js.UndefOr[Boolean] = js.native
    
    /** Port that the WebSocket listens on */
    var port: js.UndefOr[Double] = js.native
    
    /** Reload the page if a patch cannot be applied by webpack */
    var reload: js.UndefOr[Boolean] = js.native
    
    /** Server instance for webpack-hot-client to connect to */
    var server: js.UndefOr[Server] = js.native
    
    /** Webpack stats configuration */
    var stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ] = js.native
    
    /** Webpack compile target */
    var validTargets: js.UndefOr[js.Array[String]] = js.native
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
      def setAllEntries(value: Boolean): Self = StObject.set(x, "allEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllEntriesUndefined: Self = StObject.set(x, "allEntries", js.undefined)
      
      @scala.inline
      def setAutoConfigure(value: Boolean): Self = StObject.set(x, "autoConfigure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConfigureUndefined: Self = StObject.set(x, "autoConfigure", js.undefined)
      
      @scala.inline
      def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      @scala.inline
      def setHost(value: WebpackHotHost | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
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
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setValidTargets(value: js.Array[String]): Self = StObject.set(x, "validTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidTargetsUndefined: Self = StObject.set(x, "validTargets", js.undefined)
      
      @scala.inline
      def setValidTargetsVarargs(value: String*): Self = StObject.set(x, "validTargets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WebSocketServer
    extends typingsSlinky.ws.mod.Server {
    
    /** Forwards a message to each open client on the WebSocketServer */
    def broadcast(data: js.Any): Unit = js.native
    
    /** Processes stats and sends messages through broadcast() */
    def send(
      stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait WebpackHotHost extends StObject {
    
    /** Client hostname that is used in the browser by WebSockets */
    var client: String = js.native
    
    /** Server hostname */
    var server: String = js.native
  }
  object WebpackHotHost {
    
    @scala.inline
    def apply(client: String, server: String): WebpackHotHost = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackHotHost]
    }
    
    @scala.inline
    implicit class WebpackHotHostMutableBuilder[Self <: WebpackHotHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
