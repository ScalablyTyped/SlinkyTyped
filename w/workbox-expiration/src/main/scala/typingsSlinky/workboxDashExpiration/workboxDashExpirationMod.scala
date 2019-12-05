package typingsSlinky.workboxDashExpiration

import typingsSlinky.workboxDashExpiration.cacheExpirationMod.CacheExpirationConfig
import typingsSlinky.workboxDashExpiration.pluginMod.ExpirationPluginConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-expiration", JSImport.Namespace)
@js.native
object workboxDashExpirationMod extends js.Object {
  @js.native
  class CacheExpiration protected ()
    extends typingsSlinky.workboxDashExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxDashExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
  
}

