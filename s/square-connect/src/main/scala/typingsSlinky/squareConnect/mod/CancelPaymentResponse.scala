package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelPaymentResponse")
@js.native
class CancelPaymentResponse () extends js.Object {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully canceled `Payment` object.
    */
  var payment: js.UndefOr[Payment] = js.native
}
