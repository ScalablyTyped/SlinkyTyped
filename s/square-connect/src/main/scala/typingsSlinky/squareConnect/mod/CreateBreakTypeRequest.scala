package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateBreakTypeRequest")
@js.native
class CreateBreakTypeRequest () extends js.Object {
  
  /**
    * The `BreakType` to be created.
    */
  var break_type: BreakType = js.native
  
  /**
    * Unique string value to insure idempotency of the operation.
    */
  var idempotency_key: js.UndefOr[String] = js.native
}
