package typingsSlinky.workboxRangeRequests

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-range-requests", "Plugin")
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxRangeRequests.pluginMod.Plugin
  
  @JSImport("workbox-range-requests", "createPartialResponse")
  @js.native
  def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
}
