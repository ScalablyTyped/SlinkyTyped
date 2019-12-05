package typingsSlinky.workboxDashStrategies

import typingsSlinky.workboxDashStrategies.cacheFirstMod.CacheFirstOptions
import typingsSlinky.workboxDashStrategies.cacheOnlyMod.CacheOnlyOptions
import typingsSlinky.workboxDashStrategies.networkFirstMod.NetworkFirstOptions
import typingsSlinky.workboxDashStrategies.networkOnlyMod.NetworkOnlyOptions
import typingsSlinky.workboxDashStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies", JSImport.Namespace)
@js.native
object workboxDashStrategiesMod extends js.Object {
  @js.native
  class CacheFirst ()
    extends typingsSlinky.workboxDashStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @js.native
  class CacheOnly ()
    extends typingsSlinky.workboxDashStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @js.native
  class NetworkFirst ()
    extends typingsSlinky.workboxDashStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @js.native
  class NetworkOnly ()
    extends typingsSlinky.workboxDashStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @js.native
  class StaleWhileRevalidate ()
    extends typingsSlinky.workboxDashStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
  
}

