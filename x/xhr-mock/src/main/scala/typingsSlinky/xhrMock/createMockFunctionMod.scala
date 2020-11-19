package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.typesMod.Mock
import typingsSlinky.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/createMockFunction", JSImport.Namespace)
@js.native
object createMockFunctionMod extends js.Object {
  
  def default(method: String, url: String, mock: Mock): MockFunction = js.native
  def default(method: String, url: js.RegExp, mock: Mock): MockFunction = js.native
}
