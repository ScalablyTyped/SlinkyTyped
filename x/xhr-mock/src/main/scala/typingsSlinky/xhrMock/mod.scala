package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.typesMod.MockFunction
import typingsSlinky.xhrMock.typesMod.MockObject
import typingsSlinky.xhrMock.xhrmockMod.XHRMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: XHRMock = js.native
  
  def delay(mock: MockFunction): MockFunction = js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  def delay(mock: MockObject): MockFunction = js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
  
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
  
  def proxy(
    req: typingsSlinky.xhrMock.mockRequestMod.default,
    res: typingsSlinky.xhrMock.mockResponseMod.default
  ): js.Promise[typingsSlinky.xhrMock.mockResponseMod.default] = js.native
  
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
  
  @js.native
  class MockRequest ()
    extends typingsSlinky.xhrMock.mockRequestMod.MockRequest
  
  @js.native
  class MockResponse ()
    extends typingsSlinky.xhrMock.mockResponseMod.MockResponse
}
