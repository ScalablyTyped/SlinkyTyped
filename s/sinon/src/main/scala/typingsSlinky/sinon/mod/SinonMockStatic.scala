package typingsSlinky.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonMockStatic extends js.Object {
  
  def apply(): SinonExpectation = js.native
  /**
    * Creates a mock for the provided object.
    * Does not change the object, but returns a mock object to set expectations on the object’s methods.
    */
  def apply(obj: js.Any): SinonMock = js.native
}
