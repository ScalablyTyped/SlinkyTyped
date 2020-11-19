package typingsSlinky.workboxBackgroundSync

import typingsSlinky.workboxBackgroundSync.queueMod.QueueOptions
import typingsSlinky.workboxCore.workboxPluginMod.FetchDidFailCallback
import typingsSlinky.workboxCore.workboxPluginMod.FetchDidFailCallbackParam
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-background-sync/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  
  @js.native
  class Plugin protected () extends WorkboxPlugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    
    @JSName("fetchDidFail")
    def fetchDidFail_MPlugin(param: FetchDidFailCallbackParam): js.Promise[Unit] = js.native
    @JSName("fetchDidFail")
    var fetchDidFail_Original: FetchDidFailCallback = js.native
  }
}
