package typingsSlinky.workboxDashRangeDashRequests

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-range-requests", JSImport.Namespace)
@js.native
object workboxDashRangeDashRequestsMod extends js.Object {
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxDashRangeDashRequests.pluginMod.Plugin
  
  def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
}

