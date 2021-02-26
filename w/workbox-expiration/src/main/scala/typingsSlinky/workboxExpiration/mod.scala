package typingsSlinky.workboxExpiration

import typingsSlinky.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typingsSlinky.workboxExpiration.pluginMod.ExpirationPluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-expiration", "CacheExpiration")
  @js.native
  class CacheExpiration protected ()
    extends typingsSlinky.workboxExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @JSImport("workbox-expiration", "Plugin")
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
}
