package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CompletePaymentResponse")
@js.native
class CompletePaymentResponse () extends js.Object {
  
  /**
    * Information on errors encountered during the request
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully completed `Payment`.
    */
  var payment: js.UndefOr[Payment] = js.native
}
