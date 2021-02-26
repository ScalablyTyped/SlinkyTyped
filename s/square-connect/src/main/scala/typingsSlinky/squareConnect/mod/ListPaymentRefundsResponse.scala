package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListPaymentRefundsResponse")
@js.native
class ListPaymentRefundsResponse () extends StObject {
  
  /**
    * The pagination cursor to be used in a subsequent request. If empty, this is the final response.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The list of requested refunds.
    */
  var refunds: js.UndefOr[js.Array[PaymentRefund]] = js.native
}
