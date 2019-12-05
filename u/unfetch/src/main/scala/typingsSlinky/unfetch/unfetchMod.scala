package typingsSlinky.unfetch

import org.scalajs.dom.experimental.Body
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unfetch", JSImport.Namespace)
@js.native
object unfetchMod extends js.Object {
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type IsomorphicBody = Body | typingsSlinky.nodeDashFetch.nodeDashFetchMod.Body
  type IsomorphicHeaders = Headers | typingsSlinky.nodeDashFetch.nodeDashFetchMod.Headers
  type IsomorphicRequest = Request | typingsSlinky.nodeDashFetch.nodeDashFetchMod.Request
  type IsomorphicResponse = Response | typingsSlinky.nodeDashFetch.nodeDashFetchMod.Response
}

