package typingsSlinky.xhrMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/proxy", JSImport.Namespace)
@js.native
object proxyMod extends js.Object {
  def default(
    req: typingsSlinky.xhrMock.mockRequestMod.default,
    res: typingsSlinky.xhrMock.mockResponseMod.default
  ): js.Promise[typingsSlinky.xhrMock.mockResponseMod.default] = js.native
}

