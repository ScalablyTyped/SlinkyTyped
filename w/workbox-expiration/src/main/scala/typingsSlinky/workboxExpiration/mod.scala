package typingsSlinky.workboxExpiration

import typingsSlinky.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typingsSlinky.workboxExpiration.pluginMod.ExpirationPluginConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-expiration", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CacheExpiration protected ()
    extends typingsSlinky.workboxExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
}
