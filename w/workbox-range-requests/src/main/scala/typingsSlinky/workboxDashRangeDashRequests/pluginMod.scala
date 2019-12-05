package typingsSlinky.workboxDashRangeDashRequests

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CachedResponseWillBeUsedCallback
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typingsSlinky.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-range-requests/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin () extends WorkboxPlugin {
    @JSName("cachedResponseWillBeUsed")
    var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
    @JSName("cachedResponseWillBeUsed")
    def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
  }
  
}

