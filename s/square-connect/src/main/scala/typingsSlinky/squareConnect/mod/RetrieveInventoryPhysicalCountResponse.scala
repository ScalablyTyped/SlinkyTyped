package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveInventoryPhysicalCountResponse")
@js.native
class RetrieveInventoryPhysicalCountResponse () extends js.Object {
  
  /**
    * The requested `InventoryPhysicalCount`.
    */
  var count: js.UndefOr[InventoryPhysicalCount] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
