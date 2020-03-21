package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.mockRequestMod.default
import typingsSlinky.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/handle", JSImport.Namespace)
@js.native
object handleMod extends js.Object {
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsSlinky.xhrMock.mockResponseMod.default
  ): js.Promise[typingsSlinky.xhrMock.mockResponseMod.default] = js.native
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsSlinky.xhrMock.mockResponseMod.default
  ): typingsSlinky.xhrMock.mockResponseMod.default = js.native
}

