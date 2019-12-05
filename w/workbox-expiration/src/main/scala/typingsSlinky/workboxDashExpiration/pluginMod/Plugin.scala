package typingsSlinky.workboxDashExpiration.pluginMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CacheDidUpdateCallback
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CacheDidUpdateCallbackParam
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CachedResponseWillBeUsedCallback
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-expiration/Plugin", "Plugin")
@js.native
class Plugin () extends WorkboxPlugin {
  def this(config: ExpirationPluginConfig) = this()
  @JSName("cacheDidUpdate")
  var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
  @JSName("cachedResponseWillBeUsed")
  var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
  @JSName("cacheDidUpdate")
  def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
  @JSName("cachedResponseWillBeUsed")
  def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
  def deleteCacheAndMetadata(): js.Promise[Unit] = js.native
}

