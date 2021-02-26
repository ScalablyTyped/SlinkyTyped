package typingsSlinky.workboxCacheableResponse

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typingsSlinky.workboxCore.workboxPluginMod.CacheWillUpdateCallback
import typingsSlinky.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-cacheable-response/Plugin", "Plugin")
  @js.native
  class Plugin () extends WorkboxPlugin {
    def this(config: CacheableResponseConfig) = this()
    
    @JSName("cacheWillUpdate")
    def cacheWillUpdate_MPlugin(param: CacheWillUpdateCallbackParamParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cacheWillUpdate")
    var cacheWillUpdate_Original: CacheWillUpdateCallback = js.native
  }
}
