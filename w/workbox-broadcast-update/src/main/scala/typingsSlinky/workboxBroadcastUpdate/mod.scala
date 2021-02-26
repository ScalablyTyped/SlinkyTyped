package typingsSlinky.workboxBroadcastUpdate

import typingsSlinky.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsSlinky.workboxBroadcastUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-broadcast-update", "BroadcastCacheUpdate")
  @js.native
  class BroadcastCacheUpdate ()
    extends typingsSlinky.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  @JSImport("workbox-broadcast-update", "Plugin")
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxBroadcastUpdate.pluginMod.Plugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  @JSImport("workbox-broadcast-update", "broadcastUpdate")
  @js.native
  def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = js.native
}
