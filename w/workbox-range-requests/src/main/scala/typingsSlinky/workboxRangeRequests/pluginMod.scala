package typingsSlinky.workboxRangeRequests

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
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

