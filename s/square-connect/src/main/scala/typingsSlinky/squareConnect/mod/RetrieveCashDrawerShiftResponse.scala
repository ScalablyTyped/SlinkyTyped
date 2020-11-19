package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveCashDrawerShiftResponse")
@js.native
class RetrieveCashDrawerShiftResponse () extends js.Object {
  
  /**
    * The cash drawer shift queried for.
    */
  var cash_drawer_shift: js.UndefOr[CashDrawerShift] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
