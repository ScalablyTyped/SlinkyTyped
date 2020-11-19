package typingsSlinky.xhrMock

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/MockError", JSImport.Namespace)
@js.native
object mockErrorMod extends js.Object {
  
  @js.native
  class MockError protected () extends Error {
    def this(message: String) = this()
  }
}
