package typingsSlinky.zipkinInstrumentationFetch

import typingsSlinky.nodeFetch.mod.RequestInfo
import typingsSlinky.nodeFetch.mod.RequestInit
import typingsSlinky.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Typeoffetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

