package typingsSlinky.xhrDashMock

import typingsSlinky.xhrDashMock.libMockRequestMod.default
import typingsSlinky.xhrDashMock.libTypesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/handle", JSImport.Namespace)
@js.native
object libHandleMod extends js.Object {
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsSlinky.xhrDashMock.libMockResponseMod.default
  ): js.Promise[typingsSlinky.xhrDashMock.libMockResponseMod.default] = js.native
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsSlinky.xhrDashMock.libMockResponseMod.default
  ): typingsSlinky.xhrDashMock.libMockResponseMod.default = js.native
}

