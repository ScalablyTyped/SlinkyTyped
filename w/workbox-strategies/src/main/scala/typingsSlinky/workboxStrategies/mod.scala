package typingsSlinky.workboxStrategies

import typingsSlinky.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typingsSlinky.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typingsSlinky.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typingsSlinky.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typingsSlinky.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-strategies", "CacheFirst")
  @js.native
  class CacheFirst ()
    extends typingsSlinky.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @JSImport("workbox-strategies", "CacheOnly")
  @js.native
  class CacheOnly ()
    extends typingsSlinky.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @JSImport("workbox-strategies", "NetworkFirst")
  @js.native
  class NetworkFirst ()
    extends typingsSlinky.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @JSImport("workbox-strategies", "NetworkOnly")
  @js.native
  class NetworkOnly ()
    extends typingsSlinky.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @JSImport("workbox-strategies", "StaleWhileRevalidate")
  @js.native
  class StaleWhileRevalidate ()
    extends typingsSlinky.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
}
