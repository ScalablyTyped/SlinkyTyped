package typingsSlinky.xhrDashMock

import typingsSlinky.xhrDashMock.libTypesMod.MockFunction
import typingsSlinky.xhrDashMock.libTypesMod.MockObject
import typingsSlinky.xhrDashMock.libXHRMockMod.XHRMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock", JSImport.Namespace)
@js.native
object xhrDashMockMod extends js.Object {
  @js.native
  class MockRequest ()
    extends typingsSlinky.xhrDashMock.libMockRequestMod.MockRequest
  
  @js.native
  class MockResponse ()
    extends typingsSlinky.xhrDashMock.libMockResponseMod.MockResponse
  
  val default: XHRMock = js.native
  def delay(mock: MockFunction): MockFunction = js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  def delay(mock: MockObject): MockFunction = js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
  def proxy(
    req: typingsSlinky.xhrDashMock.libMockRequestMod.default,
    res: typingsSlinky.xhrDashMock.libMockResponseMod.default
  ): js.Promise[typingsSlinky.xhrDashMock.libMockResponseMod.default] = js.native
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}

