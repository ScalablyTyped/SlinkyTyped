package typingsSlinky.workboxStrategies

import typingsSlinky.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typingsSlinky.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typingsSlinky.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typingsSlinky.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typingsSlinky.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CacheFirst ()
    extends typingsSlinky.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @js.native
  class CacheOnly ()
    extends typingsSlinky.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @js.native
  class NetworkFirst ()
    extends typingsSlinky.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @js.native
  class NetworkOnly ()
    extends typingsSlinky.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @js.native
  class StaleWhileRevalidate ()
    extends typingsSlinky.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
  
}

