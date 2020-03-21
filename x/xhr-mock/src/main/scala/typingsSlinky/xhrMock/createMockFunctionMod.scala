package typingsSlinky.xhrMock

import typingsSlinky.std.RegExp
import typingsSlinky.xhrMock.typesMod.Mock
import typingsSlinky.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/createMockFunction", JSImport.Namespace)
@js.native
object createMockFunctionMod extends js.Object {
  def default(method: String, url: String, mock: Mock): MockFunction = js.native
  def default(method: String, url: RegExp, mock: Mock): MockFunction = js.native
}

