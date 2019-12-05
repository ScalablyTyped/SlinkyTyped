package typingsSlinky.workboxDashBackgroundDashSync

import typingsSlinky.workboxDashBackgroundDashSync.queueMod.QueueOptions
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.FetchDidFailCallback
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.FetchDidFailCallbackParam
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin protected () extends WorkboxPlugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    @JSName("fetchDidFail")
    var fetchDidFail_Original: FetchDidFailCallback = js.native
    @JSName("fetchDidFail")
    def fetchDidFail_MPlugin(param: FetchDidFailCallbackParam): js.Promise[Unit] = js.native
  }
  
}

