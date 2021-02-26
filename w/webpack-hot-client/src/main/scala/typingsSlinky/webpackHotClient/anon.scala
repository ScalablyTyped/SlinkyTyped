package typingsSlinky.webpackHotClient

import typingsSlinky.node.netMod.Server
import typingsSlinky.webpackHotClient.mod.WebpackHotHost
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

object anon {
  
  /* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
  @js.native
  trait ReadonlyOptions extends StObject {
    
    val allEntries: js.UndefOr[Boolean] = js.native
    
    val autoConfigure: js.UndefOr[Boolean] = js.native
    
    val hmr: js.UndefOr[Boolean] = js.native
    
    val host: js.UndefOr[WebpackHotHost | String] = js.native
    
    val https: js.UndefOr[Boolean] = js.native
    
    val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
    
    val logTime: js.UndefOr[Boolean] = js.native
    
    val port: js.UndefOr[Double] = js.native
    
    val reload: js.UndefOr[Boolean] = js.native
    
    val server: js.UndefOr[Server] = js.native
    
    val stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ] = js.native
    
    val validTargets: js.UndefOr[js.Array[String]] = js.native
  }
  object ReadonlyOptions {
    
    @scala.inline
    def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsMutableBuilder[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
      
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
}
