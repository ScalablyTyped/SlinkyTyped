package typingsSlinky.workboxDashBroadcastDashUpdate

import typingsSlinky.workboxDashBroadcastDashUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsSlinky.workboxDashBroadcastDashUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-broadcast-update", JSImport.Namespace)
@js.native
object workboxDashBroadcastDashUpdateMod extends js.Object {
  @js.native
  class BroadcastCacheUpdate ()
    extends typingsSlinky.workboxDashBroadcastDashUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxDashBroadcastDashUpdate.pluginMod.Plugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = js.native
}

