package typingsSlinky.workboxCacheableResponse

import typingsSlinky.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-cacheable-response", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CacheableResponse ()
    extends typingsSlinky.workboxCacheableResponse.cacheableResponseMod.CacheableResponse {
    def this(config: CacheableResponseConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxCacheableResponse.pluginMod.Plugin {
    def this(config: CacheableResponseConfig) = this()
  }
}
