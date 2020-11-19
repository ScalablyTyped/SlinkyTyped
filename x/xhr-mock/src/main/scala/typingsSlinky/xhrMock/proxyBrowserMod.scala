package typingsSlinky.xhrMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/proxy.browser", JSImport.Namespace)
@js.native
object proxyBrowserMod extends js.Object {
  
  def default(
    req: typingsSlinky.xhrMock.mockRequestMod.default,
    res: typingsSlinky.xhrMock.mockResponseMod.default
  ): js.Promise[typingsSlinky.xhrMock.mockResponseMod.default] = js.native
}
