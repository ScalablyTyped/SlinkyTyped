package typingsSlinky.workboxRangeRequests

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-range-requests", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxRangeRequests.pluginMod.Plugin
  
  def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
}

