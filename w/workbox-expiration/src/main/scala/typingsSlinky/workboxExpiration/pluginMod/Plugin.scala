package typingsSlinky.workboxExpiration.pluginMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxCore.workboxPluginMod.CacheDidUpdateCallback
import typingsSlinky.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam
import typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-expiration/Plugin", "Plugin")
@js.native
class Plugin () extends WorkboxPlugin {
  def this(config: ExpirationPluginConfig) = this()
  
  @JSName("cacheDidUpdate")
  def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
  @JSName("cacheDidUpdate")
  var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
  
  @JSName("cachedResponseWillBeUsed")
  def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
  @JSName("cachedResponseWillBeUsed")
  var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
  
  def deleteCacheAndMetadata(): js.Promise[Unit] = js.native
}
