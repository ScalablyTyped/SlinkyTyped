package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.typesMod.MockFunction
import typingsSlinky.xhrMock.typesMod.MockObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/utils/sequence", JSImport.Namespace)
@js.native
object sequenceMod extends js.Object {
  
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}
