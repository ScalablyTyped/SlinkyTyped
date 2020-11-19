package typingsSlinky.workboxBroadcastUpdate

import typingsSlinky.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsSlinky.workboxCore.workboxPluginMod.CacheDidUpdateCallback
import typingsSlinky.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-broadcast-update/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  
  @js.native
  class Plugin () extends WorkboxPlugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
    
    @JSName("cacheDidUpdate")
    def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
    @JSName("cacheDidUpdate")
    var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
  }
}
