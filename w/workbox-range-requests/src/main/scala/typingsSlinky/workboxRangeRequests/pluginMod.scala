package typingsSlinky.workboxRangeRequests

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-range-requests/Plugin", "Plugin")
  @js.native
  class Plugin () extends WorkboxPlugin {
    
    @JSName("cachedResponseWillBeUsed")
    def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cachedResponseWillBeUsed")
    var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
  }
}
