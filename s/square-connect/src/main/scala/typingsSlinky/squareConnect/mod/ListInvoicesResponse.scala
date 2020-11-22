package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListInvoicesResponse")
@js.native
class ListInvoicesResponse () extends js.Object {
  
  /**
    * When a response is truncated, it includes a cursor that you can use in a subsequent request to fetch the next set of invoices.
    * If empty, this is the final response. For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The invoices retrieved.
    */
  var invoices: js.UndefOr[js.Array[Invoice]] = js.native
}
