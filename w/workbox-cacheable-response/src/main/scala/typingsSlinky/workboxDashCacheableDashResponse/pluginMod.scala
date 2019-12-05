package typingsSlinky.workboxDashCacheableDashResponse

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxDashCacheableDashResponse.cacheableResponseMod.CacheableResponseConfig
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CacheWillUpdateCallback
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CacheWillUpdateCallbackParamParam
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-cacheable-response/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin () extends WorkboxPlugin {
    def this(config: CacheableResponseConfig) = this()
    @JSName("cacheWillUpdate")
    var cacheWillUpdate_Original: CacheWillUpdateCallback = js.native
    @JSName("cacheWillUpdate")
    def cacheWillUpdate_MPlugin(param: CacheWillUpdateCallbackParamParam): js.Promise[js.UndefOr[Response]] = js.native
  }
  
}

